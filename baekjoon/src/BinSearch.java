import java.util.Arrays;
import java.util.Scanner;

public class BinSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] x = new int[n];

        for(int i = 0; i < n; i++){
            x[i] = input.nextInt();
        }
        Arrays.sort(x);

        int key = input.nextInt();
        int result = binarySearch(x,n,key);
        System.out.println("x[" + result + "]");

    }

    static int binarySearch(int[] a, int n, int key) {
        int pl = 0;
        int pr = n - 1;

        do {
            int pc = (pl + pr) / 2;
            if (a[pc] == key) {
                return pc;
            } else if (a[pc] < key) {
                pl = pc + 1;
            } else {
                pr = pc - 1;
            }
        } while (pl <= pr);
        return -1;
    }
}
