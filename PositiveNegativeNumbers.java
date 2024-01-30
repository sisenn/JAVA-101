import java.util.Scanner;
public class Numbers {

    static void checkNumber(int number) {
        int originalNumber = number;
        while (number >= 0) {
            System.out.print(number + " ");
            number -= 5;
        }
        number += 5;
        while (number < originalNumber) {
            number += 5;
            System.out.print(number + " ");
        }

    }
    public static void main(String[] args) {

        int number;
        Scanner Input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        number = Input.nextInt();
        checkNumber(number);

    }
}
