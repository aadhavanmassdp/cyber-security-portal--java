Cyber Security Complaint Portal
Overview
This Java program simulates a Cyber Security Complaint Portal where users can submit complaints and simulate various types of cyber attacks. The program collects user details (name, phone number, email, and complaint) and allows the simulation of common cyber attacks like Phishing, SQL Injection, XSS, DoS, MitM, and Malware.
Features

User Input: Collects details for multiple users, including name, phone number, email, and complaint.
User Information Display: Displays the collected user information in a formatted manner.
Cyber Attack Simulation: Provides options to simulate six types of cyber attacks:
Phishing Attack
SQL Injection
Cross-Site Scripting (XSS)
Denial of Service (DoS)
Man-in-the-Middle (MitM)
Malware Infection


Interactive Console Interface: Uses a Scanner to interact with users via the console.

Prerequisites

Java Development Kit (JDK) 8 or higher installed.
A Java-compatible IDE (e.g., IntelliJ IDEA, Eclipse) or a terminal to compile and run the program.

How to Run

Clone or Download the Code:
Copy the provided Java code into a file named C06.java.


Compile the Code:
Open a terminal in the directory containing C06.java.
Run the command:javac C06.java




Run the Program:
Execute the compiled program with:java C06




Follow the Prompts:
Enter the number of users.
Provide details for each user (name, phone number, email, complaint).
Choose a cyber attack to simulate by entering a number (1-6).



Program Structure

User Class:
Stores user details (name, phoneNumber, email, complaint).
Contains methods:
setDetails(): Collects user input for details.
displayDetails(): Displays user information.




C06 Class (Main):
Manages the main program flow.
Handles user input for multiple users.
Provides a menu for selecting and simulating cyber attacks.
Contains static methods for simulating each attack type:
simulatePhishing()
simulateSQLInjection()
simulateXSS()
simulateDoS()
simulateMitM()
simulateMalware()





Example Usage
Enter the number of users: 2

Entering details for user 1:
Enter your name: John Doe
Enter your phone number: 123-456-7890
Enter your email address: john@example.com
Enter your complaint: Unauthorized access to my account

Entering details for user 2:
Enter your name: Jane Smith
Enter your phone number: 987-654-3210
Enter your email address: jane@example.com
Enter your complaint: Phishing email received

--- User Information ---
Name: John Doe
Phone Number: 123-456-7890
Email Address: john@example.com
Complaint: Unauthorized access to my account
COMPLIANT SUBMITTED SUCCESSFULLY

--- User Information ---
Name: Jane Smith
Phone Number: 987-654-3210
Email Address: jane@example.com
Complaint: Phishing email received
COMPLIANT SUBMITTED SUCCESSFULLY

Welcome to the Cyber Security Compliant Portal
Choose an attack to simulate:
1. Phishing Attack
2. SQL Injection
3. Cross-Site Scripting (XSS)
4. Denial of Service (DoS)
5. Man-in-the-Middle (MitM)
6. Malware Infection
2
Simulating SQL Injection...
Executed Query: SELECT * FROM users WHERE username = '' OR '1'='1'
COMPLIANT SUBMITTED SUCCESSFULLY

Notes

The cyber attack simulations are simplified for educational purposes and do not perform actual attacks.
The program uses Scanner for console input, which may require proper handling of newlines (e.g., scanner.nextLine() after scanner.nextInt()).
In a real-world application, user input should be validated, and SQL queries should use `
