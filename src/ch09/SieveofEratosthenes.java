package ch09;

import java.util.Scanner;
public class SieveofEratosthenes	{
    private int[] calcPrimes(int z) {
        int[] arr = new int[z + 1];
        for (int b = 2; b <= Math.sqrt(z); b++) {
            if (arr[b] == 0) {
                for (int c = b * b; c <= z; c += b) {
                    arr[c] = 1;
                }
            }
        }
        return arr;
    }
    public void getPrimes(int z){
        int[] p = calcPrimes(z);
        display(p);
    }
    public void display(int[] p){
        System.out.print("\nPrima = ");
        for (int b = 2; b < p.length; b++)
            if (p[b] == 0)
                System.out.print(b +" ");
        System.out.println();
    }
    public static void main (String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Sieve Of Eratosthenes Prima Algorithm Test\n");
        SieveOfEratosthenes y = new SieveOfEratosthenes();
        System.out.println("Masukkan angka :\n");
        int d = x.nextInt();
        y.getPrimes(n);        
    }
}