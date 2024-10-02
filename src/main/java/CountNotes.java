import java.util.Scanner;
public class CountNotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();
        int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

        for (int note : notes) {
            if (amount >= note) {  // Check if the amount is greater than or equal to the note
                int count = amount / note; // Calculate the number of notes
                amount = amount % note; // Update the remaining amount
                System.out.println(note + " " + count);
            }
        }
    }
}
