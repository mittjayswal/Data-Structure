package Arrays;

public class SearchSortedArray {

	public static int searchSorted (int [] a,int low, int high, int key){
	
		if(low>high){
			return -1;
		}
		int mid = (low+high)/2;
		//now check key is less than mid
		if (key == a[mid]){
			return mid;
		}
		if (key<a[mid]){
			return searchSorted(a, low, (mid-1), key);
		}
		return searchSorted(a, (mid+1), high, key);
	}
	public static void main(String[] args) {
		// Binary search in Sorted Array
		int [] a = {10,20,30,40,50,60,70,80,90,100};
		int n = a.length;
		int key = 80;
		
		System.out.println("index : "+searchSorted(a,0,n,key));
	}
}
