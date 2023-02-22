import java.util.Scanner;

public class Alarm {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int hour = value.nextInt();
        int minute = value.nextInt();

        if(minute >= 45){
            minute -= 45;
        } else if (minute < 45) {
            minute = 60-(45-minute);
            hour = hour-1;
            if(hour == -1){
                hour = 23;
            }
        }
        System.out.printf(String.valueOf(hour) + " " +String.valueOf(minute));
    }
}
