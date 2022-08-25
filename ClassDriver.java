import java.util.Scanner;  // Import the Scanner class
public class ClassDriver {
    static Scanner obj = new Scanner(System.in);


    public static void displayOptions(){
        System.out.println("Welcome to the Student Management Portal!");
        System.out.println("Please enter the option you wish to pursue:");
        System.out.println("1. Create User");
        System.out.println("2. Login");
        System.out.println("0. Exit");
    }
    private static void displayPasswordRules(){
        System.out.println("Passwords must contain at least 6 characters, one capital letter,");
        System.out.println("as well as a special character and number");
    }

    private static String promptEmail(){
        System.out.print("Email: ");
        String email = obj.nextLine();
        return email;
    }
    private static String promptPassword(){
        System.out.print("Password: ");
        String password = obj.nextLine();
        return password;
    }

    public static void switchCase(int choice){
        while (choice != 0)
        switch (choice){
            case 0: System.out.println("Exiting application. Goodbye");
                    break;
            // Creating a user stores data into the backend 
            case 1: System.out.println("Creating User");
                    System.out.println("Please enter first and last name");
                    System.out.print("-> ");
                    String fname = obj.next();
                    String lname = obj.next();
                    System.out.println("\nWelcome: " + fname + " " + lname);
                    System.out.println("Please enter a password");
                    displayPasswordRules();
                    String password = obj.next();
                    while(createPassword(password) == false){
                        System.out.println("\nInvalid password, please try again");
                        displayPasswordRules();
                        password = obj.next();
                    }
                    System.out.println("User Created! Thank you");
                    displayOptions();
                    choice = obj.nextInt();
            // Logging in retrieves data from backend and creates our user        
            case 2: System.out.println("Logging In");
                    String email = promptEmail();
                    String loginPassword = promptPassword();
                    // System.out.println("Email: " + email + " | Password: " + loginPassword);
                    while (!verifyLogin(email,loginPassword)){
                        System.out.println("Invalid Credentials, please try again");
                        email = promptEmail();
                        loginPassword = promptPassword();
                    }
                    System.out.println("Log In Successful! Thank you\n");
                    System.out.println("Here we create user and send them to functionality page");
                    choice = 0;
                    break;
            default:
                    System.out.println("Invalid Choice");
                    displayOptions();
                    choice = obj.nextInt();

        }  
    }

    // email and password -> validate -> if true create student 
    private static boolean verifyLogin(String email, String password){
        // send Get request
        // if valid -> return true
        return true;
        // else return false
    }
    private static void testStuff(Student student){
        System.out.println("Hello " + student.getFirstName());
    }

    private static boolean createPassword(String password){
         boolean pLength = false, hasUpper = false, hasSpecial = false, hasNum = false;
         String special = "!@#$%^&*()_+-='`~[]{}|;.,;?";
        if(password.length() > 7){
            pLength = true;
        }
        for (int i = 0; i < password.length(); i ++){
            if (Character.isDigit(password.charAt(i))){
                hasNum = true;
            }else if (special.contains(Character.toString(password.charAt(i)))){
                hasSpecial = true;
            }else if (Character.isUpperCase(password.charAt(i))){
                hasUpper = true;
            };
        }

        if (pLength == true && hasUpper == true && hasSpecial == true && hasNum == true){
            System.out.println("Valid Password");
            return true;
        }
        return false;
    }
}
