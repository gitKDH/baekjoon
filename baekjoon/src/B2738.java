import java.util.Scanner;

public class B2738 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int n = value.nextInt();
        int m = value.nextInt();
        int arr1[][] = new int[n][m];
        int arr2[][] = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j<m; j++){
                arr1[i][j] = value.nextInt();
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j<m; j++){
                arr2[i][j] = value.nextInt();
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.println(arr1[i][j] + arr2[i][j] + "");
            }
        }
    }
}
