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
