import java.util.Scanner;

public class B2562 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] index = new int[9];
        int max = 0;
        int n = 0;

        for(int i = 0; i<index.length; i++){
            index[i] = input.nextInt();
        }
        for(int i = 0; i<=8; i++){
            if(index[i]>max){
                max = index[i];
                n = i;
            }
        }
        System.out.println(max);
        System.out.println(n+1);
    }
}
