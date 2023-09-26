import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class B2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(input.readLine());
        Queue<Integer> que = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            que.add(i + 1);
        }
        System.out.println(card(que));

    }

    public static int card(Queue<Integer> que) {
        int x = 1;
        while (que.size() > 1) {
            que.poll();
            que.add(que.poll());
            if (que.size() == 1) {
                x = que.peek();
            }
        }
        return x;
    }
}
