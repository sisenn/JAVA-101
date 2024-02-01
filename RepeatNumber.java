import java.util.Arrays;
public class RepeatNumber {
    public static void main(String[] args) {

        int[] list = {12, 34, 2, 12, 34, 89, 67, 90, 14, 90};
        int repeatCount = 0;
        int number, j;
        int repeatNumber = 0;

        System.out.println("Array list: " + Arrays.toString(list));
        for (int i = 0; i < list.length; i++)
        {
            if (list[i] % 2 == 0)
            {
                number = list[i];
                for (j = 0; j < list.length; j++)
                {
                    if (number == list[j])
                    {
                        repeatCount++;
                        if (repeatCount == 2)
                        {
                            repeatNumber = number;
                            System.out.println("Repeat number = " + repeatNumber + " ");
                            j = 0;
                            repeatCount = 0;
                            break;
                        }
                    }
                }
                if (repeatCount < 2)
                {
                    j = 0;
                    repeatCount = 0;
                }
            }
        }
    }
}
