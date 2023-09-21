public class PrimeNumber2 {
    public static void main(String[] args) {
        int ptr = 0;
        int[] prime = new int[500];

        prime[ptr++] = 2; // 2는 소수이기 때문에 prime[0]에 2를 적재함.

        for(int n = 3; n <= 1000; n += 2){ // 3부터 1000까지, 홀수만 검사하기 때문에 2씩 더함.
            int i;
            for(i = 1; i < ptr; i++){
                if(n % prime[i] == 0)
                    break;
            }
            if(ptr == i)
                prime[ptr++] = n;
        }

        for(int i = 0; i < ptr; i++)
            System.out.println(prime[i]);
    }
}
