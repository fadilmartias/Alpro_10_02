public class m {
    public static void main(String[] args) {
        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
		int a, b = 0;
        System.out.print("jumlah angka selisih point i = ");
        for (int c = 1; c < array.length; c++){
            a = array[c-1] - array[c];
            b += a;
        }
        System.out.println(b);
    }
}
