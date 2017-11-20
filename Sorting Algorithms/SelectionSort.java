package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int [] arr ={50,30,20,10};
		sortedArray(arr);
		// print the sorted array
		for (int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}

	private static void sortedArray(int[] arr) {
		int lenght = arr.length;
		for (int i=0;  i<lenght-1; i++){
			int min_index = i;
			// find the sortest element from the sub array
			for (int j=i+1; j<lenght; j++){
				if (arr[j] < arr[min_index]){
					min_index = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min_index];
			arr[min_index] = temp;
		}
	}
}
