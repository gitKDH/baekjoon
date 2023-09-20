import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Random random = new Random();
        int n = input.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(a));

        reverse(a);

        String result = Arrays.toString(a);

        System.out.println(result);

    }
    static void reverse(int[] a){
        for(int i = 0; i < a.length/2; i++){
            int temp = a[a.length-i-1];
            a[a.length-i-1] = a[i];
            a[i] = temp;
        }
    }
}
