public class CrystalTest {
    public static void main(String[] args) {
        // Create a new crystal starting at 90 degrees with a target of 120
        Crystal crystal = new Crystal(90, 120);

        System.out.println("Initial Angle: " + crystal.getCurrentAngle());

        // Test rotating left within bounds
        System.out.println("\n--- Test: Rotate Left by 30 ---");
        boolean result = crystal.rotateLeft(30);
        System.out.println("Rotation Success: " + result);
        System.out.println("Current Angle: " + crystal.getCurrentAngle());

        // Test rotating left out of bounds
        System.out.println("\n--- Test: Rotate Left by 100 ---");
        result = crystal.rotateLeft(100);
        System.out.println("Rotation Success: " + result);
        System.out.println("Current Angle: " + crystal.getCurrentAngle());

        // Test rotating right within bounds
        System.out.println("\n--- Test: Rotate Right by 30 ---");
        result = crystal.rotateRight(30);
        System.out.println("Rotation Success: " + result);
        System.out.println("Current Angle: " + crystal.getCurrentAngle());

        // Test rotating right out of bounds
        System.out.println("\n--- Test: Rotate Right by 100 ---");
        result = crystal.rotateRight(100);
        System.out.println("Rotation Success: " + result);
        System.out.println("Current Angle: " + crystal.getCurrentAngle());

        // Test alignment
        System.out.println("\n--- Test: Is Aligned ---");
        boolean isAligned = crystal.isAligned();
        System.out.println("Is Aligned: " + isAligned);
    }
}

