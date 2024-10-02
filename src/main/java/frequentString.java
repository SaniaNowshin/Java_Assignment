import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
public class frequentString {
        public static void main(String[] args) {
            String str = "I live in Dhaka";
            String str2 = str.replaceAll(" ", "").toLowerCase(); // Remove spaces from the string
            LinkedHashMap<Character, Integer> charCount = new LinkedHashMap<>();
            for (char ch : str2.toCharArray()) {
                charCount.put(ch, charCount.getOrDefault(ch, 0) + 1); // Update the character count in the HashMap
            }
            for (char key : charCount.keySet()) {
                System.out.println(key + " " + charCount.get(key)); //Print the occurrences of each character
            }
        }
    }


