import java.util.Arrays; // Importing the Arrays class
public class AscendingOrder {
    public static void main(String[] arg) {
        double arr[] = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++){// Swap if the current element is greater
                if (arr[i] > arr[j]) {
                    double temp = arr[i]; // Temporary storage for swapping
                    arr[i] = arr[j]; // Assign next element to current
                    arr[j] = temp; // Assign temp value to next
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

