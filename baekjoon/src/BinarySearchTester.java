import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = input.nextInt();
        int[] x = new int[num];

        System.out.print("x[0] : ");
        x[0] = input.nextInt();

        for(int i = 1; i < num; i++){
            do{
                System.out.print("x["+ i+ "] : ");
                x[i] = input.nextInt();
            }while(x[i] < x[i - 1]);
        }

        System.out.println("검색할 값 : ");
        int ky = input.nextInt();

        int idx = Arrays.binarySearch(x, ky);

        if(idx < 0)
            System.out.println("요소가 없음");
        else
            System.out.println("그 값은 x[" + idx + "]");
    }
}
