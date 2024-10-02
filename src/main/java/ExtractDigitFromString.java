public class ExtractDigitFromString {
    public static void main(String[] args) {
        String str = "The price of a core i7 laptop is 85000 tk and a gaming mouse price is 2500 tk.";
        // Extract digits from the string
        str = str.replaceAll("[^\\d]", " "); // Replace non-digit characters with space
        str = str.trim();  // Trim leading and trailing spaces
        str = str.replaceAll(" +", " "); // Replace multiple spaces with a single space
        System.out.println("Extracted Digits are: " +str);

        String strArray[] = str.split(" ");

        int laptopPrice = Integer.parseInt(strArray[1]);
        int mousePrice = Integer.parseInt(strArray[2]);
        int totalCost = laptopPrice + mousePrice;
        double discount = totalCost * 0.15; // 15% discount
        double finalCost = totalCost - discount;
        System.out.println("Total cost after 15% discount: " + finalCost + " tk");
    }
}
