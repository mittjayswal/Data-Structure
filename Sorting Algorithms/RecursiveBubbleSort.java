package sorting;

public class RecursiveBubbleSort {

	public static void main(String[] args) {
		int [] arr = {90,1,20,30,5,8,40};
		recursiveBubble(arr,arr.length);
		
		System.out.println("Sorted Array: ");
		for (int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		
	}

	private static void recursiveBubble(int[] arr, int length) {
		
		// best case
		if (length == 1){
			return;
		}
		
		for (int i=0; i<length-1; i++){
			if (arr[i]>arr[i+1]){
				//swap it
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		recursiveBubble(arr, (length-1));
	}
}
