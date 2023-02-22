import java.util.Scanner;

public class GuGuDan {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int n = value.nextInt();
        for(int i = 1; i <= 9; i++){
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}
