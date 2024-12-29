import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Ledger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filePath = "transactions.txt";

        System.out.println("Welcome to the Ledger! Please select an option:");
        System.out.println("(D) Add a deposit");
        System.out.println("(P) Add a payment");
        System.out.println("(L) Ledger");

        String option = scanner.nextLine().toUpperCase();
        switch (option) {
            case "D":
                addDeposit(filePath, scanner);
            case "P":
                makePayment(filePath, scanner);
                break;
            case "L":
               ledgerScreen(scanner, filePath);
                break;
            case "X":
                break;
        }



    }
    public static void readTransactions(String filePath) {
        try(BufferedReader reader = new BufferedReader(new java.io.FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
    }
}
    public static void addDeposit(String filePath, Scanner scanner) {
        System.out.println("Please Enter Deposit Details : ");
        System.out.println("Please the date of transaction ");
        String date = scanner.nextLine();
        System.out.println("Please enter the time of transaction ");
        String time = scanner.nextLine();
        System.out.println("Please enter the description ");
        String description = scanner.nextLine();
        System.out.println("Please enter vendor name ");
        String vendor = scanner.nextLine();
        System.out.println("Please enter amount ");
        double amount = scanner.nextDouble();
        String line = date+"|"+time+"|"+description+"|"+vendor+"|"+amount;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(line);
            writer.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void makePayment(String filePath, Scanner scanner) {
        System.out.println("Please Enter Debit Details : ");
        System.out.println("Please the date of transaction ");
        String date = scanner.nextLine();
        System.out.println("Please enter the time of transaction ");
        String time = scanner.nextLine();
        System.out.println("Please enter the description ");
        String description = scanner.nextLine();
        System.out.println("Please enter vendor name ");
        String vendor = scanner.nextLine();
        System.out.println("Please enter amount ");
        double amount = scanner.nextDouble();
        amount = -amount;
        String line = date+"|"+time+"|"+description+"|"+vendor+"|"+amount;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(line);
            writer.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void ledgerScreen(Scanner scanner, String filePath){
        System.out.println("Please make a choice ");
        System.out.println("A) Display All Entries ");
        System.out.println("D) Display Only Deposits ");
        System.out.println("P) Display Only Payments ");
        System.out.println("R) Display Reports ");

        String option = scanner.nextLine().toUpperCase();
        switch (option) {
            case "A":
                readTransactions(filePath);
            case "D":
                displayDeposits(filePath);
                break;
            case "P":
                displayPayments(filePath);
                break;
            case "R":
                break;
        }


    }

    public static void displayDeposits(String filePath){
        try(BufferedReader reader = new BufferedReader(new java.io.FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                double amount = Double.parseDouble(lineArray[4]);
                if (amount>0) {
                    System.out.println(line);
                }

            }
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void displayPayments(String filePath){
        try(BufferedReader reader = new BufferedReader(new java.io.FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                double amount = Double.parseDouble(lineArray[4]);
                if (amount<0) {
                    System.out.println(line);
                }

            }
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


}
