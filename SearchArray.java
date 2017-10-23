package Arrays;

public class SearchArray {

	public static int findElement (int []array, int key){
		
		for (int i=0; i<array.length; i++){
			if (array[i] == key){
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int [] array = {10,20,30,40,50};
		int key = 40;
		
		int position = findElement (array,key);
		if (position != -1){
			System.out.println("Element found at postion "+(position+1));
		}
		else {
			System.out.println("Element is not found");
		}
		
	}
}
