import java.util.Scanner;
public class combination {
    public static void main(String[] args) {

        int n, r, x, factorialResultN, factorialResultR, lastFactorial, result;
        factorialResultN = 1;
        factorialResultR = 1;
        lastFactorial = 1;
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        n = Input.nextInt();
        System.out.print("Enter the value of r: ");
        r = Input.nextInt();
        x = (n-r);

        for (int i = 1; i <= n; i++) {
            factorialResultN *= i;
        }
        for (int i=1; i <= r; i++) {
            factorialResultR *= i;
        }
        for (int i = 1; i <= x; i++) {
            lastFactorial *= i;
        }
        result = factorialResultN / (factorialResultR * lastFactorial);
        System.out.println("C(" + n + "," + r + ") = " + result);
    }
}
