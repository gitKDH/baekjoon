import java.util.Arrays;
import java.util.Scanner;

public class B1920 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int[] find = new int[N];
        for(int i = 0; i < find.length; i++){
            find[i] = input.nextInt();
        }
        Arrays.sort(find);

        int M = input.nextInt();
        int[] in = new int[M];
        for(int i = 0; i < in.length; i++){
            in[i] = input.nextInt();
        }

        boolean check = true;

        while(check){

        }
    }
}
