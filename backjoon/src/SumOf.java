public class SumOf {
    public static void main(String[] args) {
        System.out.println(sumof(6,4));
    }
        public static int sumof(int a, int b){
            int sum = 0;

            if(a < b){
                for(int i = a; i <= b; i++){
                    sum+=i;
                }
            }else {
                for(int i = b; i <= a; i++){
                    sum +=i;
                }
            }
            return sum;
        }
    }

