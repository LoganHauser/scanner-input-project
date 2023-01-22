import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Create a Scanner object to read input from the user.
        Scanner inputScanner = new Scanner(System.in);

        //Ask the user to input an int.
        System.out.println("Please input an int value:");
        try {
            //Try reading the int value from the user.
            int input = inputScanner.nextInt();
            //Tell the user that the input was recieved and what value was recieved.
            System.out.println("Thank you for inputting the int, I read: " + input);
        } catch (Exception e) {
            //Tell the user if they input the wrong type.
            System.out.println("Wrong type was inputted.");
        }

        //Move to the next line to allow for reading the float.
        inputScanner.nextLine();

        //Ask the user to input a float.
        System.out.println("Please input a float value:");
        try {
            //Try reading the float value from the user.
            float input = inputScanner.nextFloat();
            //Tell the user that the input was recieved and what value was recieved.
            System.out.println("Thank you for inputting the float, I read: " + input);
        } catch (Exception e) {
            //Tell the user if they input the wrong type.
            System.out.println("Wrong type was inputted.");
        }

        //Move to the next line to allow for reading a String.
        inputScanner.nextLine();

        //Ask the user to input a String.
        System.out.println("Please input a String value:");
        //Read the String value from the user.
        String input = inputScanner.nextLine();
        //Tell the user that the input was recieved and what value was recieved.
        System.out.println("Thank you for inputting the String, I read: " + input);

        //Ask the user to input their name.
        System.out.println("Please enter your full name.");
        //Read the inputted name from the user.
        String name = inputScanner.nextLine();
        //Get the first name by splitting the name value at the space character and getting the first value.
        String firstName = name.split(" ")[0];
        //Get the last name by splitting the name value at the space character and getting the second value.
        String lastName = name.split(" ")[1];
        //Print the message with the first and last name.
        System.out.println("Hello, Mr/Ms " + lastName + ". Can I call you " + firstName + "?");
    }
}
