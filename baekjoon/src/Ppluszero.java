import java.util.Scanner;

public class Ppluszero {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        int a = value.nextInt();
        int b = value.nextInt();
        Solution result = new Solution();
        System.out.println(result.solution(a,b));
    }

    static class Solution {
        public int solution(int a, int b) {
            int answer = 0;
            String c = Integer.toString(a);
            String d = Integer.toString(b);

            String word = c + d;
            if(Integer.parseInt(word) < 2 * a * b){
                answer = 2 * a * b;
            }else{
                answer = Integer.parseInt(word);
            }
            return answer;
        }
    }
}
