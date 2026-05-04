package Sorting;

class Sorting{
	public static void bubblesort(int arr[]) {
		int i,j,t;
		boolean flag;
		for(i=arr.length-1;i>0;i--){
			flag = false;
			for(j=0;j<i;j++){
				if(arr[j] > arr[j+1]) {
					t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
					flag = true;
				}
			}
			if(!flag)
				break;
		}
	}
	
	
	public static void selection_sort(int arr[]) {
		int i,j,min,t;
		for(i=0;i<arr.length-1;i++) {
			min = i;
			for(j=i+1;j<arr.length;j++) {
				if(arr[j] < arr[min])
					min = j;
			}
			if(min != i) {
				t = arr[i];
				arr[i] = arr[min];
				arr[min] = t;
			}
		}
	}
	
	
}

public class MainSorting {
	public static void main(String[] args) {
		int arr[] = {5,3,15,75,15,66};
		
		Sorting.bubblesort(arr);
		
		
		for (int x : arr) {
            System.out.print(x + " ");
		}
		System.out.println();
            
		Sorting.selection_sort(arr);
		for (int x : arr) {
            System.out.print(x + " ");
		}
	}
}

