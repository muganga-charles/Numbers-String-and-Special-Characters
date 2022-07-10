import java.util.Scanner;

/**
 * special
 */
public class special {

    public static void main(String[] args) {
        //allows a user to make an entry
        //tells if the entry is a number,character, string or special character
    
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character");
        String entry = input.nextLine();
        if (entry.matches("[0-9]")) {
            System.out.println("It is a number");
        } else if (entry.matches("[a-zA-Z]")) {
            System.out.println("It is a character");
        } else if (entry.matches("[a-zA-Z0-9]")) {
            System.out.println("It is a string");
        } else {
            System.out.println("It is a special character");
        }


    }
}