package ch09;

public class AKSPrimalityTest {
    private static final long[] c = new long[64];
    public static void main(String[] args) {
        for (int a = 0; a < 10; a++) {
            coeff(a);
        }
        System.out.print("Prima:");
        for (int a = 1; a < c.length; a++)
            if (isPrime(a))
                System.out.printf("%d", a);
 
        System.out.println();
    }
    static void coeff(int a) {
        c[0] = 1;
        for (int e = 0; e < a ; c[0] = -c[0], e++) {
            c[1 + e] = 1;
            for (int d = e ; d > 0; d--)
                c[d] = c[d - 1] - c[d];
        }
    }
    static boolean isPrime(int a) {
        coeff(a);
        c[0]++;
        c[a]--;
 
        int e = a;
        while (e-- != 0 && c[e] % a == 0)
            continue;
        return e < 0;
    }
}