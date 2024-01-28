import java.util.Scanner;
public class numbersAverage {
    public static void main(String[] args) {

        int number, total, i, count, result;
        count = 0;
        total = 0;
        Scanner Input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        number = Input.nextInt();

        for(i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                count++;
                total += i;
            }
        }
        result = total / count;
        System.out.println("The average of the numbers from 0 to " + number + " that are divisible by 12 = " + result);
    }
}
