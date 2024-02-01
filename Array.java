import java.util.Scanner;
import java.util.Arrays;
public class Array {
    public static void main(String[] args) {

        int arrayMembers, sizeArray;
        int[] list;

        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        sizeArray = Input.nextInt();
        list = new int[sizeArray];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < sizeArray; i++) {
            System.out.print(i+1 + ". member = ");
            arrayMembers = Input.nextInt();
            list[i] = arrayMembers;
        }
        Arrays.sort(list);
        System.out.println("Sort List ----> " + Arrays.toString(list));
    }
}
