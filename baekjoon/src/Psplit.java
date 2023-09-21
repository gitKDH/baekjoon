import java.util.Scanner;

public class Psplit {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        int num1 = value.nextInt();
        int num2 = value.nextInt();

        float num3 = (float) num1 / (float) num2 * 1000;

        System.out.println(num3);
    }
}
