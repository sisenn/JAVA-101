import java.util.Scanner;

public class Pythagoras {
    public static void main(String[] args) {

        double side1, side2, hypotenuse, perimeter, area;

        Scanner Input = new Scanner(System.in);
        System.out.print("Enter one side of the triangle: ");
        side1 = Input.nextFloat();
        System.out.print("Enter the other side of the triangle: ");
        side2 = Input.nextFloat();
        hypotenuse = Math. sqrt(Math.pow(side1,2) + Math.pow(side2,2));
        System.out.println("Hypotenuse = " + hypotenuse);
        perimeter = (hypotenuse + side1 + side2);
        System.out.println("Perimeter of triangle = " + perimeter);
        area = (hypotenuse * side2)/2;
        System.out.println("Area of triangle = " + area);
    }
}
