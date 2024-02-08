import java.util.Scanner;
public class SearchAndReplace {
    public static void main(String[] args) {

        String str;
        String ValueInString;
        String NewValue;
        int i;
        Scanner Input = new Scanner(System.in);
        System.out.print("The string you want to change: ");
        str = Input.nextLine();
        System.out.print("First character: ");
        ValueInString = Input.nextLine();
        System.out.print("Second character: ");
        NewValue = Input.nextLine();

        StringBuilder result = new StringBuilder(str);
        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ValueInString.charAt(0)) {
                result.setCharAt(i, NewValue.charAt(0));
                System.out.print(result.charAt(i));
            }
            else
                System.out.print(str.charAt(i));
        }
    }
}
