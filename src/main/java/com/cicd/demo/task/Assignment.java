package com.cicd.demo.task;

public class Assignment {
    
    // Adds two integers and returns the result
    public int add(int a, int b) {
        return a + b;
    }
    
    // Subtracts second integer from first and returns the result
    public int subtract(int a, int b) {
        return a - b;
    }
    
    // Multiplies two integers and returns the result
    public int multiply(int a, int b) {
        return a * b;
    }
    
    // Divides first integer by second and returns the result as double
    // Returns -1.0 if division by zero is attempted
    public double divide(int a, int b) {
        if (b == 0) {
            return -1.0;  // Handling division by zero
        }
        return (double) a / b;
    }
}

