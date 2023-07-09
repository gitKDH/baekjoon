import java.util.Scanner;

public class Ppluszero2 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        int a = value.nextInt();
        int b = value.nextInt();
        Solution result = new Solution();
        System.out.println(result.solution(a, b));
    }

    static class Solution {
        public int solution(int a, int b) {
            int answer = 0;
            String c = Integer.toString(a);
            String d = Integer.toString(b);

            String word = c + d;
            String word2 = d + c;

            if (Integer.parseInt(word) < Integer.parseInt(word2)) {
                answer = Integer.parseInt(word2);
            } else {
                answer = Integer.parseInt(word);
            }
            return answer;
        }
    }
}
