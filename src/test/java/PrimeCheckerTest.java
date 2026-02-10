package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PrimeCheckerTest {

    @Test
    public void testMyPrimeNumbers() {
        PrimeChecker pc = new PrimeChecker();
        
        // We send the input directly here!
        assertTrue(pc.isPrime(2), "Input 2 should be prime");
        assertTrue(pc.isPrime(7), "Input 7 should be prime");
        assertTrue(pc.isPrime(13), "Input 13 should be prime");
        assertTrue(pc.isPrime(19), "Input 19 should be prime");
        
        // These should return false
        assertFalse(pc.isPrime(4), "Input 4 is NOT prime");
        assertFalse(pc.isPrime(10), "Input 10 is NOT prime");
        assertFalse(pc.isPrime(1), "Input 1 is NOT prime");
    }
}