import java.util.Scanner;
public class PrimeNumber2 {

    static boolean isPrime (int number) {
        if (number == 1)
            return false;
        if (number == 2)
            return (true);
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return (false);
            }
        }
        return (true);
    }
    public static void main(String[] args) {

        int number;
        Scanner Input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        number = Input.nextInt();

        if (isPrime(number)) {
            System.out.print(number + " is a prime number.");
        }
        else
            System.out.print(number + " is not a prime number.");
    }
}
