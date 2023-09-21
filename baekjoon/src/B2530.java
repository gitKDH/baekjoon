import java.util.Scanner;

public class B2530 {
    public static void main(String[] args) {

        Scanner value = new Scanner(System.in);

        int a = value.nextInt();
        int b = value.nextInt();
        int c = value.nextInt();

        int time = value.nextInt();

        c+=time;
        b+=c/60;
        c%=60;
        a+=b/60;
        b%=60;
        a%=24;

        System.out.println(a+ " " + b + " " + c);
    }
}
