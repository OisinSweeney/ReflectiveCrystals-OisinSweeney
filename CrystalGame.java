import java.util.Scanner;

public class CrystalGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize a crystal with starting angle 90 and a target of, e.g., 120 (change number to try different values)
        Crystal crystal = new Crystal(90, 120);

        System.out.println("The crystal starts at 90 degrees. Align it to unlock the hidden area!");
        System.out.println("Enter 'L' to rotate left or 'R' to rotate right followed by degrees (e.g., 'L30').");

        while (!crystal.isAligned()) {
            System.out.println("Current Angle: " + crystal.getCurrentAngle());
            System.out.print("Your input: ");
            String input = scanner.nextLine().trim();

            // Validate input format (e.g., L30 or R45)
            if (!input.matches("^[LRlr]\\d+$")) {
                System.out.println("Invalid input! Use 'L' or 'R' followed by a whole number (e.g., L30 or R15).");
                continue; // Prompt again
            }

            // Parse direction and degrees
            char direction = input.charAt(0);
            int degrees = Integer.parseInt(input.substring(1));

            // Perform the rotation
            switch (direction) {
                case 'L':
                case 'l':
                    if (!crystal.rotateLeft(degrees)) {
                        System.out.println("Invalid rotation! The crystal cannot rotate beyond 0 degrees.");
                    }
                    break;
                case 'R':
                case 'r':
                    if (!crystal.rotateRight(degrees)) {
                        System.out.println("Invalid rotation! The crystal cannot rotate beyond 180 degrees.");
                    }
                    break;
                default:
                    System.out.println("Unexpected error. Please try again.");
            }

            // Check if aligned
            if (crystal.isAligned()) {
                System.out.println("Congratulations! You've aligned the crystal correctly at " + crystal.getCurrentAngle() + " degrees.");
                System.out.println("The hidden area is now unlocked!");
            }
        }

        scanner.close();
    }
}

