import java.util.Scanner;
public class AdvancedCalculator {
    //ANSI colors code
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";

    static void collection(int number1, int number2) {
        int result = number1 + number2;
        System.out.println(ANSI_YELLOW + number1 + " + " + number2 + " = " + result + ANSI_RESET);
    }

    static void removal(int number1, int number2) {
        int result = number1 - number2;
        System.out.println(ANSI_YELLOW + number1 + " - " + number2 + " = " + result + ANSI_RESET);
    }

    static void multiplication (int number1, int number2) {
        int result = number1 * number2;
        System.out.println(ANSI_YELLOW + number1 + " * " + number2 + " = " + result + ANSI_RESET);
    }

    static void division(int number1, int number2) {
        int result = number1 / number2;
        System.out.println(ANSI_YELLOW + number1 + " / " + number2 + " = " + result + ANSI_RESET);
    }

    static void power(int number1, int number2) {
        int result = (int) Math.pow(number1, number2);
        System.out.println(ANSI_YELLOW + number1 + " ^ " + number2 + " = " + result + ANSI_RESET);
    }

    static void factorial(int number1, int number2) {
        int factorialResult = 1;
        for (int i = number1; i > 0; i--) {
            factorialResult *= i;
        }
        System.out.println(ANSI_YELLOW + number1 + "! = " + factorialResult + ANSI_RESET);
        int factorialResult2 = 1;
        for (int i = number2; i > 0; i--) {
            factorialResult2 *= i;
        }
        System.out.println(ANSI_YELLOW + number2 + "! = " + factorialResult2 + ANSI_RESET);
    }

    static void mod(int number1, int number2) {
        int result = number1 % number2;
        System.out.println(ANSI_YELLOW + number1 + " % " + number2 + " = " + result + ANSI_RESET);
    }
    static void AreaAndPerimeter(int number1, int number2) {
        int area = number1 * number2;
        int perimeter = 2 * (number1 + number2);

        System.out.println(ANSI_YELLOW + "Area of rectangle: " + area);
        System.out.println("Perimeter of rectangle: " + perimeter);
    }


    public static void main(String[] args) {

        int number1;
        int number2;
        int selection;
        int result;

        while (true) {
            Scanner Input = new Scanner(System.in);
            System.out.println(ANSI_YELLOW + "Please Select the action you want to perform: ");
            System.out.println(ANSI_PURPLE + "1- Collection Process ---> (+)\n2- Removal Process ---> (-)\n3- Multiplication Operation ---> (*)");
            System.out.println("4- Division process ---> (/)\n5- Exponent Number Calculation ---> (^)");
            System.out.println("6- Factorial Calculation ---> (!)\n7- Getting Mod ---> (%)\n8- Rectangular Area and Perimeter Calculation" + ANSI_RESET);
            selection = Input.nextInt();

            System.out.print("Please enter a number: ");
            number1 = Input.nextInt();
            System.out.print("Please enter other number: ");
            number2 = Input.nextInt();

            if (selection == 1)
                collection(number1, number2);
            else if (selection == 2)
                removal(number1, number2);
            else if (selection == 3)
                multiplication(number1, number2);
            else if (selection == 4)
                division(number1, number2);
            else if (selection == 5)
                power(number1, number2);
            else if (selection == 6)
                factorial(number1, number2);
            else if (selection == 7)
                mod(number1, number2);
            else if (selection == 8)
                AreaAndPerimeter(number1, number2);
            else if (selection == 0)
                break;
            else
                System.out.println("Wrong selection!");
        }
    }
}
