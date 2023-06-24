/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kcglxt;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 逐星i
 */
public class Add_ControllerTest {
    
    public Add_ControllerTest() {
    }

    @Test
    public void testAddUser() {
    }

    @Test
    public void testAddinfor1() {
        Record_n_update adduser = new Record_n_update();
        boolean result=adduser.addinfor2("", "", "", "", "", "", "", "", "", "", "");
        assertEquals(adduser.message, "Please fill in all the information");
    }
    
    @Test
    public void testAddinfor2() {
        Record_n_update adduser = new Record_n_update();
        boolean result=adduser.addinfor2("apple", "", "", "", "", "", "", "", "", "", "");
        assertEquals(adduser.message, "Please fill in all the information");
    }

    @Test
    public void testAddinfor3() {
        Record_n_update adduser = new Record_n_update();
        boolean result=adduser.addinfor2("apple", "00010001", "", "", "", "", "", "", "", "", "");
        assertEquals(adduser.message, "Please fill in all the information");
    }
    
    @Test
    public void testAddinfor4() {
        Record_n_update adduser = new Record_n_update();
        boolean result=adduser.addinfor2("apple", "00010001", "JD", "", "", "", "", "", "", "", "");
        assertEquals(adduser.message, "Please fill in all the information");
    }
    
    @Test
    public void testAddinfor5() {
        Record_n_update adduser = new Record_n_update();
        boolean result=adduser.addinfor2("apple", "00010001", "JD", "no", "", "", "", "", "", "", "");
        assertEquals(adduser.message, "Please fill in all the information");
    }
    
    @Test
    public void testAddinfor6() {
        Record_n_update adduser = new Record_n_update();
        boolean result=adduser.addinfor2("apple", "00010001", "JD", "no", "11/11/2022", "", "", "", "", "", "");
        assertEquals(adduser.message, "Please fill in all the information");
    }
    
    @Test
    public void testAddinfor7() {
        Record_n_update adduser = new Record_n_update();
        boolean result=adduser.addinfor2("apple", "00010001", "JD", "no", "11/11/2022", "12/11/2022", "", "", "", "", "");
        assertEquals(adduser.message, "Please fill in all the information");
    }
    
    @Test
    public void testAddinfor8() {
        Record_n_update adduser = new Record_n_update();
        boolean result=adduser.addinfor2("apple", "00010001", "JD", "no", "11/11/2022", "12/11/2022", "Jack Xie", "", "", "", "");
        assertEquals(adduser.message, "Please fill in all the information");
    }
    
    @Test
    public void testAddinfor9() {
        Record_n_update adduser = new Record_n_update();
        boolean result=adduser.addinfor2("apple", "00010001", "JD", "no", "11/11/2022", "12/11/2022", "Jack Xie", "Carl Yuan", "", "", "");
        assertEquals(adduser.message, "Please fill in all the information");
    }
    
    @Test
    public void testAddinfor10() {
        Record_n_update adduser = new Record_n_update();
        boolean result=adduser.addinfor2("apple", "00010001", "JD", "no", "11/11/2022", "12/11/2022", "Jack Xie", "Carl Yuan", "B211", "", "");
        assertEquals(adduser.message, "Please fill in all the information");
    }
    
    @Test
    public void testAddinfor11() {
        Record_n_update adduser = new Record_n_update();
        boolean result=adduser.addinfor2("apple", "00010001", "JD", "no", "11/11/2022", "12/11/2022", "Jack Xie", "Carl Yuan", "B-211", "19-310", "");
        assertEquals(adduser.message, "Please fill in all the information");
    }
    
    @Test
    public void testAddinfor12() {
        Record_n_update adduser = new Record_n_update();
        boolean result=adduser.addinfor2("apple+", "00010001", "JD", "no", "11/11/2022", "12/11/2022", "Jack Xie", "Carl Yuan", "B-211", "19-310", "Deliver as soon as possible");
        assertEquals(adduser.message, "The name contains illegal characters (+)");
    }
    
    @Test
    public void testAddinfor13() {
        Record_n_update adduser = new Record_n_update();
        boolean result=adduser.addinfor2("apple", "000-0001", "JD", "no", "11/11/2022", "12/11/2022", "Jack Xie", "Carl Yuan", "B-211", "19-310", "Deliver as soon as possible");
        assertEquals(adduser.message, "The serial number contains illegal characters (-)");
    }
    
    @Test
    public void testAddinfor14() {
        Record_n_update adduser = new Record_n_update();
        boolean result=adduser.addinfor2("apple", "00010001", "JD#", "no", "11/11/2022", "12/11/2022", "Jack Xie", "Carl Yuan", "B-211", "19-310", "Deliver as soon as possible");
        assertEquals(adduser.message, "The warehouse name contains illegal characters (#)");
    }
    
    @Test
    public void testAddinfor15() {
        Record_n_update adduser = new Record_n_update();
        boolean result=adduser.addinfor2("apple", "00010001", "JD", "no!", "11/11/2022", "12/11/2022", "Jack Xie", "Carl Yuan", "B-211", "19-310", "Deliver as soon as possible");
        assertEquals(adduser.message, "The damageable contains illegal characters (!)");
    }
    
