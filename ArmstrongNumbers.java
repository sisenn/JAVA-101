import java.util.Scanner;
public class ArmstrongNumbers {
    public static void main(String[] args) {

        int number;
        int count = 0;
        int tempNumber;
        int basValue;
        int result = 0;
        int basPow;

        Scanner Input = new Scanner(System.in);
        System.out.print("Please emter a number: ");
        number = Input.nextInt();
        tempNumber = number;

        while (tempNumber != 0) {
            tempNumber /= 10;
            count++;
        }

        tempNumber = number;
        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            // 1*1*1*1 = 1^4
            basPow = 1;
            for (int i = 1; i <= count; i++) {
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;
        }

        if (result == number) {
            System.out.println(number + " is a Armstrong number.");
        } else {
            System.out.println(number + " is not a Armstrong number.");
        }
    }
}
