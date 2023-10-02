import java.util.Scanner;

public class B2750 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] array = new int[n];

        for(int i = 0; i < n; i++){
            array[i] = input.nextInt();
        }
        for(int i = 0; i < n - 1; i++){
            for(int j = n - 1; j > i; j--){
                if(array[j - 1] > array[j]){
                    swap(array, j - 1, j);
                }
            }
        }
        for(int i = 0; i < n; i++){
            System.out.println(array[i]);
        }
    }
    static void swap(int[] a, int idx1, int idx2){
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }
}
