public class Maximum_ele {
	public static void main(String[] args) {
		int arr[] = {4,5,3,2,7,8,9,12};
		int Max = arr[0];
		for(int i=0;i<arr.length;i++) {
			Max = Math.max(Max,arr[i]);
		}
		System.out.println(Max);
	}
}