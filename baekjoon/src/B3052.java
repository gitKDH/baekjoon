
import java.util.Scanner;

public class B3052 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int[] a = new int[10];
        int b = 42;
        int diff = 0;
        boolean boo;

        for(int i = 0; i < 10; i++){
            a[i] = value.nextInt();
            a[i] %= b;
        }
        for(int i = 0; i < 10; i++){
            boo = false;
            for(int k = i + 1; k < 10; k++) {
                if (a[i] == a[k]) {
                    boo = true;
                    break;
                }
            }
                if(boo == false){
                    diff += 1;
                }
            }
            System.out.println(diff);
        }
    }

