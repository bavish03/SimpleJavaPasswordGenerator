import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String charPool = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*"; 
        Random random = new Random();
        
        int length = 0;
        while (length < 10) { 
            System.out.print("Enter password length (Min 6 characters): ");
            if (scanner.hasNextInt()) {
                length = scanner.nextInt();
                if (length < 6 || length == 6) {
                    System.out.println("Length must be at least 8. Try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); 
            }
        }
        
        StringBuilder password = new StringBuilder(length);
        
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(charPool.length());
            password.append(charPool.charAt(randomIndex));
        }
        
        System.out.println("\n----------------------------------");
        System.out.println("Generated Password: " + password.toString());
        System.out.println("----------------------------------");
        
        scanner.close();
    }
}