import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class B11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String[] str = input.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);

        Queue<Integer> que = new LinkedList<>();
        Queue<Integer> result = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            que.add(i + 1);
        }
        while (que.size() > 0) {
            for (int i = 0; i < K - 1; i++) {
                que.add(que.poll());
            }
            result.add(que.poll());
        }
        System.out.print("<");
        for(int i = 0; i < N-1; i++){
            System.out.print(result.poll());
            System.out.print(", ");
        }
        System.out.print(result.peek());
        System.out.print(">");
    }
}
