import java.util.Scanner;
public class  SieveofSundaram	{
    private boolean[] calcPrimes(int lim) {
        int b = lim/2;
        boolean[] prima = new boolean[lim];        
        for (int a = 1; a < b; a++)
            for (int d = a; d <= (b - a) / (2 * a + 1); d++)
                prima[a + d + 2 * a * d] = true;
 
        return prima;
    }
    public void getPrimes(int C){
        boolean[] p = calcPrimes(C);
        display(p);
    }
    public void display(boolean[] p){
        System.out.print("\nPrima = 2 3 ");
        for (int a = 2; a < p.length/2; a++)
            if (!p[a])
                System.out.print((2 * a + 1) +" ");
        System.out.println();
    }
    public static void main (String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Sieve Of Sundaram Prima Algorithm Test\n");
        SieveOfSundaram y = new  SieveOfSundaram();
        System.out.println("Masukkan angka :\n");
        int b = x.nextInt();
        y.getPrimes(n);        
    }
}