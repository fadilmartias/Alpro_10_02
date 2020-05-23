package ch03;

import java.util.Scanner;
public class nilaimaxXYZ {
	public static void main(String[]args) {
		Scanner a = new Scanner(System.in);
		int x;
		int y;
		int z;
		System.out.println("masukkan nilai x : ");
		x = a.nextInt();
		System.out.println("masukkan nilai y : ");
		y = a.nextInt();
		System.out.println("masukkan nilai z : ");
		z = a.nextInt();
		if (x > y && x > z) {
			System.out.println("nilai max : " +x);
		}
		else if ( y > x && y > z) {
			System.out.println("nilai max : " +y);
		}
		else {
			System.out.println("nilai max : " +z);
		}
	}
}