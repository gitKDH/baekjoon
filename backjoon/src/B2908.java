import java.util.Scanner;

public class B2908 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        String a = value.next();
        String b = value.next();

        StringBuffer ar = new StringBuffer(a);
        StringBuffer br = new StringBuffer(b);

        String newa = String.valueOf(ar.reverse());
        String newb = String.valueOf(br.reverse());

        int ina = Integer.parseInt(newa);
        int inb = Integer.parseInt(newb);

        if(ina > inb){
            System.out.println(ina);
        }else System.out.println(inb);

    }
}
