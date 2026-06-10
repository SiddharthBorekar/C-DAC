public class Unsorted_element_in_arr {
	public static void main(String[] args) {
		int arr[] = {1,2,3,8,5,6,7};
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i+1] < arr[i]) {
				System.out.println(arr[i+1]);
			}
		}
	}
}
	