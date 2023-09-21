import java.util.Scanner;

public class B1267 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int N = value.nextInt();
        int K;
        int YoungSik = 0, MinSik = 0;
        for (int i = 0; i < N; i++) {
            K = value.nextInt();
            YoungSik += ((K / 30) + 1) * 10;
            MinSik += ((K / 60) + 1) * 15;
        }
        if (YoungSik == MinSik) {
            System.out.println("Y M " + YoungSik);
        } else if (YoungSik < MinSik) {
            System.out.println("Y " + YoungSik);
        } else if (YoungSik > MinSik) {
            System.out.println("M " + MinSik);
        }
    }
}
