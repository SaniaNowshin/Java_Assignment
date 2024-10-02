import java.util.Scanner;
public class TwolowestHeight {
    public static void main(String[] arg) {
        double height[] = new double[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the heights of 10 babies in cm:");
        for (int i = 0; i < 10; i++) {
            height[i] = scanner.nextDouble(); // Read the height and store in the array
        }
        double min = Double.MIN_VALUE;
        double sMin = Double.MIN_VALUE;
        for (int i = 0; i < height.length; i++) {
            if (height[i] < min) { // Check if the current height is less than min
                sMin = min; // Update second minimum
                min = height[i]; // Update minimum to the current height
            } else if (height[i] < sMin) { // Check if the current height is less than second minimum
                sMin = height[i]; // Update second minimum
            }
        }
        System.out.println("Lowest Height: " + min);
        System.out.println("2nd Lowest Height: " + sMin);
    }
}
