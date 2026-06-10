public class Search_array {
	public static void main(String[] args) {
		int arr[] = { 2, 5, 3, 7, 8 };

		for (int i = 0; i <= arr.length; i++) {

			int targ = 7;
			if (arr[i] == targ) {
				System.out.println(targ);
				break;
			}
			else {
				System.out.println("Not Found");
			}
		}
	}
}