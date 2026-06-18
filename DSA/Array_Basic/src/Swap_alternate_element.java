public class Swap_alternate_element {
	public static void main(String[] args) {
		int arr[] = { 4, 5, 6, 1, 5, 8 };

		for (int i = 0; i < arr.length; i += 2) {

			int temp = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
