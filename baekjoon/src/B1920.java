import java.util.Arrays;
import java.util.Scanner;

public class B1920 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt(); // 배열의 길이 n 입력받음
        int[] n_list = new int[n]; // 길이가 n인 배열 생성
        for (int i = 0; i < n; i++) { // 배열 입력받음
            n_list[i] = input.nextInt();
        }
        Arrays.sort(n_list); // 오름차순으로 정렬

        int m = input.nextInt();
        int[] m_list = new int[m];
        for (int i = 0; i < m; i++) {
            m_list[i] = input.nextInt();
        }

        for(int i = 0; i < m; i++){ //찾는 수가 n_list에 있는지 확인해야하므로 m만큼 돌린다.
            System.out.println(binarySearch(n_list, m_list[i]));
        }
    }

    static int binarySearch(int[] n_list, int key) {
        int pl = 0;
        int pr = n_list.length - 1;

        do {
            int pc = (pl + pr) / 2;
            if (n_list[pc] == key) {
                return 1; // 맞으면 return 1
            } else if (key > n_list[pc]) {
                pl = pc + 1;
            } else {
                pr = pc - 1;
            }
        } while (pl <= pr); // - 실패 이유 : while문 조건을 (pl >= pr로 걸어놨었음)
        return 0; // while문동안 key값과 일치하지 않으면 0을 return
    }
}
