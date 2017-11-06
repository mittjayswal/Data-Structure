package Arrays;

// Program for inserting element into sorted array
public class InserSortedArray {

	public static int insertSortedArray (int [] array, int arrayLenght, int currentSize, int key){
		if (currentSize >= arrayLenght){
			return currentSize;
		}
		int i;
		for ( i = currentSize-1; (array[i] > key && array[i] >= 0); i-- ){
			array[i+1] = array [i];
		}
		array[i+1] = key;
		return (currentSize+1);
		
		
	}
	public static void main(String[] args) {
		int [] array = new int[10];
		array[0]=0;
		array[1]=1;
		array[2]=2;
		array[3]=3;
		array[4]=5;
		array[5]=6;
		array[6]=7;
		array[7]=8;
		
		int arrayLength = array.length;
		int currentSize = 7;
		int key = 4;
		
		System.out.println("Before Insertion");
		for (int i=0; i<currentSize; i++){
			System.out.print(array[i]+ " ");
		}
		
		currentSize = insertSortedArray(array, arrayLength, currentSize, key);
		System.out.println("\nAfter Insertion");
		for (int i=0; i<currentSize; i++){
			System.out.print(array[i]+ " ");
		}
	}
	
}
