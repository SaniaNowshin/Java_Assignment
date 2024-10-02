import java.util.Scanner;
public class CGPAbinarySearch {
    public static void main(String[] arg) {
        double arr[] = {3.3, 3.32, 3.43, 3.48, 3.5, 3.52, 3.6, 3.63, 3.75, 3.86};
        double left = 0;
        double right = arr.length - 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a CGPA: ");
        double target = scanner.nextDouble();
        // Binary search loop
        while (left <= right) {
            double mid = left + (right - left) / 2; // Calculate mid index

            if (arr[(int)mid] < target)
                left = mid + 1; // If target is greater, move left index up

            else if (arr[(int) mid] == target) {
                System.out.println("Element is found at index: " + Math.ceil(mid));
                break;
            }
            else {
                right = mid - 1; // If target is smaller, move right index down
            }
        }
        if (left > right) {
            System.out.println("Element is not found!");
        }
    }
}
