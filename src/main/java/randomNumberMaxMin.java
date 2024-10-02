public class randomNumberMaxMin {
    public static void main(String[] arg) {
        int arr[] = new int[10];
        arr[0] = (int) (Math.random() * 100) + 1; // Initialize the first element with a random number between 1 and 100
        int max = arr[0];
        int min = arr[0];
        System.out.print(arr[0] + " ");

        for (int i = 1; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100) + 1; // Generate random numbers between 1 and 100 for each element
            System.out.print(arr[i] + " ");
            if (arr[i] > max) {
                max = arr[i]; // Update the maximum value if the current number is greater
            }
            if (arr[i] < min) {
                min = arr[i]; // Update the minimum value if the current number is smaller
            }
        }
        System.out.println("\n");
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}

