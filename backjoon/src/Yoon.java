import java.util.Scanner;

public class Yoon {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int a = value.nextInt();
        Boolean yoon = false;
        if(a % 4 == 0) {
            yoon = true;
            if(a % 100 ==0){
                yoon = false;
                if(a % 400 == 0){
                    yoon = true;
                }
            }
        }
        if(yoon == true){
            System.out.println("1");
        }else System.out.println("0");
    }
}
