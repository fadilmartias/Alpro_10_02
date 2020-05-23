import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class KnuthMorrisPratt {
    private final int[] failure;
    public KnuthMorrisPratt(String text, String patt) {
        failure = new int[patt.length()];
        fail(patt);
        int a = posMatch(text, patt);
        if (a == -1)
            System.out.println("\nTidak di Temukan Kecocokan");
        else
            System.out.println("\nKecocokan di Temukan Pada Index ke- "+ a);
    }
    private void fail(String patt) {
        int b = patt.length();
        failure[0] = -1;
        for (int c = 1; c < b; c++) {
            int d = failure[c - 1];
            while ((patt.charAt(c) != patt.charAt(d + 1)) && d >= 0)
                d = failure[d];
            if (patt.charAt(c) == patt.charAt(d + 1))
                failure[c] = d + 1;
            else
                failure[c] = -1;
        }
    }
    private int posMatch(String text, String patt){
        int c = 0, d = 0;
        int s = text.length();
        int p = patt.length();
        while (d < s && c < p) {
            if (text.charAt(d) == patt.charAt(c))
            {
                d++;
                c++;
            }
            else if (c == 0)
                d++;
            else
                c = failure[c - 1] + 1;
        }
        return ((c == p) ? (d - p) : -1);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Knuth Morris Pratt\n");
        System.out.println("\nMasukkan Teks\n");
        String text = x.readLine();

        System.out.println("\nMasukkan kata\n");
        String kata = x.readLine();

        KnuthMorrisPratt kmp = new KnuthMorrisPratt(text, kata);
    }
}
