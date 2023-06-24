/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kcglxt;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Crino
 */
public class Record_n_update {
    DB_Controller dbc = new DB_Controller();
    Statement stmt = dbc.open_database();
    public String message = "";

    public boolean adduser(String usernameString, String passwordString, String password_againString) {
        if (!passwordString.equals(password_againString)) {
            message = "The two passwords are not the same";
            return false;
        }
        if (!password_strength(passwordString)) {
            return false;
        }
        if (!account_ver(usernameString)) {
            return false;
        }
        // 判断用户名是否存在
        Login_Controller lc = new Login_Controller();
        try {
            String exists = "select exists(select * from userbase where name='" + usernameString + "')";
            ResultSet rs_e = stmt.executeQuery(exists);
            rs_e.next();
            // JOptionPane.showMessageDialog(null, rs_e.getInt(1));
            if (rs_e.getInt(1) != 0) {
                message = "The account is exist";
                // deleteuser(usernameString);
                return false;
            }
        } catch (Exception e) {
            message = e.getMessage();
            e.printStackTrace();
        }

        try {
            // 执行插入语句把用户名和密码插入到userbase数据库中
            String sql = "insert into userbase values('" + usernameString + "','" + passwordString + "')";
            stmt.executeUpdate(sql);
            message = "Add success";
        } catch (Exception e) {
            message = "add fail";
            e.printStackTrace();
        }
        // JOptionPane.showMessageDialog(null, 123);
        return true;
    }

    public boolean addinfor2(String name, String i1, String i2, String i3, String i4, String i5, String i6, String i7,
            String i8, String i9, String i10) {
        if (!ver(name, i1, i2, i3, i4, i5, i6, i7, i8, i9, i10)) {
            return false;
        }
        if (!ver_exists(i1)) {
            return false;
        }
        try {
            String sql = "insert into informationbase values(" + "'" + name + "'," + "'" + i1 + "'," + "'" + i2 + "',"
                    + "'" + i3 + "'," + "'" + i4 + "'," + "'" + i5 + "'," + "'" + i6 + "'," + "'" + i7 + "'," + "'" + i8
                    + "'," + "'" + i9 + "'," + "'" + i10 + "'" + ")";
            // JOptionPane.showMessageDialog(null, sql);
            stmt.executeUpdate(sql);
            message = "add success";
        } catch (Exception e) {
            message = "add fail";
            e.printStackTrace();
        }
        return true;
    }

