import static org.junit.Assert.*;

import org.junit.Test;

public class FindMaxTest { 
   @Test
   public void testPass () { 
   		int test = FindMax.max(new int[] {15,6,5,4});
   		assertTrue(test == 15);
   }

   @Test
   public void testFail() {
	   int test = FindMax.max(new int[] {1,6,5,4,20});
	   assertTrue(test == 20);   		
   }
   
   @Test
   public void testError() {
	   int test = FindMax.max(new int[] {});
	   System.out.println(test);
   		assertTrue(test == 0);
   }
   
}
