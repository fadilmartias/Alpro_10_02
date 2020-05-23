package ch04;

public class i {
	public static void main(String[]args) {
		int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
		for(int a = 0; a < array.length; a++) {
			int selisih_angka = array[a] - array[a+1];
			System.out.println(array[a] + "-"+ array[a+1] + "="+ selisih_angka);
		}
	}
}