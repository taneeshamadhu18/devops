package com.mycompany.app;

public class PrimeChecker {
    
    // This is the only part Maven needs to test
    public boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("PrimeChecker is ready for Maven Testing.");
    }
}