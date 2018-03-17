/*
 * Muhammad Ansari
 * Sept 26, 2017
 * COMP 482 Project #1
*/

public class Sorts {
	
	//returns true only if a is sorted from smallest to largest values
	public static boolean isSorted(int[] a){
		
	    for (int i = 0; i < a.length - 1; i++) {
	        if (a[i] > a[i + 1]) {
	            return false;
	        }
	    }

	    return true;
	}
	
	/* --------------------MergeSort --------------------*/
	
	//merges sorted slices a[i.. j] and a[j +1 ...k] for 0 <=  i <= j < k < a.length
	public static void merge(int[] a, int i, int j , int k) {
		
		// Determine size of the two sub-arrays to be merged
        int size1 = j - i + 1;
        int size2 = k - j;
 
        // Initialize temporary arrays
        int left[] = new int [size1];
        int right[] = new int [size2];
 
        //Copy data into temporary arrays
        for (int x = 0; x < size1; ++x)
        	left[x] = a[i + x];
        
        for (int y = 0; y < size2; ++y)
        	right[y] = a[j + 1 + y];
 
        // Merge the temp arrays
        
        int x = 0, y = 0;	// Initial indices of first and second sub-arrays
        int z = i;			// Initial index of merged sub-array
        
        while (x < size1 && y < size2) {
            if (left[x] <= right[y]) {
                a[z] = left[x];
                x++;
            }
            else {
                a[z] = right[y];
                y++;
            }
            
            z++;
        }
 
        // Copy remaining elements of left array
        while (x < size1) {
            a[z] = left[x];
            x++;
            z++;
        }
 
        // Copy remaining elements of right array
        while (y < size2) {
            a[z] = right[y];
            y++;
            z++;
        }
	}
	
	//sorts  a[i .. k] for 0 <= i <= k  < a.length
	public  static  void mergeSort(int[] a,  int i ,  int k) {
		
		if (i < k) {
			int middle = (i+k-1)/2;
			mergeSort(a, i, middle);
			mergeSort(a, middle+1, k);
			merge(a, i, middle, k);
		}
	}
	
	//Sorts the array a using mergesort 
	public static  void  mergeSort(int[] a){
		
		int k = a.length;
		mergeSort(a, 0, k-1);
		
	}
	
	 /* ----------   QuickSort ---------------------------------------------- */
	 
	 //Implements in-place partition from text. Partitions subarray s[a..b] into s[a..l-1] and s[l+1..b] 
	 // so that all elements of  s[a..l-1] are less than each element in s[l+1..b]
	 public static int partition(int s[], int a, int b) {
		 
		 int p = s[b]; 
	     int i = (a - 1);		// index
	        for (int j = a; j < b; j++)
	        {
	            if (s[j] <= p)	// If current element is smaller than or equal to pivot
	            {
	                i++;
	 
	                // Swap a[i] and a[j]
	                int temp = s[i];
	                s[i] = s[j];
	                s[j] = temp;
	            }
	        }
	 
	        // Swap a[i+1] and a[b]
	        int temp = s[i+1];
	        s[i+1] = s[b];
	        s[b] = temp;
	 
	        return i + 1;
	 }
	 
	 //quick sorts subarray a[i..j]
	 public static void quickSort(int[] a, int i, int j) {
		 
		 if (i < j) {
			 int s = partition(a, i, j);
			 quickSort(a, i, s-1);
			 quickSort(a, s+1, j);
		 }
	 }
	 
	 //quick sorts array a
	 public static void quickSort(int[] a) {
		 
		 int k = a.length;
		 quickSort(a, 0, k-1);
	 }
}

