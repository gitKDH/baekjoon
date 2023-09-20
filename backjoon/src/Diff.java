import java.util.Scanner;

public class Diff {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("a 입력 : ");
        int a = input.nextInt();
        System.out.print("b 입력 : ");
        int b = input.nextInt();

        while(b <= a)
        {
            System.out.print("a보다 같더나 작음. 다시 입력 : ");
            b = input.nextInt();
        }
        System.out.println(b-a);
    }
}
