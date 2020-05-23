import java.util.Scanner;
public class Euclidean {
    public static void main(String[]args) {
        int a, b, c;
        Scanner x = new Scanner(System.in);
        
        System.out.print("a : ");
        a = x.nextInt();
        
        System.out.print("b : ");
        b = x.nextInt();
        
        c = a % b;
        while (c != 0 ) {
            a = b;
            b = c;
            c = a % b;
        }
        System.out.println("FPB = " + b);
    }
}