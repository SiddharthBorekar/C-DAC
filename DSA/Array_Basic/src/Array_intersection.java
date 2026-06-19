
public class Array_intersection {
	public static void main(String[] args) {
		int arr[] = {1,5,4,7,6,8};
		int arrs[] = {5,7,6,1,2,6};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arrs.length;j++) {
				
				if(arr[i] == arrs[j]) {
					System.out.println();
				}
			}
		}
	}
}
