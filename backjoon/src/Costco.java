import java.awt.*;
import java.util.Scanner;

public class Costco {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int total = value.nextInt();
        int n = value.nextInt();
        int price = 0;

        for(int i=0; i < n; i++){
            int a = value.nextInt();
            int b = value.nextInt();
            int c = a * b;
            price += c;
        }
        if(total == price){
            System.out.println("Yes");
        }else System.out.println("No");

    }
}
