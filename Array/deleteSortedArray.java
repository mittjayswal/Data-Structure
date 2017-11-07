package Arrays;


// Program to 
public class deleteSortedArray {

	private static int deleteElement(int[] array, int n, int key) {
		int pos = binarySearch(array, 0, n-1, key);
		
		if (pos == -1){
			System.out.println("Position is not found");
			return n;
		}
		
		int i;
		for(i=pos; i<n-1; i++){
			array[i] = array [i+1];
		}
		return n-1;
	}
	private static int binarySearch(int[] array, int low, int high, int key) {
		
		if (low > high){
			return -1;
		}
		int mid = (low+high)/2;
		if (key == array[mid]){
			return mid;
		}
		if (key < array[mid]){
			return binarySearch(array, low, (mid-1), key);
		}
		return binarySearch(array, (mid+1), high, key);
	}
	public static void main(String[] args) {
		int [] array = {10,20,30,40,50};
		int n = array.length;
		int key = 10;
		
		System.out.println("Array before deletion: ");
		for (int i=0; i<n-1; i ++){
			System.out.print(array[i]+" ");
		}
		
		n = deleteElement(array, n, key);
		
		System.out.println("\n\nArray after deletion: ");
		for (int i=0; i<n-1; i ++){
			System.out.print(array[i]+" ");
		}
	}

	
}
