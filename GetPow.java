import java.util.Scanner;
public class NumberPow {
    public static void main(String[] args) {

        int number, pow, result;
        result = 1;
        Scanner Input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        number = Input.nextInt();
        System.out.print("Please enter the power of the number: ");
        pow = Input.nextInt();

        for (int i = 0; i < pow; i++) {
            result *= number;
        }
        System.out.println(number + "^" + pow + " = " + result);
    }
}
