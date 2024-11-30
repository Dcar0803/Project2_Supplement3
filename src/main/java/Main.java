/**
 * 
 */

/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/**
     * Performs a binary search on a sorted array.
     *
     * @param sortedArray Array of integers, sorted in ascending order.
     * @param key The integer value to search for in the array.
     * @return The index of the key in the array if found, otherwise -1.
     */
	
	public static int binarySearch(int[] sortedArray, int key) {
		
		int left = 0;
		int right = sortedArray.length - 1;
		
		while(left <= right) {
			
			int mid = left + ((right - left)/ 2);
			
			if(sortedArray[mid] == key) {
				return mid;
				
			}//end of if statement
			
			else if(sortedArray[mid] < key) {
				left = mid + 1;
			}//end of else if statement
			
			else if(sortedArray[mid] >key) {
				right = mid - 1; //Move to the left sub array
				
			}//end of else if statement
			
		}//end of while loop 
		return -1; //Key not found
		
	}//end of binarySearch method 
	
	
	/**
     * Calculates the determinant of a square matrix.
     * @param matrix A 2D integer array representing the matrix.
     * @return Determinant of the matrix, or 0 for non-square matrices.
     * @throws IllegalArgumentException if the matrix is null or non-square.
     */
	
	public static int determinant(int[][] matrix) {
		
		if (matrix == null || matrix.length == 0 || matrix.length != matrix[0].length) {
            
			throw new IllegalArgumentException("Matrix must be square and non-null.");
        
		}//end of if statement 
		
		int n = matrix.length;
        if (n == 1) return matrix[0][0];
        
        if (n == 2) {
            
        	return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        
        }//end of outer if statement

        int det = 0;
        for (int col = 0; col < n; col++) {
            det += Math.pow(-1, col) * matrix[0][col] * determinant(getMinor(matrix, 0, col));
        }//end of for loop 
        return det;
		
		
	}//end of determinant method
	
	
	 /**
     * Generates the minor of a matrix excluding the given row and column.
     * @param matrix The original matrix.
     * @param row The row to exclude.
     * @param col The column to exclude.
     * @return The minor matrix.
     */
	
	private static int[][] getMinor(int[][] matrix, int row, int col) {
        int n = matrix.length;
        
        int[][] minor = new int[n - 1][n - 1];
        
        int r = 0;
        
        for (int i = 0; i < n; i++) {
            
        	if (i == row) continue;
            
            int c = 0;
            
            for (int j = 0; j < n; j++) {
                
            	if (j == col) continue;
                
                minor[r][c++] = matrix[i][j];
            }//end of for loop 
            r++;
        }
        return minor;
    }//end of getMinor method 
	
	
	
	 /**
     * Multiplies two matrices together.
     * @param matrixA The first matrix.
     * @param matrixB The second matrix.
     * @return The resulting matrix after multiplication.
     * @throws IllegalArgumentException if matrices are incompatible for multiplication.
     */
	
	
	public static int[][] multiplyMatrices(int[][]matrixA, int[][]matrixB) {
		
		int rowsA, colsA, rowsB, colsB;
		
		rowsA = matrixA.length;
		colsA = matrixA[0].length;
		rowsB = matrixB.length;
		colsB = matrixB[0].length;
		
		if(colsA != rowsB) {
			
			throw new IllegalArgumentException("Matrix A's columns must match Matrix B's rows.");
			
		}//end of if statement
		
		int result[][] = new int[rowsA][colsB];
		
		for(int i = 0; i < rowsA; i++ ) {
			
			for(int j = 0; j < colsB; j++) {
				
				for(int k = 0; k < colsA; k++) {
					
					result[i][j] += matrixA[i][k] * matrixB[k][j];
					
				}//end of nested-innermost for loop
				
			}//end of inner-outermost for loop
			
		}//end of outer for loop
		
	return result;
	
	}//end of multiplyMatrices method

}//end of main class 
