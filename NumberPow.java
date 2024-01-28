import java.util.Scanner;
public class NumberPow {
    public static void main(String[] args) {

        int number;
        int output1, output2;
        Scanner Input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        number = Input.nextInt();

        for (int i = 0; i < number; i++) {
            output1 = (int) Math.pow(4,i);
            if (output1 < number) {
                System.out.println("4^" + i + " = " + output1);
            }
            output2 = (int) Math.pow(5,i);
            if (output2 < number) {
                System.out.println("5^" + i + " = " + output2);
            }
        }
    }
}
