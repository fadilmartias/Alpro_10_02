package ch04;

public class j {
	public static void main(String[]args) {
		int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
		for(int a = 0; a < array.length; a++) {
			if(array[a] %2 == 0 && array[a+1] %2 == 0) {
				int jumlah_angka = array[a] - array[a+1];
				System.out.println(array[a] + "-"+ array[a+1] + "="+ jumlah_angka);
			}
		}
	}
}