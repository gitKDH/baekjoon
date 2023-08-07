import java.util.Arrays;
import java.util.Scanner;

public class Pnumerdenom { //다시
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner value = new Scanner(System.in);

        int a = value.nextInt();
        int b = value.nextInt();
        int c = value.nextInt();
        int d = value.nextInt();


        System.out.println(Arrays.toString(solution.solution(a, b, c, d)));
    }
    static class Solution {
        public int[] solution(int numer1, int denom1, int numer2, int denom2) {

            int[] answer = {};
            return answer;
        }
    }
}
