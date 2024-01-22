import java.util.Scanner;
public class GradeAverage {
    public static void main(String[] args) {

        double exam1, exam2, exam3;
        double examResult;
        double average;
        String state;

        Scanner Input = new Scanner(System.in);

        System.out.println("Please enter your physics course notes:");
        exam1 = Input.nextDouble();
        exam2 = Input.nextDouble();
        exam3 = Input.nextDouble();
        examResult = ((exam1 + exam2 + exam3) / 3);
        System.out.print("Your exam grade average: ");
        System.out.println(examResult);
        state = (examResult >= 60) ? "SUCCESS!" : "FAIL!";
        System.out.println(state);

        System.out.println("Please enter your chemistry course notes:");
        exam1 = Input.nextDouble();
        exam2 = Input.nextDouble();
        exam3 = Input.nextDouble();
        examResult = ((exam1 + exam2 + exam3) / 3);
        System.out.print("Your exam grade average: ");
        System.out.println(examResult);
        state = (examResult >= 60) ? "SUCCESS!" : "FAIL!";
        System.out.println(state);

        System.out.println("Please enter your maths course notes:");
        exam1 = Input.nextDouble();
        exam2 = Input.nextDouble();
        exam3 = Input.nextDouble();
        examResult = ((exam1 + exam2 + exam3) / 3);
        System.out.print("Your exam grade average: ");
        System.out.println(examResult);
        state = (examResult >= 60) ? "SUCCESS!" : "FAIL!";
        System.out.println(state);

        System.out.println("Please enter your biology course notes:");
        exam1 = Input.nextDouble();
        exam2 = Input.nextDouble();
        exam3 = Input.nextDouble();
        examResult = ((exam1 + exam2 + exam3) / 3);
        System.out.print("Your exam grade average: ");
        System.out.println(examResult);
        state = (examResult >= 60) ? "SUCCESS!" : "FAIL!";
        System.out.println(state);

        System.out.println("Please enter your music course notes:");
        exam1 = Input.nextDouble();
        exam2 = Input.nextDouble();
        exam3 = Input.nextDouble();
        examResult = ((exam1 + exam2 + exam3) / 3);
        System.out.print("Your exam grade average: ");
        System.out.println(examResult);
        state = (examResult >= 60) ? "SUCCESS!" : "FAIL!";
        System.out.println(state);

        System.out.println("Please enter your history course notes:");
        exam1 = Input.nextDouble();
        exam2 = Input.nextDouble();
        exam3 = Input.nextDouble();
        examResult = ((exam1 + exam2 + exam3) / 3);
        System.out.print("Your exam grade average: ");
        System.out.println(examResult);
        state = (examResult >= 60) ? "SUCCESS!" : "FAIL!";
        System.out.println(state);
    }
}
