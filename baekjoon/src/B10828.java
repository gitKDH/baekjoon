import java.util.Scanner;
import java.io.*;

public class B10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(in.readLine());
        int[] stk = new int[N];
        int ptr = 0;

        for (int i = 0; i < N; i++) {
            String[] commands = in.readLine().split(" ");
//            for (int j = 0; j<commands.length; j++){
//                System.out.println(Integer.parseInt(commands[1]));
//            }
            if (commands[0].equals("push")) {
                int temp = Integer.parseInt(commands[1]);
                stk[ptr] = temp;
                ptr++;
            } else if (commands[0].equals("pop")) {
                if (ptr == 0) {
                    System.out.println("-1");
                    continue;
                }
                --ptr;
                System.out.println(stk[ptr]);
            } else if (commands[0].equals("size")) {
                System.out.println(ptr);
            } else if (commands[0].equals("empty")) {
                if(ptr == 0){
                    System.out.println("1");
                }else {
                    System.out.println("0");
                }
            } else if (commands[0].equals("top")) {
                if(ptr == 0){
                    System.out.println("-1");
                    continue;
                }
                System.out.println(stk[ptr-1]);
            }
        }
    }
}
