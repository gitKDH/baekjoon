import java.util.Arrays;
import java.util.Scanner;

public class B2577 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int mul = A * B * C;

        String result = Integer.toString(mul);
        char[] resultChar = result.toCharArray(); // {1,7,0,3,7,3,0,0}
        int[] zero = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int j = 0; j < resultChar.length; j++) {
            int index = resultChar[j] - '0';
            zero[index]++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(zero[i]);
        }
    }
}
