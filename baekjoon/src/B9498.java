import java.util.Scanner;

public class B9498 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        int exam = value.nextInt();

        if(exam >= 90){
            System.out.println("A");
        } else if (exam >= 80) {
            System.out.println("B");
        } else if (exam >= 70) {
            System.out.println("C");
        } else if (exam >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
