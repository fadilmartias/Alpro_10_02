public class Longestcommonsubstringproblem {
    static String a, b;
    static int dna(int c, int d, int e) {

        if (c == 0 || d == 0) {
            return e;
        }
        if (a.charAt(c - 1) == b.charAt(d - 1)) {
            e = dna(c - 1, d - 1, e + 1);
        }
        e = Math.max(e, Math.max(dna(c, d - 1, 0), dna(c - 1, d, 0)));
        return e;
    }
    public static void main(String[] args){
        int f, g;

        a = "ITU";
        b = "MEJA";

        f = a.length();
        g = b.length();
        System.out.println(dna(f, g, 0));
    }
}