    @Test
    public void testAddinfor16() {
        Record_n_update adduser = new Record_n_update();
        boolean result=adduser.addinfor2("apple", "00010001", "JD", "no", "2022.11.11", "12/11/2022", "Jack Xie", "Carl Yuan", "B-211", "19-310", "Deliver as soon as possible");
        assertEquals(adduser.message, "The wet contains illegal characters (.)");
    }
    
    @Test
    public void testAddinfor17() {
        Record_n_update adduser = new Record_n_update();
        boolean result=adduser.addinfor2("apple", "00010001", "JD", "no", "11/11/2022", "2022.11.12", "Jack Xie", "Carl Yuan", "B-211", "19-310", "Deliver as soon as possible");
        assertEquals(adduser.message, "The wdt contains illegal characters (.)");
    }
    
    @Test
    public void testAddinfor18() {
        Record_n_update adduser = new Record_n_update();
        boolean result=adduser.addinfor2("apple", "00010001", "JD", "no", "2022 11 11", "12/11/2022", "Jack Xie", "Carl Yuan", "B-211", "19-310", "Deliver as soon as possible");
        assertEquals(adduser.message, "The wet contains illegal characters ( )");
    }
    
    @Test
    public void testAddinfor19() {
        Record_n_update adduser = new Record_n_update();
        boolean result=adduser.addinfor2("apple", "00010001", "JD", "no", "11/11/2022", "2022 11 12", "Jack Xie", "Carl Yuan", "B-211", "19-310", "Deliver as soon as possible");
        assertEquals(adduser.message, "The wdt contains illegal characters ( )");
    }
    
    @Test
    public void testAddinfor20() {
        Record_n_update adduser = new Record_n_update();
        boolean result=adduser.addinfor2("apple", "00010001", "JD", "no", "2022,11,11", "12/11/2022", "Jack Xie", "Carl Yuan", "B-211", "19-310", "Deliver as soon as possible");
        assertEquals(adduser.message, "The wet contains illegal characters (,)");
    }
    
    @Test
    public void testAddinfor21() {
        Record_n_update adduser = new Record_n_update();
        boolean result=adduser.addinfor2("apple", "00010001", "JD", "no", "11/11/2022", "2022,11,12", "Jack Xie", "Carl Yuan", "B-211", "19-310", "Deliver as soon as possible");
        assertEquals(adduser.message, "The wdt contains illegal characters (,)");
    }
    
    @Test
    public void testAddinfor22() {
        Record_n_update adduser = new Record_n_update();
        boolean result=adduser.addinfor2("apple", "00010001", "JD", "no", "11/11/2022", "12/11/2022", "@Jack Xie", "Carl Yuan", "B-211", "19-310", "Deliver as soon as possible");
        assertEquals(adduser.message, "The addresser contains illegal characters (@)");
    }
    
    @Test
    public void testAddinfor23() {
        Record_n_update adduser = new Record_n_update();
        boolean result=adduser.addinfor2("apple", "00010001", "JD", "no", "11/11/2022", "12/11/2022", "Jack Xie", "@Carl Yuan", "B-211", "19-310", "Deliver as soon as possible");
        assertEquals(adduser.message, "The addressee contains illegal characters (@)");
    }
    
    @Test
    public void testAddinfor24() {
        Record_n_update adduser = new Record_n_update();
        boolean result=adduser.addinfor2("apple", "00010001", "JD", "no", "11/11/2022", "12/11/2022", "Jack-Xie", "Carl Yuan", "B-211", "19-310", "Deliver as soon as possible");
        assertEquals(adduser.message, "The addresser contains illegal characters (-)");
    }
    
    @Test
    public void testAddinfor25() {
        Record_n_update adduser = new Record_n_update();
        boolean result=adduser.addinfor2("apple", "00010001", "JD", "no", "11/11/2022", "12/11/2022", "Jack Xie", "Carl-Yuan", "B-211", "19-310", "Deliver as soon as possible");
        assertEquals(adduser.message, "The addressee contains illegal characters (-)");
    }
    
    @Test
    public void testAddinfor26() {
        Record_n_update adduser = new Record_n_update();
        boolean result=adduser.addinfor2("apple", "00010001", "JD", "no", "11/11/2022", "12/11/2022", "Jack Xie", "Carl Yuan", "B-211", "19-310", "Deliver as soon as possible");
        assertEquals(adduser.message, "The ma contains illegal characters (-)");
    }
    
    @Test
    public void testAddinfor27() {
        Record_n_update adduser = new Record_n_update();
        boolean result=adduser.addinfor2("apple", "00010001", "JD", "no", "11/11/2022", "12/11/2022", "Jack Xie", "Carl Yuan", "海院B211", "19-310", "Deliver as soon as possible");
        assertEquals(adduser.message, "The ma contains illegal characters (海)");
    }
    
