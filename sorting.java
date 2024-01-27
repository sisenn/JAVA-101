import java.util.Scanner;
public class sorting {
    public static void main(String[] args) {

        int number1, number2, number3;
        int firstNumber, secondNumber, thirdNumber;
        Scanner Input = new Scanner(System.in);

        System.out.println("Please enter three different numbers: ");
        number1 = Input.nextInt();
        number2 = Input.nextInt();
        number3 = Input.nextInt();

        if (number1 > number2 && number1 > number3) {
            firstNumber = number1;
            if (number2 > number3) {
                secondNumber = number2;
                thirdNumber = number3;
            }
            else {
                secondNumber = number3;
                thirdNumber = number2;
            }
            System.out.println(firstNumber + ">" + secondNumber + ">" + thirdNumber);
        }
        else if (number2 > number1 && number2 > number3) {
            firstNumber = number2;
            if (number1 > number3) {
                secondNumber = number1;
                thirdNumber = number3;
            }
            else {
                secondNumber = number3;
                thirdNumber = number1;
            }
            System.out.println(firstNumber + ">" + secondNumber + ">" + thirdNumber);
        }
        else if(number3 > number1 && number3 > number2) {
            firstNumber = number3;
            if (number1 > number2) {
                secondNumber = number1;
                thirdNumber = number2;
            }
            else {
                secondNumber = number2;
                thirdNumber = number1;
            }
            System.out.println(firstNumber + ">" + secondNumber + ">" + thirdNumber);
        }
    }
}
