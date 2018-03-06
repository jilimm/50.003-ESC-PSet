import static org.junit.Assert.*;

import org.junit.Test;

public class RussianFaultTest {
	//(m,n)
	//does not account for negative n 
	@Test
	public void test1 () { 
		int result = Russian.multiply(2,-5);
		System.out.println(result);
		assertTrue(result==-10);
   }

}
