import java.util.Scanner;

public class P5764 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        int n = value.nextInt();
        int answer = 0;
        if(n%2==1){
            for(int i = 0; i <= n; i++){
                if(i%2==1){
                    answer+=i;
                }
            }
        }else{
            for(int i = 0; i <= n; i++){
                if(i%2==0){
                    answer+=Math.pow(i,2);
                }
            }
        }
        System.out.println(answer);
    }
}
