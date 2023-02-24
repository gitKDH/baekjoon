import java.util.Scanner;

public class B2744 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        String input = value.next();
        String result = "";

        for (char c : input.toCharArray()) {
            if (c > 64 && c < 91) {
                char tmp = (char) (c + 32);
                result += tmp;
            } else {
                char tmp = (char) (c - 32);
                result += tmp;
            }
        }
        System.out.println(result);
    }
}
