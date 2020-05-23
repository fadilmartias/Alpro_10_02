package ch03;

import java.util.Scanner;
public class nilaimaxXY {
	public static void main(String[]args) {
		Scanner a = new Scanner(System.in);
		int x;
		int y;
		System.out.println("masukkan nilai x :");
		x = a.nextInt();
		System.out.println("masukkan nilai y :");
		y = a.nextInt();
		if (x > y) {
			System.out.println("nilai max adalah " +x);
		}
		else if (x < y) {
			System.out.println("nilai max adalah " +y);
		}
		else {
		System.out.println("masukkan nilai ulang");
		}
	}
}