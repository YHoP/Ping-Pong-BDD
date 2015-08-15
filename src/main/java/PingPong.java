import java.util.*;
import java.io.Console;

public class PingPong {
    public static void main(String [] args){
        System.out.printf("Please input a number: ");
        Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();		
        // int number = Integer.parseInt(userInput);
        System.out.println(isPingPong(number));
    }

    public static ArrayList<String> isPingPong (int number){
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<String>();
        // Create a loop to replace the number with corresponding text
        for (int i =1; i <= number; i++){
            if (i % 3 == 0 && i % 5 == 0){
                list.add("Ping-Pong");
            }else if (i % 3 == 0){
                list.add("Ping");
            }else if (i % 5 == 0){
                list.add("Pong");
            }else {
                list.add(Integer.toString(i));
            }
        }
        //return ArrayList
        return list;
    }
}
