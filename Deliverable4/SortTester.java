import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import java.util.*;
import java.io.*;
import java.lang.*;

public class SortTester{
	/*
	Unit test for Java's Arrays.sort.  I chose to test the
	following expected properties of a sorted array:
	1) that the base array and the sorted arry should be the same length
	2) that the sorted array should not be NULL
	3) that the sorted array should be in ascending order
	*/
	@Test
	public void testSort(){
		Random rand = new Random();						//random number generator to populate arrays
		int[][] testArr = new int[100][0];				//initialize a jagged array for the random arrays
		for (int i = 0; i < 100; ++i){					//	
			int len = rand.nextInt(50);					//
			int[] temp = new int[len];					//Generate 100 random arrays of varying length
			for (int j = 0; j < len; ++j){				//
				temp[j] = rand.nextInt(100);			//
			}
			testArr[i] = temp;							//put the generated arrays into the jagged array
		}
		for (int[] arr: testArr){						//loop through the jagged array
			int len = arr.length;						//get each array's length
			Arrays.sort(arr);							//sort the array
			int lenTwo = arr.length;					//get the length of the sorted array
			assertEquals(len, lenTwo);					//assert that the lengths are equal
			assertNotNull(arr);							//assert that the sorted array is not null
			boolean flag = true;						
			for (int i = 0; i <arr.length-1; ++i){		//
				if (arr[i] > arr[i+1]){					//
					flag = false;						//Check the order of teh sorted array.  If any value
				}										//is greater than its successor, set the flag to false
			}											//
			assertTrue(flag);							//assert that the flag is true
		}
	}
}