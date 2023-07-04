import java.util.Scanner;

public class Ppluszero {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        String first = value.next();
        String second = value.next();

        String result = first + second;

        int a = Integer.parseInt(first);
        int b = Integer.parseInt(second);

        if(Integer.parseInt(result) < 2 * a * b){
            System.out.println(2 * a * b);
        } else {
            System.out.println(result);
        }


    }


}
