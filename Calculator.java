import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userInput = 0;

        while (userInput != 5) {
            System.out.printf("\t\tCALCULATOR\n\n");
            System.out.println("1: Add");
            System.out.println("2: Subtract");
            System.out.println("3: Divide");
            System.out.println("4: Multiply");
            System.out.println("5: EXIT");

            System.out.print("Press one of the following numbers: ");
            userInput = sc.nextInt();
            System.out.printf("\n");

            if (userInput >= 1 && userInput <= 4) {
                System.out.print("Number 1: ");
                double num1 = sc.nextDouble();
                System.out.print("Number 2: ");
                double num2 = sc.nextDouble();

                double total = 0;

                switch (userInput) {
                    case 1:
                        total = num1 + num2;
                        System.out.println("Result: " + total);
                        break;
                    case 2:
                        total = num1 - num2;
                        System.out.println("Result: " + total);
                        break;
                    case 3:
                        if (num2 != 0) {
                            total = num1 / num2;
                            System.out.println("Result: " + total);
                        } else {
                            System.out.println("Error: Division by zero is not allowed.");
                        }
                        break;
                    case 4:
                        total = num1 * num2;
                        System.out.println("Result: " + total);
                        break;
                }
                System.out.println("Returning to main menu\n");
            } else if (userInput == 5) {
                System.out.println("Exit program");
                System.out.println("Closing Calculator App...");
                sc.close();
                System.exit(0);
            } else {
                System.out.println("Invalid input. Please choose a valid option.\n");
            }
        }
    }
}
