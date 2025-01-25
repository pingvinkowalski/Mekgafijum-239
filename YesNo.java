import java.util.Scanner;

public class YesNo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.print("Enter 'yes' or 'no': ");
            input = scanner.nextLine().toLowerCase(); 

            if (!input.equals("yes") && !input.equals("no")) {
                System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            }
        } while (!input.equals("yes") && !input.equals("no"));

        if (input.equals("yes")) {
            System.out.println("You entered 'yes'.");
        } else {
            System.out.println("You entered 'no'.");
        }
            System.out.println(Welcome to Mekgafijum-239); 
        scanner.close();
    }
}
