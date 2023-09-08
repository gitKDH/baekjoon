import java.util.Scanner;

public class B5554 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        int HomeToSchool = value.nextInt();
        int SchoolToPC = value.nextInt();
        int PCToAcademy = value.nextInt();
        int AcademyToHome = value.nextInt();

        int result = HomeToSchool + SchoolToPC + PCToAcademy + AcademyToHome;

        int minute = result/60;
        int second = result%60;

        System.out.println(minute);
        System.out.println(second);

    }
}
