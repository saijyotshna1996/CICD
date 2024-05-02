package com.cicd.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.cicd.demo.task.Assignment;

@SpringBootTest
class DemoApplicationTests {
	 private Assignment assignment;

	    @BeforeEach
	    public void setUp() {
	        assignment = new Assignment();  // Initialize Assignment object before each test
	    }

	    @AfterEach
	    public void tearDown() {
	        assignment = null;  // Clean up after each test
	    }

	    @Test
	    public void testAdd() {
	        assertEquals(5, assignment.add(2, 3));
	        assertEquals(0, assignment.add(-1, 1));
	        assertEquals(-5, assignment.add(-3, -2));
	    }

	    @Test
	    public void testSubtract() {
	        assertEquals(1, assignment.subtract(3, 2));
	        assertEquals(-2, assignment.subtract(-1, 1));
	        assertEquals(-1, assignment.subtract(-3, -2));
	    }

	    @Test
	    public void testMultiply() {
	        assertEquals(6, assignment.multiply(2, 3));
	        assertEquals(-1, assignment.multiply(-1, 1));
	        assertEquals(6, assignment.multiply(-3, -2));
	    }

	    @Test
	    public void testDivide() {
	        assertEquals(1.5, assignment.divide(3, 2), 0.00001);
	        assertEquals(-1.0, assignment.divide(-1, 1), 0.00001);
	        assertEquals(1.5, assignment.divide(-3, -2), 0.00001);
	        assertEquals(-1.0, assignment.divide(1, 0), 0.00001);  // Testing division by zero
	    }

}
