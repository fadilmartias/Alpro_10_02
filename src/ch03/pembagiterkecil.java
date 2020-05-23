package ch03;

import java.util.Scanner;
public class pembagiterkecil {
	public static void main(String[]args) {
		Scanner x = new Scanner(System.in);
		int b, c;
		System.out.print("Masukkan Bilangan Bulat Positif : ");
		b = x.nextInt();
		for(c = 4; c <= b; c++)
			if (b % c == 0)
			System.out.println(c);
	}
}