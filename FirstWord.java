import java.util.Scanner;

public class FirstWord {
    public static void main(String[] args) {

        String str;
        StringBuilder output = new StringBuilder();
        int i;
        int count;
        int k;
        Scanner Input = new Scanner(System.in);
        while (true) {
            System.out.print("Please enter a sentence. If you want to exit, type 'exit'.\n>");
            str = Input.nextLine();
            if (str.equals("exit"))
                break;
            else {
                i = 0;
                count = 0;
                while ((i < str.length() && (str.charAt(i) == ' ' || str.charAt(i) == '\t'))) {
                    i++;
                }
                k = i;
                while (i < str.length() && str.charAt(i) != ' ' && str.charAt(i) != '\t') {
                    count++;
                    i++;
                }
                for (int j = k; j < k + count; j++) {
                    output.append(str.charAt(j));
                }
                System.out.println(output.toString());
                output.setLength(0);
            }
        }
    }
}
