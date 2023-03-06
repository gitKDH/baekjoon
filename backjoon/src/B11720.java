import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader value = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(value.readLine());
        String[] b = value.readLine().split("");
        int sum = 0;
        for(int i = 0; i < a; i++){
            sum += Integer.parseInt(b[i]);
        }
        System.out.println(sum);


    }
}
