import java.util.Arrays;
import java.util.Scanner;

public class FrequencyArrayMembers {
    public static void main(String[] args) {

        int[] arr = {10, 10, 3, 56, 3, 10, 78};
        int count = 1;
        int number;
        int i = 0;
        int j;

        Arrays.sort(arr);
        System.out.println("Array list: " + Arrays.toString(arr));
        System.out.println("Number of repetitions: ");

        while (i < arr.length)
        {
            number = arr[i];
            j = i;
            if ((i+1) != arr.length)
            {
                while (arr[j] == arr[i+1])
                {
                    count++;
                    i++;
                }
            }
            System.out.println("The number " + number + " was repeated " + count + " times." );
            count = 1;
            i++;
        }
    }
}