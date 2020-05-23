package ch08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BoyerMoore	{
    public void findPattern(String a, String b)	{
        char[] text = a.toCharArray();
        char[] pattern = b.toCharArray();
        int c = indexOf(text, pattern);
        if (c == -1)
            System.out.println("\nTIDAK DITEMUKAN!\n");
        else
            System.out.println("DITEMUKAN PADA POSISI : "+ c);
    }
    public int indexOf(char[] text, char[] pattern) {
        if (pattern.length == 0) 
            return 0;
        int charTable[] = makeCharTable(pattern);
        int offsetTable[] = makeOffsetTable(pattern);
        for (int d = pattern.length - 1, e; d < text.length;) 
        {
            for (e = pattern.length - 1; pattern[e] == text[d]; --d, --e) 
                     if (e == 0) 
                    return d;
              d += Math.max(offsetTable[pattern.length - 1 - e], charTable[text[d]]);
        }
        return -1;
      }
      private int[] makeCharTable(char[] pattern)  {
        final int ukuran = 250;
        int[] table = new int[ukuran];
        for (int d = 0; d < table.length; ++d) 
               table[d] = pattern.length;
        for (int d = 0; d < pattern.length - 1; ++d) 
               table[pattern[d]] = pattern.length - 1 - d;
        return table;
      }
      private static int[] makeOffsetTable(char[] pattern)  {
        int[] table = new int[pattern.length];
        int lastPrefixPosition = pattern.length;
        for (int d = pattern.length - 1; d >= 0; --d) {
            if (isPrefix(pattern, d + 1)) 
                   lastPrefixPosition = d + 1;
              table[pattern.length - 1 - d] = lastPrefixPosition - d + pattern.length - 1;
        }
        for (int d = 0; d < pattern.length - 1; ++d) {
              int f = suffixLength(pattern, d);
              table[f] = pattern.length - 1 - d + f;
        }
        return table;
    }
    private static boolean isPrefix(char[] pattern, int b) {
        for (int d = b, e = 0; d < pattern.length; ++d, ++e) 
            if (pattern[d] != pattern[e]) 
                  return false;
        return true;
    }
    private static int suffixLength(char[] pattern, int b) {
        int g = 0;
        for (int d = b, e = pattern.length - 1; d >= 0 && pattern[d] == pattern[e]; --d, --e) 
               g += 1;
        return g;
    }
    public static void main(String[] args) throws IOException	{    
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Boyer Moore Algorithm Test\n");
        System.out.println("\nMASUKKAN TEKS\n");
        String text = x.readLine();
        System.out.println("\nMASUKKAN KATA\n");
        String pattern = x.readLine();
        BoyerMoore y = new BoyerMoore(); 
        y.findPattern(text, pattern);     
    }
}