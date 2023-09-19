import java.util.Scanner;

public class nextMethodTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("첫 정수 입력 : ");
        int a = input.nextInt();
        System.out.println(a);

        System.out.print("첫 문자열 입력 : ");
        String str1 = input.nextLine();
        System.out.println(str1);

        System.out.print("두번째 정수 입력 : ");
        int b = input.nextInt();
        System.out.println(b);

        System.out.print("두번째 문자열 입력 : ");
        String str2 = input.next();
        System.out.println(str2);
    }
}
