import java.util.Scanner;

public class B10952 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);


        while(true){
            int a = value.nextInt();
            int b = value.nextInt();
            int sum = a + b;
            if(a == 0 && b == 0){
                break;
            }
            System.out.println(sum);
        }
    }
}
