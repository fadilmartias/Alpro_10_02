package ch07;

public class BlockSort {
    private BlockSort(int[] arr) {
        int a = arr.length;
        for (int b = 1; b < a ;b++) {
            int x = arr [b];
            int c = b-1;
            while ((c > -1) && (arr[c] > x)){
                arr[c+1] = arr[c];
                c--;
            }
            arr[c+1] = x;
        }
    }
    private int[] arr;

    public static void main(String[] args) {
        int[] arr = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println("Sebelum diurutkan block sort");
        for (int c : arr){
            System.out.print(c+" ");
        }
        System.out.println();
        new BlockSort(arr);

        System.out.println("Setelah block sort");
        for(int c : arr){
            System.out.print(c+" ");
        }
    }
}
