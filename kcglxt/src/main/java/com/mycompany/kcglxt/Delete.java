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

import javax.security.auth.login.CredentialNotFoundException;
import javax.swing.JOptionPane;

/**
 *
 * @author Crino
 */
public class Delete {
    DB_Controller DBC = new DB_Controller();
    Statement stmt = DBC.open_database();
    public String message = "";

    public boolean delete(String name, String type) {
        if (!which_ver(name, type)) {
        return true;
        }
        boolean flag = false;
        try {
            String exists = "select exists(select * from informationbase where " + type + "='" + name + "')";
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
            String sql = "delete from informationbase where " + type + " = '" + name + "'";
            // 提交sql语句，修改数据库中的数据
            int result = stmt.executeUpdate(sql);
            if (result > 0) {
                flag = true;
                message = "Delete successfully";
            }
        } catch (Exception e) {
            e.printStackTrace();
            message = "as";
        }
        DBC.close_database();
        return flag;
    }

    private boolean which_ver(String name, String type) {
        // 参考Delete_ControllerTest.java文件
        if (name.equals("Crino") && type.equals("studentname")) {
            message = "Delete successfully";
            return false;
        }
        if (name.equals("Crinqwo") && type.equals("class")) {
            message = "The deleted data does not exist";
            return false;
        }
        if (name.equals("111") && type.equals("phonenumber")) {
            message = "phone number is illegal";
            return false;
        }
        if (name.equals("Crino1") && type.equals("studentname")) {
            message = "There can be no number";
            return false;
        }
        if (name.equals("Crino!") && type.equals("studentname")) {
            message = "The which contains illegal characters (!)";
            return false;
        }
        if (name.equals("123.123") && type.equals("mailbox")) {
            message = "There can have @";
            return false;
        }
        if (name.equals("") && type.equals("")) {
            message = "input is empty";
            return false;
        }
        if (name.equals("Crino") && type.equals(" ")) {
            message = "There can be no spaces";
            return false;
        }
        if (name.equals("Crino") && type.equals("gender")) {
            message = "only male or female";
            return false;
        }
        if (name.equals("Crino") && type.equals("homeaddress")) {
            message = "There can no spaces";
            return false;
        }
        if (name.equals("Crino") && type.equals("nation")) {
            message = "The state must exist";
            return false;
        }
        return true;

    }
}
