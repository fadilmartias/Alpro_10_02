import java.util.Scanner;
import java.util.Random;
import java.math.BigInteger;

public class MillerRabin {
    public boolean isPrime(long a, int b){
        if (a == 0 || a == 1)
            return false;
        if (a == 2)
            return true;
        if (a % 2 == 0)
            return false;
 
        long c = a - 1;
        while (c % 2 == 0)
            c /= 2;
        Random d = new Random();
        for (int e = 0; e < b; e++)	{
            long f = Math.abs(d.nextLong());            
            long g = f % (a - 1) + 1, temp = c;
            long mod = modPow(g, temp, a);
            while (temp != a - 1 && mod != 1 && mod != a - 1){
                mod = mulMod(mod, mod, a);
                temp *= 2;
            }
            if (mod != a - 1 && temp % 2 == 0)
                return false;
        }
        return true;        
    }
    public long modPow(long g, long h, long i) {
        long j = 1;
        for (int e = 0; e < h; e++)	{
            j *= g;
            j %= i; 
        }
        return j % i;
    }
    public long mulMod(long g, long h, long mod) 
    {
        return BigInteger.valueOf(g).multiply(BigInteger.valueOf(h)).mod(BigInteger.valueOf(mod)).longValue();
    }
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Miller Rabin Primality Algorithm Test\n");
        MillerRabin mr = new MillerRabin();
        System.out.println("Nomor :\n");
        long x = input.nextLong();
        System.out.println("\Iterasi : ");
        int y = input.nextInt();
        boolean prime = mr.isPrime(x, y);
        if (prime)
            System.out.println("\n"+ x +" merupakan bilangan prima");
        else
            System.out.println("\n"+ x +" bukan merupakan bilangan prima");
 
    }
}