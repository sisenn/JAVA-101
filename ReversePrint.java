import java.util.Scanner;
public class ReversePrint {
    public static void main(String[] args) {

        String str;
        int StringLong;
        int i = 0;
        Scanner Input = new Scanner(System.in);
        System.out.print("> ");
        str = Input.nextLine();

        while (i < str.length())
            i++;
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(str.charAt(j));
        }
    }
}
