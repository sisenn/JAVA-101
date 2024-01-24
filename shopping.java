import java.util.Scanner;
public class shopping {
    public static void main(String[] args) {

        double pear, apple, bananas, tomato, eggplant, total;
        double pearPrice = 2.14, applePrice = 3.67, bananasPrice = 0.95, tomatoPrice = 1.11, eggplantPrice = 5.00;

        Scanner Input = new Scanner(System.in);
        System.out.print("kilogram of pears: ");
        pear = Input.nextDouble();

        System.out.print("kilogram of apple: ");
        apple = Input.nextDouble();

        System.out.print("kilogram of bananas: ");
        bananas = Input.nextDouble();

        System.out.print("kilogram of tomato: ");
        tomato = Input.nextDouble();

        System.out.print("kilogram of eggplant: ");
        eggplant = Input.nextDouble();

        total = (pear * pearPrice) + (apple * applePrice) + (bananas * bananasPrice) + (tomato * tomatoPrice) + (eggplant * eggplantPrice);
        System.out.print("Your total payment: " + total);
    }
}
