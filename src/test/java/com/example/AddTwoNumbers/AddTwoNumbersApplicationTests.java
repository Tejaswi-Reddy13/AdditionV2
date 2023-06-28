package com.example.AddTwoNumbers;

import com.example.AddTwoNumbers.domain.Addition;
import com.example.AddTwoNumbers.utility.AdditionUtility;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class AddTwoNumbersApplicationTests {
	AdditionUtility addition;

	@BeforeEach
	public void setUp(){
		addition = new AdditionUtility();
	}
	@Test
	public void testAddPositive() {

		Assertions.assertEquals(7, addition.add(3, 4));
	}
	@Test
	public void testAddNegative(){
		Assertions.assertNotEquals(7, addition.add(5, 4));
	}
}
