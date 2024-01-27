import java.util.Scanner;
public class horoscope {
    //ANSI color code
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {

        int day;
        String month;
        Scanner Input = new Scanner(System.in);
        System.out.print("Please enter your date of birth as day: ");
        day = Input.nextInt();
        Input.nextLine();
        System.out.print("Please enter your date of birth as month: ");
        month = Input.nextLine();

        if ((day >= 21 && day <= 31 && month.equals("march")) || (day >= 1 && day <= 20 && month.equals("april"))) {
            System.out.println("Your zodiac sign: " +  ANSI_RED +  "Aries" + ANSI_RESET);
        }
        else if ((day >= 21 && day <= 30 && month.equals("april")) || (day >= 1 && day <= 21 && month.equals("may"))) {
            System.out.println("Your zodiac sign: " +  ANSI_RED +  "Taurus" + ANSI_RESET);
        }
        else if ((day >= 22 && day <= 30 && month.equals("may")) || (day >= 1 && day <= 22 && month.equals("june"))) {
            System.out.println("Your zodiac sign: " +  ANSI_RED +  "Gemini" + ANSI_RESET);
        }
        else if ((day >= 23 && day <= 30 && month.equals("june")) || (day >= 1 && day <= 22 && month.equals("july"))) {
            System.out.println("Your zodiac sign: " +  ANSI_RED +  "Cancer" + ANSI_RESET);
        }
        else if ((day >= 23 && day <= 30 && month.equals("july")) || (day >= 1 && day <= 22 && month.equals("august"))) {
            System.out.println("Your zodiac sign: " +  ANSI_RED +  "Leo" + ANSI_RESET);
        }
        else if ((day >= 23 && day <= 30 && month.equals("august")) || (day >= 1 && day <= 22 && month.equals("september"))) {
            System.out.println("Your zodiac sign: " +  ANSI_RED +  "Virgo" + ANSI_RESET);
        }
        else if ((day >= 23 && day <= 30 && month.equals("september")) || (day >= 1 && day <= 22 && month.equals("october"))) {
            System.out.println("Your zodiac sign: " +  ANSI_RED +  "Libra" + ANSI_RESET);
        }
        else if ((day >= 23 && day <= 30 && month.equals("october")) || (day >= 1 && day <= 21 && month.equals("november"))) {
            System.out.println("Your zodiac sign: " +  ANSI_RED +  "Scorpio" + ANSI_RESET);
        }
        else if ((day >= 22 && day <= 30 && month.equals("november")) || (day >= 1 && day <= 21 && month.equals("december"))) {
            System.out.println("Your zodiac sign: " +  ANSI_RED +  "Sagittarius" + ANSI_RESET);
        }
        else if ((day >= 22 && day <= 30 && month.equals("december")) || (day >= 1 && day <= 21 && month.equals("january"))) {
            System.out.println("Your zodiac sign: " +  ANSI_RED +  "Capricorn" + ANSI_RESET);
        }
        else if ((day >= 22 && day <= 31 && month.equals("january")) || (day >= 1 && day <= 19 && month.equals("february"))) {
            System.out.println("Your zodiac sign: " +  ANSI_RED +  "Capricorn" + ANSI_RESET);
        }
        else if ((day >= 20 && day <= 30 && month.equals("february")) || (day >= 1 && day <= 20 && month.equals("march"))) {
            System.out.println("Your zodiac sign: " +  ANSI_RED +  "Pisces" + ANSI_RESET);
        }
        else
            System.out.println("Invalid value. Try again.");
    }
}
