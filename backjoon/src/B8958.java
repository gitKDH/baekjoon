import java.util.Scanner;

public class B8958 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        int num = value.nextInt();

        for(int i = 0; i < num; i++) {
            String input = value.next();
            int count = 0;
            int sum = 0;
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == 'O') {
                    count++;
                    sum += count;
                }
                else count=0;
            }
            System.out.println(sum);
        }

    }
}
