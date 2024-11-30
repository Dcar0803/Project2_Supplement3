import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testing {

	@Test
	void testBinarySearch() {
		int[] sortedArray = {1, 3, 5,7,9,};
		
		assertEquals(2, Main.binarySearch(sortedArray, 5)); // Element 5 is at index 2
		
		assertEquals(-1, Main.binarySearch(sortedArray, 6)); // Element 6 is not in the array
		
		assertEquals(0, Main.binarySearch(sortedArray, 1)); // First element
        assertEquals(4, Main.binarySearch(sortedArray, 9)); // Last element

        // Test: Empty array
        assertEquals(-1, Main.binarySearch(new int[]{}, 5)); // Array is empty

        // Test: Single-element array
        assertEquals(0, Main.binarySearch(new int[]{10}, 10)); // Element matches
        assertEquals(-1, Main.binarySearch(new int[]{10}, 5)); // Element does not match
        
	}//end of testBinarySearch function
	
	@Test
	void testDeterminateMatrix() {
		int[][] matrix1 = {{5}};
        int[][] matrix2 = {{1, 2}, {3, 4}};
        int[][] matrix3 = {{6, 1, 1}, {4, -2, 5}, {2, 8, 7}};
        
        assertEquals(5, Main.determinant(matrix1)); // 1x1 matrix
        assertEquals(-2, Main.determinant(matrix2)); // 2x2 matrix
        assertEquals(-306, Main.determinant(matrix3)); // 3x3 matrix
		
	}//end of testDeterminateMatrix

}//end of Testing class
