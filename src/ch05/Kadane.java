import java.util.Scanner;
 
public class Kadane {
    public int maxSequenceSum(int[] arr) {        
        int maxSoFar = arr[0], maxEndingHere = arr[0];
 
        for (int a = 1; a < arr.length; a++)
        {
            if (maxEndingHere < 0)
                maxEndingHere = arr[a];
            else
                maxEndingHere += arr[a];
 
            if (maxEndingHere >= maxSoFar)
                maxSoFar = maxEndingHere;
        }
        return maxSoFar;
    }    
	
    public static void main (String[] args) 
    {
        Scanner x = new Scanner(System.in);
        System.out.println("Kadane Algorithm Test\n");
        Kadane y = new Kadane();
		
		
        System.out.println("Masukkan banyak Array :");
        int b = x.nextInt();
        System.out.println("Masukkan "+ b +" elements");
        int[] arr = new int[b];
        for (int a = 0; a < b; a++)
            arr[a] = x.nextInt();
        int sum = y.maxSequenceSum(arr);
        System.out.println("\nMaximum Sequence sum = "+ sum);
	
 
    }
}