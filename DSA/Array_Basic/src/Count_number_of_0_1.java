
public class Count_number_of_0_1 {
	public static void main(String[] args) {
		int arr[] = {4,5,1,2,6,5,0,4,5,8,0,1};
		int zero = 0;
		int one = 0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i] == 1 ){
				zero ++;
			}
			if(arr[i] == 0 ){
				one ++;
			}
		}
		System.out.println("Number of Zero are :"+zero);
		System.out.println("Number of Ones are :"+one);
	}
}