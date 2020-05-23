public class k {
    public static void main(String[] args) {
        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        for (int a = 1; a < array.length; a++){
            if (array[a] > array[a-1]){
                System.out.println(array[a-1]);
            }
        }
    }
}
