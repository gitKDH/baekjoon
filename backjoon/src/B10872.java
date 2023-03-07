import java.util.Scanner;

public class B10872 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        int num = value.nextInt();
        int mid = value.nextInt();
        int[] result = new int[num];

        for(int i = 0; i < num; i++){
            result[i] = value.nextInt();
            }
        for(int i = 0; i < result.length; i++){
            if(result[i] < mid){
                System.out.print(result[i] + " ");
            }
        }
    }
}
