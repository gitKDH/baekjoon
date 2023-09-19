import java.util.Scanner;

public class B2869 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double A = input.nextInt();
        double B = input.nextInt();
        double V = input.nextInt();
        double temp = (V-B)/(A-B);
        double day = Math.ceil(temp);
        System.out.println((int)day);


    }
}
