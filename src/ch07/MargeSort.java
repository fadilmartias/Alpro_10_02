public class MargeSort {
	public static void main(String[]args) {

		int arr[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
		System.out.println("sebelum diurutkan margesort ");
		for (int a = 0;  a < arr.length; a++) {
			System.out.print(arr[a]+" ");
		}
		System.out.println();
			
		initializemergeSort(arr,0,arr.length-1);
		System.out.println();
		System.out.println("setelah diurutkan margesort ");
		for (int a = 0;  a < arr.length; a++) {
			System.out.println(arr[a]+" ");
		}
	}
public static void initializemergeSort(int arr[], int b, int c) {
	int low = b;
	int high = c;
	if (low >= high) {
		return;
	}
	int middle = (low+high)/2;
	initializemergeSort(arr, low, middle);
	initializemergeSort(arr, middle, high);
	int end_low = middle;
	int start_high = middle + l;
	while ((b <= end_low) && (start_high <= high)) {
		if (arr[low] < arr[start_high]) {
			low++;
		}
		else {
			int temp=n[start_high];
			for (int d = start_high-l; d >= low ; d--) {
					arr[d-l]=arr[d];
			}
			arr[low] = temp;
			low++;
			end_low++;
			start_high++;
		}
	     }
	}
}