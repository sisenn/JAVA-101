import java.util.Scanner;
public class leapYear {
    public static void main(String[] args) {

        int year;

        Scanner Input = new Scanner(System.in);
        System.out.print("Please enter a year: ");
        year = Input.nextInt();

        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " is a leap year.");
        }
        else if (year % 100 == 0 && year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        }
        else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
