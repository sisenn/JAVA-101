import java.util.Scanner;
public class Lessons {

    //ANSI colors code
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";

    public static void main(String[] args) {

        double math, physics, turkish, chemistry, music;
        double exam1, exam2, exam3;
        double gradeStatus, checkGradeStatus, checkResult;
        double result1,  result2,  result3,  result4, result5;

        Scanner Input = new Scanner(System.in);

        //math grade status
        System.out.println(ANSI_BLUE + "Math: " + ANSI_RESET + "Please enter your first exam note: ");
        exam1 = Input.nextDouble();
        if (!(exam1 >= 0 && exam1 <= 100)) {
            exam1 = 0;
        }
        System.out.println(ANSI_BLUE + "Math: " + ANSI_RESET + "Please enter your second exam note: ");
        exam2 = Input.nextDouble();
        if (!(exam2 >= 0 && exam2 <= 100)) {
            exam2 = 0;
        }
        System.out.println(ANSI_BLUE + "Math :" + ANSI_RESET + "Please enter your third exam note: ");
        exam3 = Input.nextDouble();
        if (!(exam3 >= 0 && exam3 <= 100)) {
            exam3 = 0;
        }
        result1 = (exam1 + exam2 + exam3) / 3;
        checkResult = (result1 >= 55) ? 0 : 1;
        if (checkResult == 0) {
            System.out.println("Math average: " + result1 + ANSI_GREEN + " ----> Success!");
        }
        else {
            System.out.println("Math average: " + result1 + ANSI_RED + " ----> Fail!");
        }

        //physics grade status
        System.out.println(ANSI_YELLOW + "Physics: " + ANSI_RESET + "Please enter your first exam note: ");
        exam1 = Input.nextDouble();
        if (!(exam1 >= 0 && exam1 <= 100)) {
            exam1 = 0;
        }
        System.out.println(ANSI_YELLOW + "Physics: " + ANSI_RESET + "Please enter your second exam note: ");
        exam2 = Input.nextDouble();
        if (!(exam2 >= 0 && exam2 <= 100)) {
            exam2 = 0;
        }
        System.out.println(ANSI_YELLOW + "Physics: " + ANSI_RESET + "Please enter your third exam note: ");
        exam3 = Input.nextDouble();
        if (!(exam3 >= 0 && exam3 <= 100)) {
            exam3 = 0;
        }
        result2 = (exam1 + exam2 + exam3) / 3;
        checkResult = (result2 >= 55) ? 0 : 1;
        if (checkResult == 0) {
            System.out.println("Physics average: " + result2 + ANSI_GREEN + " ----> Success!");
        }
        else {
            System.out.println("Physics average: " + result2 + ANSI_RED + " ----> Fail!");
        }

        //turkish grade status
        System.out.println(ANSI_PURPLE + "Turkish: " + ANSI_RESET + "Please enter your first exam note: ");
        exam1 = Input.nextDouble();
        if (!(exam1 >= 0 && exam1 <= 100)) {
            exam1 = 0;
        }
        System.out.println(ANSI_PURPLE + "Turkish: " + ANSI_RESET + "Please enter your second exam note: ");
        exam2 = Input.nextDouble();
        if (!(exam2 >= 0 && exam2 <= 100)) {
            exam2 = 0;
        }
        System.out.println(ANSI_PURPLE + "Turkish: " + ANSI_RESET + "Please enter your third exam note: ");
        exam3 = Input.nextDouble();
        if (!(exam3 >= 0 && exam3 <= 100)) {
            exam3 = 0;
        }
        result3 = (exam1 + exam2 + exam3) / 3;
        checkResult = (result3 >= 55) ? 0 : 1;
        if (checkResult == 0) {
            System.out.println("Turkish average: " + result3 + ANSI_GREEN + " ----> Success!");
        }
        else {
            System.out.println("Turkish average: " + result3 + ANSI_RED + " ----> Fail!");
        }

        //chemistry grade status
        System.out.println(ANSI_CYAN + "Chemistry: " + ANSI_RESET + "Please enter your first exam note: ");
        exam1 = Input.nextDouble();
        if (!(exam1 >= 0 && exam1 <= 100)) {
            exam1 = 0;
        }
        System.out.println(ANSI_CYAN + "Chemistry: " + ANSI_RESET + "Please enter your second exam note: ");
        exam2 = Input.nextDouble();
        if (!(exam2 >= 0 && exam2 <= 100)) {
            exam2 = 0;
        }
        System.out.println(ANSI_CYAN + "Chemistry: " + ANSI_RESET + "Please enter your third exam note: ");
        exam3 = Input.nextDouble();
        if (!(exam3 >= 0 && exam3 <= 100)) {
            exam3 = 0;
        }
        result4 = (exam1 + exam2 + exam3) / 3;
        checkResult = (result4 >= 55) ? 0 : 1;
        if (checkResult == 0) {
            System.out.println("Chemistry average: " + result4 + ANSI_GREEN + " ----> Success!");
        }
        else {
            System.out.println("Chemistry average: " + result4 + ANSI_RED + " ----> Fail!");
        }

        //music grade status
        System.out.println(ANSI_BLUE + "Music: " + ANSI_RESET + "Please enter your first exam note: ");
        exam1 = Input.nextDouble();
        if (!(exam1 >= 0 && exam1 <= 100)) {
            exam1 = 0;
        }
        System.out.println(ANSI_BLUE + "Music: " + ANSI_RESET + "Please enter your second exam note: ");
        exam2 = Input.nextDouble();
        if (!(exam2 >= 0 && exam2 <= 100)) {
            exam2 = 0;
        }
        System.out.println(ANSI_BLUE + "Music: " + ANSI_RESET + "Please enter your third exam note: ");
        exam3 = Input.nextDouble();
        if (!(exam3 >= 0 && exam3 <= 100)) {
            exam3 = 0;
        }
        result5 = (exam1 + exam2 + exam3) / 3;
        checkResult = (result5 >= 55) ? 0 : 1;
        if (checkResult == 0) {
            System.out.println("Music average: " + result5 + ANSI_GREEN + " ----> Success!");
        }
        else {
            System.out.println("Music average: " + result5 + ANSI_RED + " ----> Fail!");
        }

        //graduation status
        gradeStatus = (result1 + result2 + result3 + result4 + result5) / 5;
        checkGradeStatus = (gradeStatus >= 55) ? 0 : 1;
        if (checkGradeStatus == 0) {
            System.out.println("GPA = " + gradeStatus + ANSI_GREEN + "\nYour GPA is successful!");
        }
        else {
            System.out.println("GPA = " + gradeStatus + ANSI_RED + "\nYour GPA is failed!");
        }
    }
}
