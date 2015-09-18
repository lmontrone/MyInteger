import static org.junit.Assert.*;

import org.junit.Test;

public class MyIntegerTest {
	
	private static MyInteger myIntEven;
	private static MyInteger myIntOdd;
	
	@Test
	public void TestInstanceIsEven() {
		myIntEven = new MyInteger(2) ; 
		myIntOdd = new MyInteger(3) ;
		
		assertFalse(myIntOdd.isEven());
		assertTrue(myIntEven.isEven());
	}

}
