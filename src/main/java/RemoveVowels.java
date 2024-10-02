public class RemoveVowels {
    public static void main(String[] args) {
        String str = "I am a SQA Engineer";
        StringBuilder result = new StringBuilder();
        String vowels = "aeiouAEIOU";
        char[] ch = str.toCharArray();
        for (char c : ch) {
            if (vowels.indexOf(c) == -1) { //Check if the character is not a vowel
                result.append(c); //non-vowel characters to result
            }
        }
        String str2 = str.replaceAll("  ", " ");
        // Print the output after removing vowels, spaces
        System.out.println("Output: " + result.toString().replaceAll("  ", " ").trim());
    }
}
