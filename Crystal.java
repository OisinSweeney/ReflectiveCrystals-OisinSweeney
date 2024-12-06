public class Crystal {
    private int currentAngle; // Starting angle
    private int targetAngle; // Predetermined angle to unlock the area

    public Crystal(int startingAngle, int targetAngle) {
        this.currentAngle = startingAngle;
        this.targetAngle = targetAngle;
    }

    public int getCurrentAngle() {
        return currentAngle;
    }

    public boolean rotateLeft(int degrees) {
        if (currentAngle - degrees >= 0) {
            currentAngle -= degrees;
            return true;
        } else {
            System.out.println("Cannot rotate further left!");
            return false;
        }
    }

    public boolean rotateRight(int degrees) {
        if (currentAngle + degrees <= 180) {
            currentAngle += degrees;
            return true;
        } else {
            System.out.println("Cannot rotate further right!");
            return false;
        }
    }

    public boolean isAligned() {
        return currentAngle == targetAngle;
    }
}

