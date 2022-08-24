import java.util.Scanner;  // Import the Scanner class
public class ClassEngine {
    
    public static void main(String[] args){

        // Scanner Object to prompt user input
        Scanner obj = new Scanner(System.in);

        // Display our options and ensure the input is valid
        ClassDriver.displayOptions();
        int choice = obj.nextInt();
        while (choice >= 0 && choice > 2){
            System.out.println("Invalid choice, please choose again");
            ClassDriver.displayOptions();
            choice = obj.nextInt();
        } 
        // Send input to our driver
        ClassDriver.switchCase(choice);

        
        // At the end of the program, close our Scanner
        obj.close();
    }// end main

}
