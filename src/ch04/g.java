package ch04;

public class g {
	public static void main(String[]args) {
		int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
		        for (int a = 0; a < array.length; a++) {
				if(array[a] % 5 == 0 && array[a+1] %5 == 0) {
				System.out.println(array[a]);
				System.out.println(array[a+1]);
			}
		}
	}
}