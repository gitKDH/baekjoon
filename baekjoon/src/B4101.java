import java.util.Scanner;

public class B4101 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        int a,b;

        while(true) {
            a = value.nextInt();
            b = value.nextInt();
            if(a > b){
                System.out.println("Yes");
            }
            if (a==0 && b==0) {
                break;
            }
            if (a <= b) {
                System.out.println("No");
            }
        }
    }
}
