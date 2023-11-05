import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class B25305 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int n = value.nextInt();
        int k = value.nextInt();

        int[] student = new int[n];

        for(int i = 0; i < n; i++){
            student[i] = value.nextInt();
        }
        Arrays.sort(student);
        System.out.println(student[student.length-k]);
    }
}
