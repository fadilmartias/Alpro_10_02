package ch05;

public class Longestincreasingsubsequence {
    static int max_ref;
    static int _lis(int array[], int a)
    {
        if (a == 1)
            return 1;
        int r, max_ending_here = 1;
        for (int b = 1; b < a; b++) {
            r = _lis(array, b);
            if (array[b - 1] < array[a - 1] && r + 1 > max_ending_here)
                max_ending_here = r + 1;
        }
        if (max_ref < max_ending_here)
            max_ref = max_ending_here;
        return max_ending_here;
    }
    static int lis(int array[], int a)
    {
        max_ref = 1;
        _lis(array, a);
        return max_ref;
    }
    public static void main(String args[])
    {
        int array[] = { 82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3 };
        int a = array.length;
        System.out.println("Panjang : " + lis(array, a) + "\n");
    }
}