import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EuclidGCD {
    static int gcd(int x, int y){
        if(y==0)
            return x;
        else
            return gcd(y,x % y);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(input.readLine());
        int y = Integer.parseInt(input.readLine());
        System.out.println(gcd(x,y));
    }
}
