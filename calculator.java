import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        double number1;
        double number2;
        double result;
        int sign;

        Scanner Input = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        number1 = Input.nextDouble();

        System.out.println("Please enter second number: ");
        number2 = Input.nextDouble();

        System.out.println("Please enter the mathematical operation you want to perform: ");
        System.out.println("------> 1 = \'+\' <------");
        System.out.println("------> 2 = \'-\' <------");
        System.out.println("------> 3 = \'*\' <------");
        System.out.println("------> 4 = \'/\' <------");
        sign = Input.nextInt();

        switch (sign) {

            case(1):
                result = number1 + number2;
                System.out.println("result: " + result);
                break;
            case(2):
                result = number1 - number2;
                System.out.println("result: " + result);
                break;
            case(3):
                result = number1 * number2;
                System.out.println("result: " + result);
                break;
            case(4):
                if(number1 != 0 && number2 != 0) {
                    result = number1 / number2;
                    System.out.println("result: " + result);
                }
                else
                    System.out.println("For division, enter a number other than 0!");
                break;
            default:
                System.out.println("Wrong sign!");
        }
    }
}
