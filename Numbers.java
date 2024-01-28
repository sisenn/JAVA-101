import java.util.Scanner;
public class Numbers {
    public static void main(String[] args) {

        int number, total;
        total = 0;
        boolean condition = false;
        Scanner Input = new Scanner(System.in);

        do {
            System.out.print("Please enter a number: ");
            number = Input.nextInt();
            if (number % 4 == 0 || number % 2 == 0) {
                total += number;
                condition = true;
            }
            else {
                condition = false;
            }
        }while(condition == true);
        System.out.print("Total: " + total);
    }
}
