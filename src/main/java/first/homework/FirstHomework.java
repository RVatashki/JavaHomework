package first.homework;

 import java.util.Scanner;

  public class FirstHomework

 {

    public static void main(String[] args)

    {

                // Scanner to read the input from the user
                Scanner scanner = new Scanner(System.in);

                // Tells the user to input his name
                System.out.print("Hello. Please enter you name: ");

                // Reads the entered line and stores it in the UserName variable
                String UserName = scanner.nextLine();

                // Tells the user to input his favorite hobby
                System.out.print("And what do you consider to be your favorite hobby? ");

                // Reads the entered line and stores it in the UserHobby variable
                String UserHobby = scanner.nextLine();

                // Display the user's name and favorite hobby
                System.out.println("Hello, " + UserName + "! Your favorite hobby is " + UserHobby +".");

    }

 }




