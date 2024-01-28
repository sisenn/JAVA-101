import java.util.Scanner;
public class chineseZodiac {
    public static void main(String[] args) {
        int year;
        String chineseZodiac;

        Scanner Input = new Scanner(System.in);
        System.out.print("Please enter your birth year: ");
        year = Input.nextInt();

        if (year % 12 == 0) {
            chineseZodiac = "Monkey";
            System.out.println("Your chinese zodiac is " + chineseZodiac + "!");
        }
        else if (year % 12 == 1) {
            chineseZodiac = "Cockerel";
            System.out.println("Your chinese zodiac is " + chineseZodiac + "!");
        }
        else if (year % 12 == 2) {
            chineseZodiac = "Dog";
            System.out.println("Your chinese zodiac is " + chineseZodiac + "!");
        }
        else if (year % 12 == 3) {
            chineseZodiac = "Pig";
            System.out.println("Your chinese zodiac is " + chineseZodiac + "!");
        }
        else if (year % 12 == 4) {
            chineseZodiac = "Mouse";
            System.out.println("Your chinese zodiac is " + chineseZodiac + "!");
        }
        else if (year % 12 == 5) {
            chineseZodiac = "Ox";
            System.out.println("Your chinese zodiac is " + chineseZodiac + "!");
        }
        else if (year % 12 == 6) {
            chineseZodiac = "Tiger";
            System.out.println("Your chinese zodiac is " + chineseZodiac + "!");
        }
        else if (year % 12 == 7) {
            chineseZodiac = "Rabbit";
            System.out.println("Your chinese zodiac is " + chineseZodiac + "!");
        }
        else if (year % 12 == 8) {
            chineseZodiac = "Dragon";
            System.out.println("Your chinese zodiac is " + chineseZodiac + "!");
        }
        else if (year % 12 == 9) {
            chineseZodiac = "Snake";
            System.out.println("Your chinese zodiac is " + chineseZodiac + "!");
        }
        else if (year % 12 == 10) {
            chineseZodiac = "Horse";
            System.out.println("Your chinese zodiac is " + chineseZodiac + "!");
        }
        else if (year % 12 == 11) {
            chineseZodiac = "Sheep";
            System.out.println("Your chinese zodiac is " + chineseZodiac + "!");
        }
        else {
            System.out.println("The value is invalid!");
        }
    }
}
