import java.util.Scanner;
class User {
    String name;
    String phoneNumber;
    String email;
    String complaint;

    public void setDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter your phone number: ");
        this.phoneNumber = scanner.nextLine();
        System.out.print("Enter your email address: ");
        this.email = scanner.nextLine();
        System.out.print("Enter your complaint: ");
        this.complaint = scanner.nextLine();
    }

    public void displayDetails() {
        System.out.println("\n--- User Information ---");
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email Address: " + email);
        System.out.println("Complaint: " + complaint);
	  System.out.println("COMPLIANT SUBMITTED SUCCESSFULLY");
    }
}

public class C06{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // User input section
        System.out.print("Enter the number of users: ");
        int numberOfUsers = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        User[] users = new User[numberOfUsers];

        for (int i = 0; i < numberOfUsers; i++) {
            System.out.println("\nEntering details for user " + (i + 1) + ":");
            users[i] = new User(); // Create a new User object
            users[i].setDetails(); // Set details for the user
        }

        // Display user details
        for (User user : users) {
            user.displayDetails();
        }

        // Cyber attack simulation section
        System.out.println("\nWelcome to the Cyber Security Compliant Portal");
        System.out.println("Choose an attack to simulate:");
        System.out.println("1. Phishing Attack");
        System.out.println("2. SQL Injection");
        System.out.println("3. Cross-Site Scripting (XSS)");
        System.out.println("4. Denial of Service (DoS)");
        System.out.println("5. Man-in-the-Middle (MitM)");
        System.out.println("6. Malware Infection");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                simulatePhishing();
                break;
            case 2:
                simulateSQLInjection();
                break;
            case 3:
                simulateXSS();
                break;
            case 4:
                simulateDoS();
                break;
            case 5:
                simulateMitM();
                break;
            case 6:
                simulateMalware();
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    public static void simulatePhishing() {
        System.out.println("Simulating Phishing Attack...");
        // Example: Display a fake login page
        System.out.println("Enter your credentials at the fake site:");
    }

    public static void simulateSQLInjection() {
        System.out.println("Simulating SQL Injection...");
        String maliciousInput = "' OR '1'='1";
        String sqlQuery = "SELECT * FROM users WHERE username = '" + maliciousInput + "'";
        // In a real application, use PreparedStatement to prevent this.
        System.out.println("Executed Query: " + sqlQuery);
   System.out.println("COMPLIANT SUBMITTED SUCCESSFULLY");
    }

 

    public static void simulateXSS() {
        System.out.println("Simulating Cross-Site Scripting (XSS)...");
        String userInput = "<script>alert('XSS Attack!');</script>";
        // In a real scenario, this input should be sanitized.
        System.out.println("User Input: " + userInput);
    }

    public static void simulateDoS() {
        System.out.println("Simulating Denial of Service (DoS)...");
        for (int i = 0; i < 1000; i++) {
            // Simulate sending requests
            System.out.println("Sending request " + (i + 1));
        }
    }

    public static void simulateMitM() {
        System.out.println("Simulating Man-in-the-Middle Attack...");
        String originalMessage = "Hello, this is a secure message.";
        String interceptedMessage = "Hello, this is a secure message. [Intercepted]";
        System.out.println("Original Message: " + originalMessage);
        System.out.println("Intercepted Message: " + interceptedMessage);
    }

    public static void simulateMalware() {
        System.out.println("Simulating Malware Infection...");
        System.out.println("Malware has been installed and is now running...");
    }
}