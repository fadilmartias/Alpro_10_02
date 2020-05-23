package ch07;

import java.util.Arrays;

public class CocktailSort {
    void CocktailSort(int arr[]){
    boolean swapped;
	do {
        swapped = false;
            for (int x =0; x <=  arr.length  - 2; x++) {
		if (arr[x] > arr[x+1]) {
		int temp = arr[x];
		arr[x] = arr[x+1];
		arr[x+1] = temp;
		swapped = true;
			}
		}
		if (!swapped) {
			break;
		}
		swapped = false;
		for (int x = arr.length - 2 ; x >= 0; x--) {
                    if (arr[x] > arr[ x + 1 ]) {
			int temp = arr[x];
			arr[x] = arr[x+1];
			arr[x+1] = temp;
			swapped = true;
			}
		}
}       while (swapped);
}
    public static void main(String args[])
    {
        CocktailSort cs = new CocktailSort();
        int arr[] = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        System.out.println("Array sebelum disort :");
        System.out.println(Arrays.toString(arr));
        cs.CocktailSort(arr);
        System.out.println("Array sesudah disort :");
        System.out.println(Arrays.toString(arr));
    }
}
