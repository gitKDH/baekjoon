import java.util.Scanner;

public class B28253 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        String a = value.next();
        String result = "";

        switch (a){
            case "SONGDO" :
                result = "HIGHSCHOOL";
                break;
            case "CODE" :
                result = "MASTER";
                break;
            case "2023" :
                result = "0611";
                break;
            case "ALGORITHM" :
                result = "CONTEST";
                break;
        }
        System.out.println(result);
    }
}
