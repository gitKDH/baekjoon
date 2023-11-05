import java.util.Arrays;
import java.util.Scanner;

public class B2587 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        int[] input = new int[5];

        for(int i = 0; i < 5; i++){
            input[i] = value.nextInt();
        }
        int avg = (input[0] + input[1] + input[2] + input[3] + input[4]) / 5;

        Arrays.sort(input);
        System.out.println(avg);
        System.out.println(input[2]);
    }
}
