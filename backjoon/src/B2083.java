import java.util.Scanner;

public class B2083 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        boolean loop = true;

        while(loop){
            String name = value.nextLine();
            int age = value.nextInt();
            int kg = value.nextInt();

            if(age>17&&kg>80){
                System.out.println(name + "Senior");
            }else{
                System.out.println(name + "Junior");
            }

            if(name == "#"){
                loop = false;
            }
        }
    }
}
