import java.util.Scanner;
import java.util.StringTokenizer;

public class B1152 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        String a = value.nextLine();

        StringTokenizer st = new StringTokenizer(a," ");
        System.out.println(st.countTokens());
    }
}
