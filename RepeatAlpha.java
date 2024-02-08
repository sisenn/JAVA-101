import java.util.Scanner;

public class RepeatAlpha {
    public static void main(String[] args) {

        String str;
        int i = 0;
        int line;
        Scanner Input = new Scanner(System.in);
        System.out.print(">");
        str = Input.nextLine();
        while (i < str.length()) {
            if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                line = str.charAt(i);
                //System.out.println("line: " + line);
                for (int j = 97; j < line + 1; j++)
                    System.out.print(str.charAt(i));
            }
            else if(str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                line = str.charAt(i);
                for (int k = 65; k <= line; k++)
                    System.out.print(str.charAt(i));
            }
            else
                System.out.print(str.charAt(i));
            i++;
        }
    }
}
