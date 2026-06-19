package Array_Manipulation;

public class Shift_Element_By_one_pos {
	public static void main(String[] args) {
		
		int arr[] = {4,5,8,6,1,7,3};
		
		int a = arr[arr.length-1];
		
		for(int i=arr.length-1;i>0;i--){
			arr[i] = arr[i-1];
		}
		arr[0] = a;
		
		for(int k=0;k<arr.length;k++) {
		System.out.print(arr[k]+" ");
		}
	}
}