import java.util.Scanner;
public class HarmonicNumbers {
    public static void main(String[] args) {

        double number;
        double result;
        result = 0.0;
        Scanner Input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        number = Input.nextDouble();

        int i = 1;
        while(i <= number) {
            result += (1.0)/i;
            i++;
        }
        System.out.println("Sum of harmonic numbers: " + result);
    }
}
