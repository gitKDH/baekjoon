import java.util.Scanner;

public class B2562 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        int[] a = new int[9];
        int max = 0;
        int index = 0;

        for(int i = 0; i < 9; i++){
            int b = value.nextInt();
            a[i] = b;
        }
        for(int i = 0; i < 9; i++){
            if(a[i] > max){
                max = a[i];
                index = i+1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
