
public class Sum {
	public static void main(String[] args) {
		
		int arr[] = {2,4,1,3};
		double sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);
		double avg = sum /arr.length;
		System.out.println(avg);
		
	}
}