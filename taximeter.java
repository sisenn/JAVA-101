import java.util.Scanner;
public class taximeter {
    public static void main(String[] args) {

        double distance, payment;

        Scanner Input = new Scanner(System.in);
        System.out.print("Please indicate how many kilometers the location you want to go is: ");
        distance = Input.nextDouble();
        payment = (distance < 10) ? 20 : ((distance * 2.20) + 20);
        System.out.print("Your payment amount: " + payment + "TL");
    }
}
