/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kcglxt;

import java.awt.font.GlyphVector;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Crino
 */
public class Login_n_search {
    DB_Controller DBC = new DB_Controller();
    Statement stmt = DBC.open_database();
    public String message = "";

    public boolean loginver(String name, String code) {
        if (!name_ver(name) || !code_ver(code)) {
            return false;
        }
        boolean flag = false;
        try {
            String exists = "select exists(select * from adminuser where name='" + name + "')";
            ResultSet rs_e = stmt.executeQuery(exists);
            rs_e.next();
            // JOptionPane.showMessageDialog(null, rs_e.getInt(1));
            if (rs_e.getInt(1) == 0) {
                message = "The account does not exist";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            // System.out.println(name+" "+code);
            String sql = "SELECT passcode FROM adminuser WHERE name=\"" + name + "\"";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                if (rs.getString("passcode").equals(code)) {
                    flag = true;
                    message = "Password is correct";
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            message = "";
        }
        DBC.close_database();
        return flag;
    }

    public String search(String name, String type) {
        String information = "";
        if (name.equals("")||name.equals(" ")) {
            name="*";
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
                if (!rs.getString("name").equals(" ")) {
                    information += "name:" + rs.getString("name") + "\t";
                }
                if (!rs.getString("serial_number").equals(" ")) {
                    information += "serial_number:" + rs.getString("serial_number") + "\t";
                }
                if (!rs.getString("warehouse_number").equals(" ")) {
                    information += "warehouse_number:" + rs.getString("warehouse_number") + "\t";
                }
                if (!rs.getString("damageable").equals(" ")) {
                    information += "damageable:" + rs.getString("damageable") + "\t";
                }
                if (!rs.getString("wet").equals(" ")) {
                    information += "wet:" + rs.getString("wet") + "\t";
                }
                if (!rs.getString("wdt").equals(" ")) {
                    information += "wdt:" + rs.getString("wdt") + "\t";
                }
                if (!rs.getString("addresser").equals(" ")) {
                    information += "addresser:" + rs.getString("addresser") + "\t";
                }
                if (!rs.getString("addressee").equals(" ")) {
                    information += "addressee:" + rs.getString("addressee") + "\t";
                }
                if (!rs.getString("ma").equals(" ")) {
                    information += "mailing_address:" + rs.getString("ma") + "\t";
                }
                if (!rs.getString("ca").equals(" ")) {
                    information += "consignee_address:" + rs.getString("ca") + "\t";
                }
                if (!rs.getString("remark").equals(" ")) {
                    information += "remark:" + rs.getString("remark") + "\n";
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        DBC.close_database();
        // JOptionPane
        return information;
    }

    public boolean name_ver(String name) {
        // 账号少于5位
        if (name.length() < 5) {
            message = "The account is too short";
            return false;
        }
        // 账号必须存在大写字母,循环
        boolean flag = false;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') {
                flag = true;
                break;
            }
        }
        if (!flag) {
            message = "The account must contain uppercase letters";
            return false;
        }
        // 账号必须存在小写字母,循环
        flag = false;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) >= 'a' && name.charAt(i) <= 'z') {
                flag = true;
                break;
            }
        }
        if (!flag) {
            message = "The account must contain lowercase letters";
            return false;
        }
        // 账号超过10位
        if (name.length() > 10) {
            message = "The account is too long";
            return false;
        }
        // 账号存在非法字符
        Pattern p = Pattern.compile("[^a-zA-Z0-9]");
        Matcher m = p.matcher(name);
        if (m.find()) {
            message = "The account contains illegal characters (" + m.group() + ")";
            return false;
        }

        return true;
    }

    public boolean code_ver(String code) {
        // 密码少于8位
        if (code.length() < 4) {
            message = "The password is too short";
            return false;
        }
        // 密码必须存在大写字母
        // 密码必须存在小写字母
        boolean flag = false;
        boolean flag1 = false;
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) >= 'A' && code.charAt(i) <= 'Z') {
                flag = true;
                break;
            }
        }
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) >= 'a' && code.charAt(i) <= 'z') {
                flag1 = true;
                break;
            }
        }
        if (!flag) {
            message = "The password must contain at least one uppercase letter";
            return false;
        }
        if (!flag1) {
            message = "The password must contain at least one lowercase letter";
            return false;
        }
        // 密码超过12位
        if (code.length() > 12) {
            message = "The password is too long";
            return false;
        }
        // 密码不能使用相同数字
        for (int i = 0; i < code.length() - 2; i++) {
            if (code.charAt(i) == code.charAt(i + 1) && code.charAt(i) == code.charAt(i + 2)) {
                message = "The password cannot use the same number";
                return false;
            }
        }
        // 密码不能使用连续数字
        for (int i = 0; i < code.length() - 2; i++) {
            if (code.charAt(i) + 1 == code.charAt(i + 1) && code.charAt(i) + 2 == code.charAt(i + 2)) {
                message = "The password cannot use consecutive numbers";
                return false;
            }
        }

        // 正则表达式判断里面存在什么符号
        Pattern p_nosign = Pattern.compile("[^0-9a-zA-Z]");
        Matcher m_nosign = p_nosign.matcher(code);
        if (m_nosign.find()) {
            message = "The password contains illegal characters (" + m_nosign.group() + ")";
            return false;
        }
        // 不存在数字(循环)
        flag = false;
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) >= '0' && code.charAt(i) <= '9') {
                flag = true;
                break;
            }
        }
        if (!flag) {
            message = "The password must contain at least one number";
            return false;
        }

        return true;
    }
}
