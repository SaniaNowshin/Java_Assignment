import java.util.LinkedHashMap;
public class NonDuplicate {
    public static void main(String[] arg) {
        int arr[] = {1, 1, 2, 3, 1, 2, 4, 5, 6, 5, 4, 7};
        LinkedHashMap<Integer, Integer> intCount = new LinkedHashMap<>(); // Map to store integer counts
        for (int num : arr) {    // Count occurrences of each integer in the array
            intCount.put(num, intCount.getOrDefault(num, 0) + 1);
        }
        System.out.print("Non-duplicate integers: ");
        for (int num : intCount.keySet()) {
            if (intCount.get(num) == 1) { // Check if integer occurs only once
                System.out.print(num + " "); // Print non-duplicate integer directly
            }
        }
    }
}
