import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(input.readLine());
        int[] que = new int[n];
        int front = 0;
        int rear = 0;

        for (int i = 0; i < n; i++) {
            String[] commands = input.readLine().split(" ");
            if (commands[0].equals("push")) {
                que[rear] = Integer.parseInt(commands[1]);
                rear++;
            } else if (commands[0].equals("pop")) {
                if (front == rear) {
                    output.write("-1\n");
                } else {
                    output.write(que[front] + "\n");
                    front++;
                }
            } else if (commands[0].equals("size")) {
                output.write(rear - front + "\n");
            } else if (commands[0].equals("empty")) {
                if (front == rear) {
                    output.write("1\n");
                } else {
                    output.write("0\n");
                }
            } else if (commands[0].equals("front")) {
                if (front == rear) {
                    output.write("-1\n");
                } else {
                    output.write(que[front] + "\n");
                }
            } else if (commands[0].equals("back")) {
                if (front == rear) {
                    output.write("-1\n");
                } else {
                    output.write(que[rear - 1] + "\n");
                }
            }
        }
        output.flush();
        output.close();
    }
}
