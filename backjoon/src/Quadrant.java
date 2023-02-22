import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int x = value.nextInt();
        int y = value.nextInt();
        int num = 0;

        if(x > 0 && y > 0){
            num = 1;
        } else if (x < 0 && y > 0) {
            num = 2;
        } else if (x < 0 && y < 0) {
            num = 3;
        }else num = 4;
        System.out.println(num);
    }
}
