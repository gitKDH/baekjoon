import java.util.Scanner;

public class SeqSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] x = new int[n];
        for(int i = 0; i < n; i++){
            x[i] = input.nextInt();
        }

        int key = input.nextInt(); // 찾을 값

        int result = Search(x, n, key);

        if(result == -1){
            System.out.println("찾는 값 없음");
        }else {
            System.out.println("x[" + result + "]");
        }

    }
    static int Search(int[] a, int n, int key){
        int i = 0;

        while(true){
            if(i == n){
                return -1;
            }
            if(a[i] == key){
                return i;
            }
            i++;
        }
    }
}
