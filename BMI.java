import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {

        double length, weight, BMI;

        Scanner Input = new Scanner(System.in);

        System.out.print("Please enter your height (in meters): ");
        length = Input.nextDouble();

        System.out.print("Please enter your weight: ");
        weight = Input.nextDouble();

        BMI = weight / (length * length);
        System.out.print("Your Body Mass Index: " + BMI);

    }
}
