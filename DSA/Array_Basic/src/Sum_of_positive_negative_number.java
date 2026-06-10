
public class Sum_of_positive_negative_number {
	public static void main(String[] args) {
		
		int arr[] = {8,-6,7,-8,6,-9,2,4,8,-2};
		int pos = 0;
		int neg = 0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i] > 0) {
				pos = arr[i] + pos;
			}
			if(arr[i] < 0) {
				neg = arr[i] + neg;
			}
		}
		System.out.println(pos);
		System.out.println(neg);
	}
}