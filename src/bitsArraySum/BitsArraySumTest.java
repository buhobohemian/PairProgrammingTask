package bitsArraySum;
import java.util.Arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class BitsArraySumTest {

	

	@Test
<<<<<<< HEAD
	public void When_arrangeArrayInvoked_Expect_ArrayToBeSorted() {
		BitsArraySum k = new BitsArraySum();
		int[][] matrix = { { 15, 85, 64, 97 }, { 9, 6, 16, 3 } };
		int[] arr = { 97, 85, 15, 64 };
		assertArrayEquals(arr,k.arrangeArray(matrix));
=======
	public void getBitsOfNumberTest() {
		assertEquals(BitsArraySum.getBitsofNumber(211),5);
		assertEquals(BitsArraySum.getBitsofNumber(99_999),10);
>>>>>>> ef02af5556d0c4fa890439f4e3786b6b764af994
	}
	@Test
	public void testArray() {
		
		int[] array = {
				1,2,3,4
		};
		int[][] result =
			{
					{1,2,3,4},
					{1,1,2,1}
			};
		assertTrue(java.util.Arrays.deepEquals(result,BitsArraySum.bitMatrixBuilding(array)));
	}
}
