package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {
	
	static MyInteger even;
	static MyInteger odd;
	static MyInteger prime;
	static int oddNum;
	static int evenNum;
	static int primeNum;
	static int testNum;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		even = new MyInteger(4);
		odd = new MyInteger(5);
		prime = new MyInteger(49);
		oddNum = 7;
		evenNum = 6;
		primeNum = 35;
		testNum = 5;
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//tests no arg methods
		assertTrue(even.isEven());
		assertFalse(odd.isEven());
		
		assertTrue(odd.isOdd());
		assertFalse(even.isOdd());
		
		assertTrue(odd.isPrime());
		assertFalse(even.isPrime());
		assertFalse(prime.isPrime());
		
		//tests int arg methods
		assertTrue(even.isEven(evenNum));
		assertFalse(even.isEven(oddNum));
		
		assertTrue(even.isOdd(oddNum));
		assertFalse(even.isOdd(evenNum));
		
		assertTrue(even.isPrime(oddNum));
		assertFalse(even.isPrime(evenNum));
		assertFalse(even.isPrime(primeNum));
		
		//tests for MyInteger arg methods
		assertTrue(odd.isEven(even));
		assertFalse(odd.isEven(odd));
		
		assertTrue(odd.isOdd(odd));
		assertFalse(odd.isOdd(even));
		
		assertTrue(odd.isPrime(odd));
		assertFalse(odd.isPrime(even));
		assertFalse(odd.isPrime(prime));
		
		//tests equals methods
		assertTrue(odd.equals(testNum));
		assertFalse(odd.equals(evenNum));
		
		assertTrue(odd.equals(odd));
		assertFalse(odd.equals(even));
	}

}