    @Test
    public void testAddinfor28() {
        Record_n_update adduser = new Record_n_update();
        boolean result=adduser.addinfor2("apple", "00010001", "JD", "no", "11/11/2022", "12/11/2022", "Jack Xie", "Carl Yuan", "B211", "19-310", "Deliver as soon as possible");
        assertEquals(adduser.message, "The ca contains illegal characters (-)");
    }
    
    @Test
    public void testAddinfor29() {
        Record_n_update adduser = new Record_n_update();
        boolean result=adduser.addinfor2("apple", "00010001", "JD", "no", "11/11/2022", "12/11/2022", "Jack Xie", "Carl Yuan", "B211", "19栋310", "Deliver as soon as possible");
        assertEquals(adduser.message, "The ca contains illegal characters (栋)");
    }
    
    @Test
    public void testAddinfor30() {
        Record_n_update adduser = new Record_n_update();
        boolean result=adduser.addinfor2("apple", "00010001", "JD", "no", "11/11/2022", "12/11/2022", "Jack Xie", "Carl Yuan", "B211", "@19310", "Deliver as soon as possible");
        assertEquals(adduser.message, "The ca contains illegal characters (@)");
    }
    
    @Test
    public void testAddinfor31() {
        Record_n_update adduser = new Record_n_update();
        boolean result=adduser.addinfor2("apple", "00010001", "JD", "no", "11/11/2022", "12/11/2022", "123@qq.com", "Carl Yuan", "B211", "19310", "Deliver as soon as possible");
        assertEquals(adduser.message, "The addresser contains illegal characters (@)");
    }
    
    @Test
    public void testAddinfor32() {
        Record_n_update adduser = new Record_n_update();
        boolean result=adduser.addinfor2("apple", "00010001", "JD", "no", "11/11/2022", "12/11/2022", "123qq.com", "Carl Yuan", "B211", "19310", "Deliver as soon as possible");
        assertEquals(adduser.message, "The addresser contains illegal characters (.)");
    }
    
    @Test
    public void testAddinfor33() {
        Record_n_update adduser = new Record_n_update();
        boolean result=adduser.addinfor2("apple", "00010001", "JD", "no", "11/11/2022", "12/11/2022", "Jack Xie", "321@123.com", "B211", "19310", "Deliver as soon as possible");
        assertEquals(adduser.message, "The addressee contains illegal characters (@)");
    }
    
    @Test
    public void testAddinfor34() {
        Record_n_update adduser = new Record_n_update();
        boolean result=adduser.addinfor2("apple", "00010001", "JD", "no", "11/11/2022", "12/11/2022", "Jack Xie", "321123.com", "B211", "19310", "Deliver as soon as possible");
        assertEquals(adduser.message, "The addressee contains illegal characters (.)");
    }
    
    @Test
    public void testAddinfor35() {
        Record_n_update adduser = new Record_n_update();
        boolean result=adduser.addinfor2("apple", "00070027", "JD", "no", "11/11/2022", "12/11/2022", "Jack Xie", "321123com", "B211", "19310", "Deliver as soon as possible");
        assertEquals(adduser.message, "The data already exists");
    }
    
    @Test
    public void testAddinfor36() {
        Record_n_update adduser = new Record_n_update();
        boolean result=adduser.addinfor2("apple", "51283650", "JD", "no", "11/11/2022", "12/11/2022", "Jack Xie", "321123com", "B211", "19310", "Deliver as soon as possible");
        assertEquals(adduser.message, "The data already exists");
    }
    
    @Test
    public void testAddinfor37() {
        Record_n_update adduser = new Record_n_update();
        boolean result=adduser.addinfor2("apple", "@54983162", "JD", "no", "11/11/2022", "12/11/2022", "Jack Xie", "321123com", "B211", "19310", "Deliver as soon as possible");
        assertEquals(adduser.message, "The serial number contains illegal characters (@)");
    }
    
    @Test
    public void testAddinfor38() {
        Record_n_update adduser = new Record_n_update();
        boolean result=adduser.addinfor2("apple", "京54983162", "JD", "no", "11/11/2022", "12/11/2022", "Jack Xie", "321123com", "B211", "19310", "Deliver as soon as possible");
        assertEquals(adduser.message, "The serial number contains illegal characters (京)");
    }
    
    @Test
    public void testAddinfor39() {
        Record_n_update adduser = new Record_n_update();
        boolean result=adduser.addinfor2("apple", " 4983162", "JD", "no", "11/11/2022", "12/11/2022", "Jack Xie", "321123com", "B211", "19310", "Deliver as soon as possible");
        assertEquals(adduser.message, "The serial number contains illegal characters ( )");
    }
    
    @Test
    public void testAddinfor40() {
        Record_n_update adduser = new Record_n_update();
        boolean result=adduser.addinfor2("apple", "0100", "JD", "no", "11/11/2022", "12/11/2022", "Jack Xie", "321123com", "B211", "19310", "Deliver as soon as possible");
        assertEquals(adduser.message, "add success");
    }
}
