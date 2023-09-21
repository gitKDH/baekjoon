import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Random random = new Random();
        int n = input.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = random.nextInt(10);
        }

        reverse(a);
        copy(a,b);
        System.out.println("sumOf 메소드 수행 결과 : " + sumOf(a));
        System.out.println("copy 메소드 수행 결과 : " + Arrays.toString(b));
        rcopy(a,b);
        System.out.println("rcopy 메소드 수행 결과 : " + Arrays.toString(b));


    }
    static void reverse(int[] a){
        System.out.println(Arrays.toString(a));
        for(int i = 0; i < a.length/2; i++){
            System.out.println("a["+i+"]"+"와 a["+(a.length-i-1)+"]를 교환합니다.");
            int temp = a[a.length-i-1];
            a[a.length-i-1] = a[i];
            a[i] = temp;
            System.out.println(Arrays.toString(a));
        }
    }
    static int sumOf(int[] a){
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            sum += a[i];
        }
        return sum;
    }
    static void copy(int[] a, int[] b){
        for(int i = 0; i < a.length; i++){
            b[i] = a[i];
        }
    }
    static void rcopy(int[] a, int[] b){
        for(int i = 0; i < a.length/2; i++){
            b[i] = a[a.length-i-1];
            b[a.length-i-1] = a[i];
        }
    }

}
