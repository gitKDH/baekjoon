import java.util.Scanner;

public class B4344 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int C = input.nextInt();

        for(int i = 0; i < C; i++){
            int N = input.nextInt();
            int[] score = new int[N];
            int total = 0;
            for(int j = 0; j < N; j++){
                score[j] = input.nextInt();
                total += score[j];
            }
            float avg = total/N;
            int over = 0;
            for(int j = 0; j < N; j++){
                if(score[j] > avg){
                    over += 1;
                }
            }
            float result = (float)over/N * 100;
            System.out.printf("%.3f%c%n",result,'%');
        }
    }
}
