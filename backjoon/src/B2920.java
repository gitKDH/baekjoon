import java.util.Scanner;

public class B2920 {
    public static void main(String[] args) {
        int num = 8;
        int[] array = new int[num];
        String result = "";
        Scanner value = new Scanner(System.in);



        for(int i = 0; i < num; i++){
            array[i] = value.nextInt();
        }
        for(int i = 0; i < array.length -1; i++){
            if(array[i] == array[i+1] - 1){
                result = "ascending";
            } else if (array[i] == array[i+1]+1) {
                result = "descending";
            }else {
                result = "mixed";
                break;
            }
        }
        System.out.println(result);

    }
}
