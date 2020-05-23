package ch07;

public class Mergesort {
    public static void main(String arr[]) {

     int z[] = {82,12,41,38,19,26,9,48,20,55,8,32,3};
     System.out.println("Sebelum diurutkan :");
     for(int a = 0; a < z.length; a++)   {
        System.out.print(z[a]+" ");
     }
     System.out.println();
      
     initializemergeSort(z,0,z.length-1);
     System.out.println();   
     System.out.println("Setelah diurutkan :");
     for(int x = 0; x < z.length; x++)
     {
        System.out.print(z[x]+" ");
     }

}
   public static void initializemergeSort(int z[], int m, int n) { 
     int low = m;
     int high = n;
     if (low>=high)     {
        return;
     }
     int middle = (low+high)/2;
     initializemergeSort(z,low,middle);
     initializemergeSort(z,middle+1,high);
     int end_low = middle;
     int start_high = middle+1;
     while ((m <= end_low) && (start_high<=high))   {
        if (z[low]<z[start_high])     {
           low++;
        }
        else     {
           int temp = z[start_high];
           for (int y = start_high-1;y >= low;y--)         {
              z[y+1]=z[y];
           }
           z[low] = temp;
           low++;
           end_low++;
           start_high++;
      }
    }
  }  
} 

