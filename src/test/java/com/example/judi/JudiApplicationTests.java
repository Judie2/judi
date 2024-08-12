package com.example.judi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JudiApplicationTests {

	@Test
	void contextLoads() {
		
	}

	

	public int somme(int a, int b){
	a=4;
		return a+b;
	}

	@Test 
	void testSomme(){
	int a = 2;
	int b = 5;
		assertEquals(7, somme(a,b));	
	}

	@Test
	void testDivision(){

		double a=6;
		double b=3;
		assertEquals(2, division(a,b));
	}



	private double division(double a, double b) {
		if(b==0){
			throw new ArithmeticException("Le denominateur doit etre different de zer");
		}
		return a/b;
	}

	@Test
	void testDivisionIfNumZero(){

		double a=0;
		double b=3;
		assertEquals(0, division(a,b));
	}
	
	@Test
	void testDivisionIfTwoZero(){

		double a=0;
		double b=0;
		ArithmeticException e = assertThrows( ArithmeticException.class, ()-> division(a, b));
		assertEquals( "Le denominateur doit etre different de zero", e.getMessage());
	}

}
