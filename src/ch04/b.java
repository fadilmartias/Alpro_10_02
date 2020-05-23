package ch04;

import java.util.Scanner;
public class b {
	public static void main(String[]args) {
		Scanner x = new Scanner(System.in);
		int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
		System.out.print("Masukkan angka yang ingin dicari = ");
	        int a = x.nextInt();
		int b = x.nextInt();
		
		for (int c = 0; c < array.length; c++) {
            System.out.print(array[c] + ", ");
		}

        if (b < 0){
            System.out.println("Nilai tidak dapat ditemukan");
        }else{
            System.out.println("Nilai " + a + " berada pada indeks ke+"+ b);
    }
  }
}