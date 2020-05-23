package ch04;

public class l {
    public static void main(String[] args) {
        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int a = 1;
        do{
            if (array[a] % 2 == 0 && array[a-1] %2 == 0) {
                System.out.print(array[a-1] + "+" + array[a] + "=");
                System.out.println(array[a-1] + array[a] + "");
            }
            a++;
            } while (a < array.length) ;
        }
    }