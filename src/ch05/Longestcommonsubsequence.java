package ch05;

public class Longestcommonsubsequence {
    int lcs( char[] a, char[] b, int c, int d )
    {
        if (c == 0 || d == 0)
            return 0;
        if (a[c-1] == b[d-1])
            return 1 + lcs(a, b, c-1, d-1);
        else
            return max(lcs(a, b, c, d-1), lcs(a, b, c-1, d));
    }
    int max(int e, int f)
    {
        return (e > f)? e : f;
    }
    public static void main(String[] args)
    {
        LongestCommonSubsequence lcs = new LongestCommonSubsequence();
        String x = "STIK";
        String y = "PS";
        char[] a = x.toCharArray();
        char[] b = y.toCharArray();
        int c = a.length;
        int d = b.length;
        System.out.println("Panjang : " + " " +
                lcs.lcs( a, b, c, d ) );
    }
}
