import java.util.Scanner;
public class atm {


    
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int balance = 10000; // initial balance

            while (true) {
                System.out.println("\nATM Menu:");
                System.out.println("1. Check Balance");
                System.out.println("2. Withdraw Money");
                System.out.println("3. Deposit Money");
                System.out.println("4. Exit");

                System.out.print("Enter your choice (1-4): ");
                int choice = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Your current balance is " + balance);
                        break;

                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        int withdrawAmount = input.nextInt();

                        if (withdrawAmount > balance) {
                            System.out.println("Insufficient balance!");
                        } else {
                            balance -= withdrawAmount;
                            System.out.println("Please collect your money.");
                        }
                        break;

                    case 3:
                        System.out.print("Enter amount to deposit: ");
                        int depositAmount = input.nextInt();
                        balance += depositAmount;
                        System.out.println("Amount deposited successfully.");
                        break;

                    case 4:
                        System.out.println("Thank you for using this ATM.");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid choice!");
                        break;
                }
            }
        }
    }


