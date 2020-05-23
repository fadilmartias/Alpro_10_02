package ch04;

public class n {
    public static void main(String[] args) {
        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int a = 0;
        for (int b = 0; b < array.length; b++){
            System.out.print(array[b] + " + seluruh angka sebelumnya = ");
            System.out.println(array[b] + a);
            a = a + array[b];
        }
    }
}
