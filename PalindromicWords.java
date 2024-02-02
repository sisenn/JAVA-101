import java.util.Scanner;
import java.util.Arrays;
public class PalindromicWords {
    public static void main(String[] args) {

        String word;
        String reverseWord = "";
        int size;
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        word = Input.nextLine();
        size = word.length();

        while (size > 0) {
            reverseWord += word.charAt(size - 1);
            size--;
        }

        if (reverseWord.equals(word)) {
            System.out.println(word + " ----> " + reverseWord + " = is a palindromic word.");
        }
        else {
            System.out.println(word + " ----> " + reverseWord + " = is not a palindromic word.");
        }
    }
}