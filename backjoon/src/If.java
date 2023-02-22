import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int a = value.nextInt();
        int b = value.nextInt();
        if(a > b){
            System.out.println(">");
        } else if (a < b) {
            System.out.println("<");
        }else System.out.println("==");
    }
}
