import java.util.Scanner;

public class WelcomeMessage {
    public static void main(String[] args) {
        System.out.println("Welcome to Nafis and Shifa's repository!");
        
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("What's your name? ");
        String name = scanner.nextLine();
        
      
        System.out.println("Hello, " + name + "! Thanks for visiting our repository.");
        
       
        scanner.close();
        
    }
}
