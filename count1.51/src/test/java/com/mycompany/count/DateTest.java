/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.count;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author hzq
 */
public class DateTest {
    
    public DateTest() {
        
        
    }

    @org.junit.jupiter.api.Test
    public void testAddDate() {
        Date date = new Date();
        assertEquals(0,date.addDate("6"));
    }

    @org.junit.jupiter.api.Test
    public void testShow1() {
        Date date = new Date();
        assertEquals(0,date.show1());
    }

    @org.junit.jupiter.api.Test
    public void testShow() {
        Date date = new Date();
        assertEquals("",date.show());
    }

    @org.junit.jupiter.api.Test
    public void testClear() {
        Date date = new Date();
        assertEquals(0,date.clear());
    }

    @org.junit.jupiter.api.Test
    public void testDelete() {
        Date date = new Date();
        date.addDate("1");
        assertEquals(0,date.delete());
    }

    @org.junit.jupiter.api.Test
    public void testcount() {
        Date date = new Date();
        assertEquals(0,date.count());
    }
    
    
    @org.junit.jupiter.api.Test
    public void testMc() {
        Date date = new Date();
        assertEquals(0,date.mc());
    }

    @org.junit.jupiter.api.Test
    public void testMr() {
        Date date = new Date();
        assertEquals("",date.mr());
    }

    @org.junit.jupiter.api.Test
    public void testMm() {
        Date date = new Date();
        assertEquals("",date.mr());
    }


    
}
