import java.util.Scanner;

public class StarPira {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        spira(n);
    }
    static void spira(int n){
        for (int i = 1; i <= n; i++) {					// i 행( i = 1, 2, ... , n )
            for (int j = 1; j <= n - i; j++)			// n - i 개의 ' ' 을 출력
                System.out.print(' ');
            for (int j = 1; j <= (i-1)*2+1; j++)	// (i - 1) * 2 + 1 개의 '*' 을 출력
                System.out.print('*');
            System.out.println();									// 줄바꿈
        }
    }
}
