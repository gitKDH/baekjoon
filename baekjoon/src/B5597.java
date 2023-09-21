import java.util.Scanner;

public class B5597 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int[] n = new int[31];

        for(int i = 1; i < 29; i++){
            int sm = value.nextInt();
            n[sm] = 1;
        }
        for(int i = 1; i<n.length; i++){
            if(n[i] != 1){
                System.out.println(i);
            }
        }
    }
}
