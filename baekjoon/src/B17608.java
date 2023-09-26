import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B17608 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        int count = 1;

        Stack<Integer> stk = new Stack<>();

        for(int i = 0; i < n; i++){
            stk.push(Integer.parseInt(input.readLine()));
        }
        int max = stk.peek();
        for(int i = 0; i < n; i++){
            if(stk.peek() > max){
                max = stk.pop();
                count++;
            }else{
                stk.pop();
            }
        }
        System.out.println(count);
    }
}
