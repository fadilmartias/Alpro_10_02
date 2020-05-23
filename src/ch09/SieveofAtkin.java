package ch09;

import java.util.Scanner;
public class  SieveofAtkin{
    private boolean[] calcPrimes(int limit) {
        boolean[] prima = new boolean[limit + 1];
        prima[2] = true;
        prima[3] = true;
        int root = (int) Math.ceil(Math.sqrt(limit));
        for (int a = 1; a < root; a++) {
            for (int b = 1; b < root; b++){
                int c = 4 * a * a + b * b;
                if (c <= limit && (c % 12 == 1 || c % 12 == 5))
                    prima[c] = !prima[c];
                c = 3 * a * a + b * b;
                if (c <= limit && c % 12 == 7)
                    prima[c] = !prima[c];
                c = 3 * a * a - b * b;
                if ((a > b) && (c <= limit) && (c % 12 == 11))
                    prima[c] = !prima[c];
            }
        }
        for (int d = 5; d <= root; d++)
            if (prima[d])
                for (int e = d * d; e < limit; e += d * d)
                    prima[e] = false;
 
        return prima;
    }
    public void getbilangan(int z){
        boolean[] bilangan = calcPrimes(z);
        display(bilangan);
    }
    public void display(boolean[] bilangan) {
        System.out.print("\nPrima : ");
        for (int d = 2; d < bilangan.length; d++)
            if (bilangan[d])
                System.out.print(d +" ");
        System.out.println();
    }
    public static void main (String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Sieve Of Atkin\n");
		 SieveofAtkin y = new  SieveofAtkin();
        System.out.println("Masukkan angka :\n");
        int c = x.nextInt();
        y.getbilangan(c);        
    }
}