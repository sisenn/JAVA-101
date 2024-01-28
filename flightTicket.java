import java.util.Scanner;
public class flightTicket {
    public static void main(String[] args) {

        double distance, age, tripType, price, payment, discount;
        Scanner Input = new Scanner(System.in);

        //information part and valid check
        System.out.print("Enter your flight distance in km: ");
        distance = Input.nextDouble();
        if (distance < 0) {
            System.out.println("You entered incorrect data! Please enter a valid distance.");
            return ;
        }
        price = distance * 0.10;
        System.out.print("Enter your age: ");
        age = Input.nextDouble();
        if (age < 0) {
            System.out.println("You entered incorrect data! Please enter a valid age.");
            return ;
        }
        System.out.println("Select trip type: \n --- One way: 1 ---\n --- Return:  2 ---");
        tripType = Input.nextDouble();
        if ((tripType != 1) && (tripType != 2)) {
            System.out.println("You entered incorrect data! Please enter a valid value.");
            return ;
        }

        //Ticket price calculation for ages <12
        if (age < 12) {
            if (tripType == 2) {
                payment = price - (price * 0.50 + price * 0.20);
            }
            else
                payment = price - (price * 0.50);
            System.out.println("Your payment for this ticket = " + payment + "TL");
        }

        //Ticket price calculation for between 12 and 24 ages
        else if (age >= 12 && age <= 24) {
            if (tripType == 2) {
                payment = price - (price * 0.10 + price * 0.20);
            }
            else
                payment = price - (price * 0.10);
            System.out.println("Your payment for this ticket = " + payment + "TL");
        }

        //Ticket price calculation for more than 65 ages
        else if (age > 65) {
            if (tripType == 2) {
                payment = price - (price * 0.30 + price * 0.20);
            }
            else
                payment = price - (price * 0.30);
            System.out.println("Your payment for this ticket = " + payment + "TL");
        }

        //Ticket price calculation for other ages
        else {
            if (tripType == 2) {
                payment = price - (price * 0.20);
            }
            else
                payment = price;
            System.out.println("Your payment for this ticket = " + payment + "TL");
        }
    }
}
