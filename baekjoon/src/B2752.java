import java.util.Scanner;

public class B2752 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max;
        int min;
        int middle;

        if(a > b && a > c){
            max = a;
        } else if (b > a && b > c) {
            max = b;
        }else {
            max = c;
        }

        if(a < b && a < c){
            min = a;
        } else if (b < a && b < c) {
            min = b;
        }else {
            min = c;
        }

        if(a != max && a!=min){
            middle = a;
        } else if (b != max && b!= min) {
            middle = b;
        }else {
            middle = c;
        }

        System.out.println(min + " " + middle + " " + max);
    }
}
