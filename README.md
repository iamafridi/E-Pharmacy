# e-Pharmacy Management System

## Overview

The **e-Pharmacy Management System** is an application built to manage a pharmacy's inventory and user transactions. This system allows users (customers and pharmacists) to perform operations such as searching for medications, viewing the pharmacy’s stock, ordering medications, and restocking products. The system is implemented using Java and Object-Oriented Programming (OOP) principles such as inheritance, abstraction, interfaces, and exception handling.

## Features

- **Search Medications** : Allows customers and pharmacists to search for medications by name or manufacturer.
- **View Stock**: View the complete list of medications available in the pharmacy, including stock quantities and prices.
- **Order Medication**: Customers can order medications by specifying the quantity, and the system checks if the order can be fulfilled based on available stock.
- **Restock Medication**: Pharmacists can restock medications to ensure the pharmacy's inventory is up to date.
- **Total Bill Calculation**: After placing an order, the total cost for the medications is calculated and displayed to the customer.
- **Exception Handling**: Custom exceptions handle error scenarios like medication not found, insufficient stock, and invalid medication data.

## Technologies Used

- **Java**: The core programming language used to develop the system.
- **Object-Oriented Programming (OOP)**: The system is built using OOP principles, including classes, inheritance, and interfaces.
- **JVM**: The application runs on the Java Virtual Machine (JVM).

## Prerequisites

- **Java 21** or higher installed on your system.
- A basic understanding of OOP concepts such as inheritance, interfaces, and exception handling.

## Installation

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/e-pharmacy-management-system.git
cd e-pharmacy-management-system

### 2. Compile the Code

Ensure that Java 21 is installed on your system. You can check your Java version by running:

``bash

java -version

If Java 21 is installed, compile the Java files by running:

``bash
javac *.java

### 3. Run the Application
To run the application, execute the Main.java file:
``bash
java Main

The system will start and prompt you with a menu of options (Search, View Stock, Order Medication, and Exit).

### How to Use
## Main Menu
Upon running the program, the user is presented with a menu to choose from the following options:

## Search for Medication:
Allows you to search for a specific medication by name or manufacturer.
##View Pharmacy Stock:
Displays all medications in the pharmacy, including stock quantities and prices.
##Order Medication:
Allows customers to place orders for medications. It checks if enough stock is available and updates the stock after a successful purchase.
##Exit:
Exits the program.

### Medication Search
1. Search medications by entering a keyword (either medication name or manufacturer).
2. After searching, the system will show all matching medications.
3. You can then choose to order a medication or return to the main menu.
### Ordering Medications
1. After selecting a medication, enter the quantity.
2.If the pharmacy has enough stock, the system calculates the total cost and prompts the customer to confirm the order.
3. The order is processed, the stock is updated, and the total bill is displayed.
### Restocking Medications
1. Pharmacists can restock medications by adding a specified quantity to the available stock.
### System Design
## Class Structure
##Medication:
Holds the attributes of a medication like name, manufacturer, expiry date, batch number, stock quantity, and price.
## PharmacyUser:
 An abstract class representing common attributes for users (name, userId, userType).
## Customer:
 A concrete class that extends PharmacyUser. Handles operations for customers, such as ordering medications.
## Pharmacist: 
A concrete class that extends PharmacyUser. Handles operations for pharmacists, such as restocking medications.
##Searchable: 
Interface implemented by the Pharmacy class to allow searching for medications.
##Pharmacy:
 Manages the medication list and provides methods to add, search, and display medications.
##Main:
The entry point for the application, containing the main menu and user interaction logic.

### UML Diagram

### Exception Handling
MedicationNotFoundException: Thrown when a medication is not found in the pharmacy during search or order operations.
InvalidMedicationException: Thrown when a medication is added with invalid details (e.g., empty name or manufacturer).
InsufficientStockException: Thrown when trying to purchase more medication than is available in stock.
### User Interaction
The main class allows customers to search for medications, order them, and view the total bill. Pharmacists can restock medications when needed. Exception handling ensures that invalid operations are managed gracefully, providing meaningful messages to users.

### Testing
## Unit Tests
Unit tests are included for the following functionalities:

Medication Management: Adding and removing medications from the pharmacy.
Search: Verifying that searching for medications returns the correct results.
Ordering: Ensuring that orders are processed correctly, including stock checks and total bill calculation.
Exception Handling: Tests for custom exceptions like MedicationNotFoundException and InsufficientStockException.

To run the unit tests:

Make sure you have JUnit or a similar testing framework installed.
Compile the tests and run them using the following command:

``bash
javac Test*.java
java org.junit.runner.JUnitCore TestMedication

### Future Enhancements
User Authentication: Add user authentication for customers and pharmacists.
Payment Integration: Integrate payment gateways for real transactions.
Inventory Reports: Generate reports on pharmacy sales, stock levels, and expired medications.

### Contributing
Feel free to fork the repository, create branches, and submit pull requests. Contributions are welcome!

### License
This project is licensed under the MIT License - see the LICENSE file for details.

### Acknowledgements
The system is built using Java 21 and follows best practices in object-oriented design.
