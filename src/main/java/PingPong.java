import java.util.*;
import java.util.ArrayList;

public class PingPong {

    public static void main(String [] args){
        // Ask user to input a number
        // System.out.println("Please input a number: ");

        // Store user input
        // Scanner input = new Scanner(System.in);

        // Taking String input from user
        // String userInput = input.nextLine();
        String userInput = "15";

        // Convert String to Integer
        Integer number = Integer.parseInt(userInput);
    }

    public static ArrayList<String> isPingPong (Integer number){
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<String>();

        // For loop
        for (Integer j =1; j <= number; j++){
            if (number % 3 == 0 || number % 5 == 0){
                list.add("Ping-Pong");
            }if (number % 3 == 0){
                list.add("Ping");
            }else if (number % 5 == 0){
                list.add("Pong");
            }else {
                list.add(number.toString());
            }
        }

        //return ArrayList
        return list;
    }
}
