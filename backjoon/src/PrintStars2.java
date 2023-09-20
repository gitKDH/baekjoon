import java.util.Scanner;

public class PrintStars2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int w = input.nextInt();

        for(int i =0; i < n/w; i++){
            System.out.print("*".repeat(w));
            System.out.println(" ");
        }
        int rest = n%w;
        if(rest!=0){
            System.out.println("*".repeat(rest));
        }
    }
}
