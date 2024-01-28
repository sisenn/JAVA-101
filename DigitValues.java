import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {

        int number, total, tempNumber, value;
        total = 0;

        Scanner Input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        number = Input.nextInt();
        tempNumber = number;

        while (number > 0) {
            value = tempNumber % 10;
            number = tempNumber / 10;
            tempNumber = number;
            total += value;
        }
        System.out.println("The sum of the digit values of the number: " + total);
    }
}
