import java.util.Scanner;

public class Oven {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int hour = value.nextInt();
        int minute = value.nextInt();
        int setTime = value.nextInt();
        int afterTime = hour*60 + minute + setTime;
        int lastTime = afterTime / 60;
        int lastMinute = afterTime % 60;


        if(lastTime >= 24){
            lastTime = lastTime % 24;
        }

        System.out.println(lastTime + " " + lastMinute);
    }
}
