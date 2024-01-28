import java.util.Scanner;
public class StarTriangle {
    public static void main(String[] args) {

        int line, stars;
        Scanner Input = new Scanner(System.in);
        System.out.print("Please enter the line length for the triangle to be formed: ");
        line = Input.nextInt();
        stars = (line*2)-1;

        for (int i = 0; i < line; i++)
        {
            for (int j = 0; j < stars; j++)
            {
                System.out.print("*");
            }
            System.out.println();
            stars -= 2;
        }
    }
}
