import java.util.Scanner;

public class circle {
    public static void main(String[] args) {

        double radius, area, perimeter, angle, segmentArea;

        Scanner Input = new Scanner(System.in);
        System.out.print("Please enter the radius of the circle: ");
        radius = Input.nextDouble();

        System.out.print("Please enter the alpha angle measurement of the circle: ");
        angle = Input.nextDouble();
        segmentArea = (Math.PI * Math.pow(radius, 2) * angle) / 360;

        area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of circle :" + area);

        perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter of circle: " + perimeter);

        System.out.println("Area of circle segment: " + segmentArea);
    }
}
