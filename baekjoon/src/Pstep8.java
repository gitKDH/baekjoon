import java.util.Arrays;

public class Pstep8 {
    public static void main(String[] args) {
        Solution result = new Solution();
        int[] numbers = {1, 2, 3, 4, 5};
        int[] answer = result.solution(numbers);
        System.out.println(Arrays.toString(answer));
    }
}

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }
}
