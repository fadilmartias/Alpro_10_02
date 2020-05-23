package ch03;

import java.util.Scanner;
public class bilanganprima {
	public static void main(String[]args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Masukkan Bilangan : ");
		int a = x.nextInt();
		int b = 0;
		for (int c = 1; c <= a; c++) {
			if (a%c == 0)
			b = b +1; }
		if (b == 2)
			System.out.println(a + "merupakan bilangan prima");
		else
			System.out.println(a + "bukan merupakan bilangan prima");
		}
}
