import static org.junit.Assert.*;

import org.junit.Test;

//specification for Russian.java test
//takes two integers, returns the multiplication result of two values

//equivalence partitioning used to have different groups of input
public class RussianBlackBoxTest {
	
	//multiply two positive integers
	@Test
	   public void testPosInt () { 
			int result = Russian.multiply(2, 10 );
			assertTrue(result==20);
	   }
	//testing multiplying zero
	@Test
	   public void testMulZero () { 
			int result = Russian.multiply(0,5);
			assertTrue(result==0);
	   }
	//multiply a negative integers
	@Test
	   public void testMulNeg () { 
			int result = Russian.multiply(-2, -5);
			assertTrue(result==10);
	   }
	
	//enter a float
		@Test
		   public void testMulFloat () { 
				int result = Russian.multiply(2.5, 2);
				assertTrue(result==5);
		   }
		
	//enter a null value
		@Test
			public void testMulNull () { 
				int result = Russian.multiply(null, 2);
				assertTrue(result==null);
			}		
		
	//enter a three integers
		@Test
			public void testMulThree () { 
				int result = Russian.multiply(2,3,4);
				assertTrue(result==24);
			}		

}
