package ch04;

public class h {
	public static void main(String[]args) {
		int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
		int jumlah_angka = 0;
		for(int a = 0; a < array.length; a++) {
			jumlah_angka = jumlah_angka +array[a];
		}
		System.out.println(jumlah_angka);
	}
}