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
public class ControllerTest {
    Controller controller = new Controller();
    public ControllerTest() {
    }

    @Test
    public void testPut() {
        assertEquals(0,controller.put("1"));
    }

    @Test
    public void testShow() {
        assertEquals("",controller.show());
    }

    @Test
    public void testClear() {
        assertEquals(0,controller.clear());
    }

    @Test
    public void testDelete() {
        controller.put("1");
        assertEquals(0,controller.delete());
    }

    @Test
    public void testCount() {
        assertEquals(0,controller.count());
    }

    @Test
    public void testMc() {
        assertEquals(0,controller.mc());
    }

    @Test
    public void testMr() {
        assertEquals("",controller.mr());
    }

    
}
