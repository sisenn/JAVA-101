import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {

        int number, total;
        total = 0;

        Scanner Input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        number = Input.nextInt();

        for (int i = 1; i < number; i++)
        {
            if (number % i == 0)
            {
                total += i;
            }
        }
        if (total == number)
        {
            System.out.println("The number " + number + " is a perfect number.");
        }
        else
        {
            System.out.println("The number " + number + " is not a perfect number.");
        }
    }
}
