import java.util.Scanner;
public class KdvAccount {
    public static void main(String[] args) {
        double Kdv;
        double amount;
        double KdvCount;

        Scanner Input = new Scanner(System.in);

        System.out.print("Amount of money: ");
        amount = Input.nextDouble();
        Kdv = (amount <= 1000) ? (0.18 * amount) : (0.08 * amount);
        System.out.println("Amount of KDV: " + Kdv);
        KdvCount = (amount + Kdv);
        System.out.print("Price with KDV: " + KdvCount);
    }
}
