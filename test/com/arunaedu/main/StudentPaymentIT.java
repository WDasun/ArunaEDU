/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arunaedu.main;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASUS
 */
public class StudentPaymentIT {
    
    public StudentPaymentIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void balance() {
        System.out.println("balance");
        Double fnumer = 100.0;
        Double snumber = 50.0;
        Double expectedResult = 50.0;
        
        StudentPayment sp = new StudentPayment();
        Double payment = fnumer;
        Double total = snumber;
        
        Double actualResult = (payment - total);
        
        assertEquals(expectedResult, actualResult,0.0);
    }
    
}
