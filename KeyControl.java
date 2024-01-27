import java.util.Scanner;
public class KeyControl {
    public static void main(String[] args) {

        String userName;
        String password;
        String answer;
        String truePassword;

        Scanner Input = new Scanner(System.in);
        System.out.print("Please enter username: ");
        userName = Input.nextLine();

        System.out.print("Please enter password: ");
        password = Input.nextLine();

        if (userName.equals("Patika") && password.equals("Java123")) {
            System.out.println("Login successful!");
        }
        else {
            System.out.println("Wrong entry! Do you want to reset your password? yes/no");
            answer = Input.nextLine();
            if (answer.equals("yes")) {
                System.out.println("Please re-create your password: ");
                truePassword = Input.nextLine();
                if(truePassword.equals(password)) {
                    System.out.println("The password could not be created, please enter another password!");
                    truePassword = Input.nextLine();
                }
                else {
                    System.out.println("Password created successfully.");
                }
            }
            else if(answer.equals(("no"))) {
                System.out.println("Please enter password: ");
                password = Input.nextLine();
            }
            else {
                System.out.println("Please indicate what you want to do with yes or no.");
                answer = Input.nextLine();
            }
        }
    }
}
