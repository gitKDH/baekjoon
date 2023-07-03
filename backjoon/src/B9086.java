import java.util.Scanner;

public class B9086 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        int n = value.nextInt();

        for(int i = 0; i < n; i++){
            String a = value.next();
            System.out.println(a.charAt(0)+""+a.charAt(a.length()-1));
        }
    }
}
