import java.util.Scanner;
public class MaxAndMin {
    public static void main(String[] args) {

        int piece, number, min, max;

        Scanner Input = new Scanner(System.in);
        System.out.print("Please enter how many numbers you will specify: ");
        piece = Input.nextInt();

        System.out.print("Please enter 1. number = ");
        number = Input.nextInt();
        min = number;
        max = number;
        for (int i = 2; i <= piece; i++)
        {
            System.out.print("Please enter " + i + ". number = ");
            number = Input.nextInt();
            if (number < min)
            {
                min = number;
            }
            if (number > max)
            {
                max = number;
            }
        }
        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
    }
}
