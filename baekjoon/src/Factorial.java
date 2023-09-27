import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
    public static int factorial(int n){
        if(n > 0){
            return n * factorial(n -1);
        }else {
            return 1;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader input =  new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());

        System.out.println(factorial(n));
    }
}
