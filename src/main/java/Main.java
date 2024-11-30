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

}//end of main class 
