import java.util.Scanner;

public class B15596 {
    public void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] a = new int[n];
        Test test = new Test();
        test.sum(a);
    }
    public class Test{
        long sum(int[] a){
            long ans = 0;
            for(int i = 0; i < a.length; i++){
                ans+=a[i];
            }
            return ans;
        }
    }
}
