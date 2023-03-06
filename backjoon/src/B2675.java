import java.util.Scanner;

public class B2675 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        int num = value.nextInt(); //입력할 케이스의 수

        for(int i = 0; i < num; i++){
            int count = value.nextInt(); //반복할 숫자와
            String text = value.next(); //케이스 문자열
            for(int j = 0; j < text.length(); j++){
                for(int k = 0; k < count; k++){
                    System.out.print(text.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
