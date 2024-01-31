import java.util.Arrays;
import java.util.Scanner;

public class MinMaxArray {
    public static void main(String[] args) {
        int[] arr = {12, -6, 34, -23, 87, 32};
        int min;
        int max;
        int x = arr.length -1 ;
        int number;
        int j = 0;
        int k = 0;
        int countArr2 = 0;
        int countArr3 = 0;

        Arrays.sort(arr);
        System.out.println("====================================");
        System.out.println("      ARRAY AND MİN-MAX VALUES      ");
        System.out.println(Arrays.toString(arr));
        min = arr[0];
        max = arr[x];

        System.out.println("min: " + min);
        System.out.println("max: " + max);

        System.out.println("====================================");
        System.out.println(Arrays.toString(arr));
        Scanner Input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        number = Input.nextInt();

        for(int i = 0; i < arr.length -1; i++) {
            if (arr[i] < number)
                    countArr2++;
            else
                countArr3++;
            }

        int[] arr2 = new int[countArr2];
        int[] arr3 = new int[countArr3];

        for(int i = 0; i < arr.length -1; i++) {
            if (arr[i] < number) {
                arr2[j] = arr[i];
                j++;
            }
            else {
                arr3[k] = arr[i];
                k++;
            }
        }

        Arrays.sort(arr2);
        System.out.println("Array list for numbers less than " + number + ":   \t" + Arrays.toString(arr2));
        Arrays.sort(arr3);
        System.out.println("Array list for numbers greater than " + number + ": \t" + Arrays.toString(arr3));
        System.out.println("====================================");
        System.out.println("Largest number less than " + number + " = \t" + arr2[arr2.length - 1]);
        System.out.println("Smallest number greater than " + number + " = \t" + arr3[0]);
    }
}
