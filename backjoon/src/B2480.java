import java.util.Scanner;

public class B2480 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        int a = value.nextInt();
        int b = value.nextInt();
        int c = value.nextInt();

        if(a == b && a == c && b == c){
            System.out.println(10000+(a*1000));
        }else if(a==b || a==c){
            System.out.println(1000+(a*100));
        } else if (b==c) {
            System.out.println(1000+(b*100));
        }else {
            System.out.println((Math.max(a,Math.max(b,c)))*100);
        }
    }
}