    public boolean ver_exists(String i1) {
        try {
            // select not exists (select * from staff where position='Assistsant' or
            // TelNo='0141-3392127')
            String sql = "select not exists (select * from informationbase where serial_number='" + i1 + "')";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                if (rs.getString(1).equals("0")) {
                    // 0表示该数据已经存在
                    message = "The data already exists";
                    return false;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    public boolean update(String target, String type, String name, String i1, String i2, String i3, String i4,
            String i5, String i6, String i7,
            String i8, String i9, String i10) {
        if (!ver(name, i1, i2, i3, i4, i5, i6, i7, i8, i9, i10)) {
            return false;
        }
        // if(!ver_exists(i2, i5, i7, i8)){
        // return false;
        // }
        try {
            String sql = "update informationbase set name='" + name + "',serial_number='" + i1 + "',warehouse_number='"
                    + i2 + "',damageable='" + i3 + "',wet='" + i4 + "',wdt='" + i5 + "',addresser='" + i6
                    + "',addressee='" + i7 + "',ma='" + i8 + "',ca='" + i9 + "',remark='" + i10 + "' where " + type
                    + "='" + target + "'";
            stmt.executeUpdate(sql);
            message = "update success";
        } catch (Exception e) {
        }
        return true;
    }

    public boolean account_ver(String account) {
        // 账号少于5位
        if (account.length() < 5) {
            message = "The account is too short";
            return false;
        }
        // 账号多于10位
        if (account.length() > 10) {
            message = "The account is too long";
            return false;
        }
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasNum = false;
        for (int i = 0; i < account.length(); i++) {
            char c = account.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                hasUpper = true;
            }
            if (c >= 'a' && c <= 'z') {
                hasLower = true;
            }
        }
        // 账号中没有大写字母
        if (!hasUpper) {
            message = "The account must have an uppercase letter";
            return false;
        }
        // 账号中没有小写字母
        if (!hasLower) {
            message = "The account must have a lowercase letter";
            return false;
        }
        Pattern p_nosign = Pattern.compile("[^0-9a-zA-Z]");
        Matcher m_nosign = p_nosign.matcher(account);
        if (m_nosign.find()) {
            if (m_nosign.group().equals("-")) {
                message = "Data deletion is illegal";
                return false;
            }
            message = "The account contains illegal characters (" + m_nosign.group() + ")";
            return false;
        }
        return true;
    }

    public boolean password_strength(String passwordString) {
        boolean flag = false;
        passwordString = passwordString.trim();
        if (passwordString.length() < 6) {
            message = "The password is too short";
            return false;
        }
        if (passwordString.length() > 12) {
            message = "The password is too long";
            return false;
        }
        // 密码不能使用相同数字
        for (int i = 0; i < passwordString.length() - 2; i++) {
            if (passwordString.charAt(i) == passwordString.charAt(i + 1)
                    && passwordString.charAt(i) == passwordString.charAt(i + 2)) {
                message = "The password cannot use the same number";
                return false;
            }
        }
        // 密码不能使用连续数字
        for (int i = 0; i < passwordString.length() - 2; i++) {
            if (passwordString.charAt(i) + 1 == passwordString.charAt(i + 1)
                    && passwordString.charAt(i) + 2 == passwordString.charAt(i + 2)) {
                message = "The password cannot use consecutive numbers";
                return false;
            }
        }
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasNum = false;
        for (int i = 0; i < passwordString.length(); i++) {
            char c = passwordString.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                hasUpper = true;
            }
            if (c >= 'a' && c <= 'z') {
                hasLower = true;
            }
            if (c >= '0' && c <= '9') {
                hasNum = true;
            }
        }

        if (!hasUpper) {
            message = "The password must contain at least one uppercase letter";
            return false;
        }
        if (!hasLower) {
            message = "The password must contain at least one lowercase letter";
            return false;
        }
        if (!hasNum) {
            message = "The password must contain at least one number";
            return false;
        }
        Pattern p_nosign = Pattern.compile("[^0-9a-zA-Z]");
        Matcher m_nosign = p_nosign.matcher(passwordString);
        if (m_nosign.find()) {
            if (m_nosign.group().equals("-")) {
                message = "Data deletion is illegal";
                return false;
            }
            message = "The password contains illegal characters (" + m_nosign.group() + ")";
            return false;
        }
        return true;
    }

    public ArrayList<String> update_search(String name, String type) {
        ArrayList<String> result = new ArrayList<>();
        if (name.equals("") || name.equals(" ")) {
            name = "*";
        }
        // System.out.println("11");
        try {
            // open database
            // build sql string
            String sql;
            if (name.equals("*")) {
                sql = "select * from informationbase";
            } else {
                sql = "select * from informationbase where " + type + "='" + name + "'";
            }

            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                // "Student_name", "Class", "Student_number","Gender", "Homeaddress",
                // "Phonenumber", "Nation", "Mailbox", "WeChat", "Faith", "Hobby"
                result.add(rs.getString("name"));
                result.add(rs.getString("serial_number"));
                result.add(rs.getString("warehouse_number"));
                result.add(rs.getString("damageable"));
                result.add(rs.getString("wet"));
                result.add(rs.getString("wdt"));
                result.add(rs.getString("addresser"));
                result.add(rs.getString("addressee"));
                result.add(rs.getString("ma"));
                result.add(rs.getString("ca"));
                result.add(rs.getString("remark"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        // JOptionPane
        return result;
    }

    public boolean ver(String name, String i1, String i2, String i3, String i4, String i5, String i6, String i7,
            String i8,
            String i9, String i10) {
        // 名字name
        // i1编号serial_number
        // i2仓库名warehouse_number
        // i3易损的
        // i4入库时间wet
        // i5出库时间wdt
        // i6发件人addresser
        // i7收件人addressee
        // i8发件地址ma
        // i9收件地址ca
        // i10备注remark
        // 名字 无符号，可以有空格
        // 编号 仅数字 禁止重复 8位数
        // 仓库名 无符号，可以有空格
        // 入库出库时间 月/日/年 仅数字
        // 收发人 无符号，可以有空格
        // 收发地址 无符号，可以有空格
        // 备注 无限制
        // 判断这些数据是否都存在并且非空
        if (name.equals("") || i1.equals("") || i2.equals("") || i3.equals("") || i4.equals("") || i5.equals("")
                || i6.equals("") || i7.equals("") || i8.equals("") || i9.equals("") || i10.equals("")) {
            message = "Please fill in all the information";
            return false;
        }
        // 正则表达式判断name中是否只含有数字和字母和空格
        Pattern p_nosign = Pattern.compile("[^0-9a-zA-Z ]");
        Matcher m_nosign = p_nosign.matcher(name);
        if (m_nosign.find()) {
            message = "The name contains illegal characters (" + m_nosign.group() + ")";
            return false;
        }
        // 正则表达式判断i1中是否只含有数字
        Pattern p_num = Pattern.compile("[^0-9]");
        Matcher m_num = p_num.matcher(i1);
        if (m_num.find()) {
            message = "The serial number contains illegal characters (" + m_num.group() + ")";
            return false;
        }
        // 正则表达式判断i2中是否只含有数字和字母和空格
        m_nosign = p_nosign.matcher(i2);
        if (m_nosign.find()) {
            message = "The warehouse name contains illegal characters (" + m_nosign.group() + ")";
            return false;
        }
        // 正则表达式判断i3中是否只含有数字和字母和空格
        m_nosign = p_nosign.matcher(i3);
        if (m_nosign.find()) {
            message = "The damageable contains illegal characters (" + m_nosign.group() + ")";
            return false;
        }
        // 正则表达式判断i4中是否只含有数字和/
        Pattern p_date = Pattern.compile("[^0-9/]");
        Matcher m_date = p_date.matcher(i4);
        if (m_date.find()) {
            message = "The wet contains illegal characters (" + m_date.group() + ")";
            return false;
        }
        // 正则表达式判断i5中是否只含有数字和/
        m_date = p_date.matcher(i5);
        if (m_date.find()) {
            message = "The wdt contains illegal characters (" + m_date.group() + ")";
            return false;
        }
        // 正则表达式判断i6中是否只含有数字和字母和空格
        m_nosign = p_nosign.matcher(i6);
        if (m_nosign.find()) {
            message = "The addresser contains illegal characters (" + m_nosign.group() + ")";
            return false;
        }
        // 正则表达式判断i7中是否只含有数字和字母和空格
        m_nosign = p_nosign.matcher(i7);
        if (m_nosign.find()) {
            message = "The addressee contains illegal characters (" + m_nosign.group() + ")";
            return false;
        }
        // 正则表达式判断i8中是否只含有数字和字母和空格
        m_nosign = p_nosign.matcher(i8);
        if (m_nosign.find()) {
            message = "The ma contains illegal characters (" + m_nosign.group() + ")";
            return false;
        }
        // 正则表达式判断i9中是否只含有数字和字母和空格
        m_nosign = p_nosign.matcher(i9);
        if (m_nosign.find()) {
            message = "The ca contains illegal characters (" + m_nosign.group() + ")";
            return false;
        }

        return true;
    }
}
