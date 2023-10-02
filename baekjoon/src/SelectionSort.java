import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] x = new int[n];

        for(int i = 0; i < n; i++){
            x[i] = input.nextInt();
        }

        for(int i = 0; i < n; i++){
            int min = i;
            for(int j = i + 1; j < n; j++){
                if(x[j] < x[min]){
                    swap(x,i,min);
                }
            }
        }
        for(int i = 0; i < n; i++){
            System.out.println(x[i]);
        }
    }
    static void swap(int[] a, int idx1, int idx2){
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }

}
