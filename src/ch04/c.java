package ch04;

public class c {
	public static void main(String[]args) {
		int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
		for (int x : array) {
			if(x % 2 == 1) {
			System.out.print(x + ", ");
			}
		}
	}
}