package Array_Manipulation;

public class Print_Extrime_Ele {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

		int a = arr.length - 1;
		int i = 0;
		while (i <= a) {
			if (i == a) {
				System.out.println(arr[a]);
				return;
			}
			else {
				System.out.print(arr[i]+ " ");
				i++;
				System.out.print(arr[a]+ " ");
				a--;
			}
		}
	}
}
