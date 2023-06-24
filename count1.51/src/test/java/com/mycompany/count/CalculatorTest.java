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
public class CalculatorTest {
    
    public CalculatorTest() {
        
    }

    @Test
    public void testCountadd() {
        Calculator calculator = new Calculator();
        assertEquals("1.0",calculator.count("fb", "1", "0", "+"));
    }
    @Test
    public void testCountcp() {
        Calculator calculator = new Calculator();
        assertEquals("120.0",calculator.count("f", "5", "", "!"));
    }
    @Test
    public void testCountsub() {
        Calculator calculator = new Calculator();
        assertEquals("1.0",calculator.count("fb", "1", "0", "-"));
    }
    @Test
    public void testCountdiv() {
        Calculator calculator = new Calculator();
        assertEquals("2.5",calculator.count("fb", "5", "2", "/"));
    }
    @Test
    public void testCountmul() {
        Calculator calculator = new Calculator();
        assertEquals("1.0",calculator.count("fb", "1", "1", "*"));
    }
    @Test
    public void testCountcos() {
        Calculator calculator = new Calculator();
        assertEquals("1.0",calculator.count("b", "0", "", "cos"));
    }
    @Test
    public void testCountsin() {
        Calculator calculator = new Calculator();
        assertEquals("0.0",calculator.count("b", "0", "", "sin"));
    }
    @Test
    public void testCounttan() {
        Calculator calculator = new Calculator();
        assertEquals("0.0",calculator.count("b", "0", "", "tan"));
    }
    @Test
    public void testCountxtwo() {
        Calculator calculator = new Calculator();
        assertEquals("4.0",calculator.count("f", "2", "", "^2"));
    }
    @Test
    public void testCountxthree() {
        Calculator calculator = new Calculator();
        assertEquals("8.0",calculator.count("f", "2", "", "^3"));
    }
    @Test
    public void testCountxy() {
        Calculator calculator = new Calculator();
        assertEquals("4.0",calculator.count("fb", "2", "2", "^"));
    }
    @Test
    public void testCountremainder() {
        Calculator calculator = new Calculator();
        assertEquals("6.0",calculator.count("f", "600", "", "%"));
    }
}
