import java.util.Scanner;

public class Pflag {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        int a = value.nextInt();
        int b = value.nextInt();
        boolean flag = true;

        if(flag == false){
            System.out.println(a-b);
        }else{
            System.out.println(a+b);
        }
    }
}
