import java.util.Scanner;
public class Maths {
    public static void main(String[] args) {

        int number1;
        int number2;
        int number;
        int resultEk;

        Scanner Input = new Scanner(System.in);
        System.out.println("Please enter 2 number: ");
        number1 = Input.nextInt();
        number2 = Input.nextInt();

        if (number1 > number2)
            number = number1;
        else
            number = number2;

        int i = number;
        while (i > 1) {
            if (number1 % i == 0 && number2 % i == 0) {
                System.out.println("Ebob = " + i);
                break;
            }
            else
                i--;
        }
        resultEk = (number1*number2) / i;
        System.out.println("Ekok = " + resultEk);
    }
}
