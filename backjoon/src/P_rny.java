import java.util.Scanner;

public class P_rny {
    public static void main(String[] args) {

        Scanner value = new Scanner(System.in);

        String rny_string = value.next();
        String answer = rny_string.replaceAll("m","rn");

        System.out.println(answer);
    }
}
