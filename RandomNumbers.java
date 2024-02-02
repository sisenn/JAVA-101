import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class RandomNumbers {

    static int isWin(int right) {
        if (right == 0)
            return 0;
        else
            return 1;
    }
    public static void main(String[] args) {

        int guess;
        int number;
        int right = 5;
        int count = 0;
        int j = 0;
        int[] wrongGuess = new int[5];

        Random randomNumber = new Random();
        number = randomNumber.nextInt(100);

        System.out.println(number);
        Scanner Input = new Scanner(System.in);

        while (right > 0){
            System.out.print("Guess something between 0-100 : ");
            guess = Input.nextInt();
            wrongGuess[j] = guess;
            j++;
            if (guess >= 0 && guess < 100) {
                if (guess != number) {
                    System.out.println("Wrong guess!");
                    if (guess > number) {
                        System.out.println("Hint: The number you guessed is greater than the secret number.");
                    }
                    else
                        System.out.println("Hint: The number you guessed is less than the secret number.");
                    right--;
                    count++;
                    if (right > 0)
                        System.out.println("Remember, you have " + right + " guesses left.");
                    if (isWin(right) == 0) {
                        System.out.println("You're out of guesses. You lost :(");
                    }
                }
                else {
                    System.out.println("Congratulations! You found the number: " + number);
                    break;
                }
            }
            else {
                System.out.println("The number you entered is not between 0-100.");
            }
        }
        System.out.println("Numbers you keep: " + Arrays.toString(wrongGuess));
    }
}
