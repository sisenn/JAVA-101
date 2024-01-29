import java.util.Scanner;
public class Palindrome {

    static boolean isPalindrome(int number) {

        int reverseNumber = 0;
        int temp = number;
        int originalNumber = number;

        while (number > 0) {
            temp = number % 10;
            reverseNumber = (reverseNumber * 10) + temp;
            number = number / 10;
        }
        if (originalNumber == reverseNumber)
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    public static void main(String[] args) {

        int enterNumber;

        Scanner Input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        enterNumber = Input.nextInt();
        isPalindrome(enterNumber);
        if (isPalindrome(enterNumber))
            System.out.print(enterNumber + " is a palindrome number.");
        else
            System.out.print(enterNumber + " is not a palindrome number.");
    }
}
