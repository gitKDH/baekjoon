import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class B9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(input.readLine());

        for (int i = 0; i < n; i++) {
            boolean flag = true;
            String ps = input.readLine(); // 문자열 ps 입력
            Stack<Character> stk = new Stack<>(); // Char형 스택 생성
            for (int j = 0; j < ps.length(); j++) { // 문자열 ps 길이동안 ex - (())((
                if (ps.charAt(j) == '(') { // ps의 i번째가 '(' 이면
                    stk.push('('); // 스택에 '(' push
                } else { // ps의 j번째가 ')'이면
                    if (stk.isEmpty()) {  //스택이 비어있는데 ')'가 들어오면 짝이 안맞으므로 바로 NO 출력
                        System.out.println("NO");
                        flag = false;
                        break;
                    } else {
                        stk.pop();
                    }
                }
            }
            if (flag) {
                if (stk.isEmpty()) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
