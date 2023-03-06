import java.util.Scanner;

public class B10818 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        int num = value.nextInt();
        int[] list = new int[num];


        for(int i = 0; i < num; i++){
            int input = value.nextInt();
            list[i] = input;
        }
        int max = list[0];
        int min = list[0];

        for(int i = 0; i < num; i++){
            if(list[i] > max){
                max = list[i];
            }
        }
        for(int i = 0; i < num; i++){
            if(list[i] < min){
                min = list[i];
            }
        }
        System.out.print(min+" ");
        System.out.print(max);
    }
}
