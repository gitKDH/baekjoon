import java.util.Random;
import java.util.Scanner;

public class MaxOfArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int n = input.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = 100 + random.nextInt(90);
        }

        System.out.println(maxOf(a));

    }
    static int maxOf(int[] a){
        int max = a[0];

        for(int i = 0; i < a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
        }

        return max;
    }
}
