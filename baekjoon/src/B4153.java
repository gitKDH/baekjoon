import java.util.Scanner;

public class B4153 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){
            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();
            if(a == 0 & b == 0 & c == 0){
                break;
            }
            int result = (int) (Math.pow(a,2) + Math.pow(b,2));
            int result2 = (int)(Math.pow(c,2));
            if(result == result2){
                System.out.println("right");
            }else {
                System.out.println("wrong");
            }
        }
    }
}
