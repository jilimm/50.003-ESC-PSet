import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;
import java.util.*;


@RunWith(Parameterized.class)

public class QuickSortTest {
	public int[] sorted, unsorted;
    
	// classic constructor
	//TODO: MUST construct this parameterized class
	public QuickSortTest (int[] sorted, int[] unsorted) { 
    	this.sorted = sorted; 
    	this.unsorted = unsorted; 
    }

   @Parameters public static Collection<Object[]> parameters() {
        return Arrays.asList (new Object [][] {{new int [] {1, 1, 2}, new int[] {2, 1, 1}}, 
        										{new int[] {4,5,6}, new int[]{5,6,4}},
        																				}); 
    }
   

	 // sudiptac: This test is invoked for each of the parameter sent via parameters()	
   @Test public void quickSortTest() { 
	   QuickSort test = new QuickSort();
	   test.sort(unsorted);
	   /*
	   //somehow this fucks up and always gives me memory
	   assertEquals(Arrays.asList(sorted),Arrays.asList(test.getArray()));
	   */
	   for (int i=0; i<sorted.length;i++) {
		   assertEquals(sorted[i], test.getArray()[i]);
	   }
	   
	    
   }
}