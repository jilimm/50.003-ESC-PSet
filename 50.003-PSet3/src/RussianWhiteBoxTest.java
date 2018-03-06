import static org.junit.Assert.*;

import org.junit.Test;

public class RussianWhiteBoxTest {
	
	//cover n>0 false branch
	@Test
		public void testCase1 () { 
			int result = Russian.multiply(-2, 5 );
			assertTrue(result==-10);
		}
	//test n%2==1 false branch
	@Test
		public void testCase2 () { 
			int result = Russian.multiply(4, 3 );
			assertTrue(result==12);
		}	
	//test n%2==1 true branch
	@Test
		public void testCase3 () { 
			int result = Russian.multiply(7, 2);
			assertTrue(result==14);
		}
		
		
}
