import java.util.Scanner;
public class ATM {

    //ANSI colors code
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";

    public static void main(String[] args) {

        String userName;
        String password, passwordCheck, userNameCheck;
        int selection, deposit, withdraw;
        int balance = 1500;
        userNameCheck = "patika";
        passwordCheck = "dev123";

        Scanner Input = new Scanner(System.in);
        System.out.println(ANSI_YELLOW + "Hello! Welcome to our bank." + ANSI_RESET);
        System.out.print("Please enter your name: ");
        userName = Input.nextLine();

        if (!(userName.equals(userNameCheck)))
        {
            for (int i = 1; i < 3; i++)
            {
                if (!(userName.equals(userNameCheck)))
                {
                    System.out.println(ANSI_PURPLE + "Wrong username. Please try again!" + ANSI_RESET);
                    userName = Input.nextLine();
                    if (i == 2 && !(userName.equals(userNameCheck)))
                    {
                        System.out.println(ANSI_RED + "Your account blocked!" + ANSI_RESET);
                        break;
                    }
                }
                else {
                    break;
                }
            }
        }
        System.out.print("Please enter your password: ");
        password = Input.nextLine();
        if (!(password.equals(passwordCheck)))
        {
            for (int j = 1; j < 3; j++)
            {
                if (!(password.equals(passwordCheck)))
                {
                    System.out.println(ANSI_PURPLE + "Wrong password. Please try again!" + ANSI_RESET);
                    password = Input.nextLine();
                    if (j == 2 && !(password.equals(passwordCheck)))
                    {
                        System.out.println(ANSI_RED + "Your account blocked!" + ANSI_RESET);
                        break;
                    }
                }
                else {
                    break;
                }
            }
        }
        System.out.println(ANSI_YELLOW + "Login successful. Welcome to your account." + ANSI_RESET);
        do {
            System.out.println(ANSI_YELLOW + "Please select the action you want to perform: " + ANSI_RESET);
            System.out.println("---------------------------------------------");
            System.out.println("1" + ANSI_PURPLE + " ----> " + ANSI_CYAN + "deposit money" + ANSI_RESET);
            System.out.println("2" + ANSI_PURPLE + " ----> " + ANSI_CYAN + "withdraw money" + ANSI_RESET);
            System.out.println("3" + ANSI_PURPLE + " ----> " + ANSI_CYAN + "balance inquiry" + ANSI_RESET);
            System.out.println("4" + ANSI_PURPLE + " ----> " + ANSI_CYAN + "exit" + ANSI_RESET);
            selection = Input.nextInt();
            if (selection == 1)
            {
                System.out.print("Please enter the amount of money you want to deposit: ");
                deposit = Input.nextInt();
                if (deposit >= 10000)
                {
                    System.out.println(ANSI_BLUE + "To make a transaction with this amount, please visit our nearest bank branch." + ANSI_RESET);
                }
                else
                {
                    System.out.println("Amount deposited: " + ANSI_PURPLE + deposit + ANSI_RESET);
                    balance += deposit;
                    System.out.println("Account balance: " + ANSI_PURPLE + balance + ANSI_RESET);
                }
            }
            else if (selection == 2)
            {
                System.out.println("Please enter the amount of money you want to withdraw: ");
                withdraw = Input.nextInt();
                if (withdraw > balance)
                {
                    System.out.println("Your balance is insufficient.");
                }
                else
                {
                    System.out.println("Withdrawn amount: " + ANSI_PURPLE + withdraw + ANSI_RESET);
                    balance -= withdraw;
                    System.out.println("Account balance: " + ANSI_PURPLE + balance + ANSI_RESET);
                }
            }
            else if (selection == 3)
            {
                System.out.println("Your account balance: " + ANSI_PURPLE + balance + ANSI_RESET);
            }
        }while(selection != 4);
        System.out.println(ANSI_YELLOW + "Thank you for choosing our bank! We wish you a nice day :)");
    }
}
