public class SelectionSort {
    private int[] arr;
	public Selectionsort(int a) {
        this.arr = new int[a];
    }
	public void setArr(int m, int n) {
        if (m >= 0 && m < this.arr.length) {
            this.arr[m] = n;
        }
    }
    public void printArr() {
        String out = "Array : ";
        for (int b = 0; b < this.arr.length; b++) {
            out += this.arr[b] + ", ";
        }
        System.out.println(out);
    }
    private void Change(int c, int d) {
        int temp = this.arr[c];
        this.arr[c] = this.arr[d];
        this.arr[d] = temp;
    }
    public void Sort() {
        for (int b = 0; b < this.arr.length; b++) {
            int f = b;
            for (int e = b; e < this.arr.length; e++) {
                if (this.arr[e] < this.arr[f]) {
                    f = e;
                }
            }
            Change(b, f);
        }
    }
    public static void main(String[] args) {
        Selectionsort z = new Selectionsort(13);

        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        z.setArr(0, 82);
        z.setArr(1, 12);
        z.setArr(2, 41);
        z.setArr(3, 38);
        z.setArr(4, 19);
        z.setArr(5, 26);
        z.setArr(6, 9);
        z.setArr(7, 48);
        z.setArr(8, 20);
        z.setArr(9, 55);
        z.setArr(10, 8);
        z.setArr(11, 32);
        z.setArr(12, 3);

        z.printArr();
        z.Sort();
        z.printArr();
    }
}


