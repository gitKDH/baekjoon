import java.util.Scanner;

public class B10807 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        int N = value.nextInt();
        int[] list = new int[N];
        for(int i = 0; i < N; i++){
            list[i] = value.nextInt();
        }
        int v = value.nextInt();
        int result=0;

        for(int i = 0; i < N; i++){
            if(list[i] == v){
                result+=1;
            }
        }
        System.out.println(result);
    }
}
