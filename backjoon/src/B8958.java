import java.util.Scanner;

public class B8958 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            String Quiz = input.next();
            int score = 0;
            int result = 0;
            char[] QuizChar = Quiz.toCharArray();
            for (int j = 0; j < QuizChar.length; j++) {
                if (QuizChar[j] == 'O') {
                    score += 1;
                    result += score;
                } else {
                    score = 0;
                }
            }
            System.out.println(result);
        }
    }
}
