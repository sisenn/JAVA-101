import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {

        int elementsNumber, previousNumber, result, currentNumber;
        result = 0;
        previousNumber = 0;
        currentNumber = 1;
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the number of elements of the Fibonacci series: ");
        elementsNumber = Input.nextInt();

        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < elementsNumber; i++) {
            System.out.print(result + " ");
            result = previousNumber + currentNumber;
            previousNumber = currentNumber;
            currentNumber = result;
        }
    }
}
