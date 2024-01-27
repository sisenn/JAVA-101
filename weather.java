import java.util.Scanner;
public class weather {
    public static void main(String[] args) {

        int heat;

        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the weather: ");
        heat = Input.nextInt();

         switch(heat) {
             case 1:
             case 2:
             case 3:
             case 4:
             case 5:
                 System.out.println("The weather forecast is less than 5 degrees. Recommended activity: Skiing");
                 break;
             case 6:
             case 7:
             case 8:
             case 9:
             case 10:
             case 11:
             case 12:
             case 13:
             case 14:
             case 15:
                 System.out.println("The weather forecast is between 5 and 15 degrees. Recommended activity: Cinema");
                 break;
             case 16:
             case 17:
             case 18:
             case 19:
             case 20:
             case 21:
             case 22:
             case 23:
             case 24:
             case 25:
                 System.out.println("The weather forecast is between 15 and 25 degrees. Recommended activity: Picnic");
                 break;
             default:
                 System.out.println("The weather forecast is greater than 25 degrees. Recommended activity: Swimming");
                 break;
         }
    }
}


