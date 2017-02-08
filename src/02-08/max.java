
public class max {
  public static int max(int[] arr){
	if(arr.length == 0) {
      throw new IllegalArgumentException();
	} else {
	    int ret = arr[0];
	    for (int i = 1; i < arr.length; i++) {
	      if(ret < arr[i]) {
	    	ret = arr[i];
	      }
	    }
	    return ret;
	}
  }

}

 /**
  * Worst case:   The value of each element in the array is greater than
  *               the preceding element.
  *
  *   Relevant input: length of array (arr.length)
  *   
  *   Operations to count: 1 comparison & 1 assignment, 
  *                          done arr.length (n) times 
  *
  *   Function to describe: T(n) = 2n
  *   
  *   Bounded by: (trivial) g(n) = 2n for n_0 = 0 and c = 1
  *               (non-trivial) g(n) = 3n for n_0 = 0 and c = 1 
  *               
  * Best case:    The array has length 0
  *  
  *   Relevant input: length of array (arr.length)
  *   
  *   Operations to count: 1 comparison 
  *
  *   Function to describe: T(n) = 1
  *   
  *   Bounded by: (trivial) g(n) = 1 for n_0 = 0 and c = 1
  *               (non-trivial) g(n) = (1/8)n for n_0 = 0 and c = 1 
  *               
  * Average case: The maximum element is at the middle of the array
  * 
  *   Relevant input: length of array (arr.length)
  *   
  *   Operations to count: 1 comparison 
  *                          done arr.length/2 (n/2) times 
  *
  *   Function to describe: T(n) = (1/2)n
  *   
  *   Bounded by: (trivial) g(n) = (1/2)n for n_0 = 0 and c = 1
  *               (non-trivial) g(n) = n for n_0 = 0 and c = 1 
  */
