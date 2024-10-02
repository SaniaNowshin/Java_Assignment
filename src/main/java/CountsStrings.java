public class CountsStrings {
    public static void main(String[] arg) {
        String myStr = "I am a SQA Engineer";
        String vowels = "aeiou";
        String consonant = "bcdfghjklmnpqrstvwxyz";
        char chars[] = myStr.toLowerCase().toCharArray(); //string to array conversion
        char vowelsArray[] = vowels.toCharArray();
        char consonantArray[] = consonant.toCharArray();
        //words Count
        String word[] = myStr.split(" ");
        System.out.println("Words: " + word.length);
        //Chars count
        System.out.println("Chars: " +(myStr.replaceAll(" ", "").length()));
        //Vowels and consonant count
        int Vowelcount = 0;
        int Consonantcount = 0;
        for (char ch : chars) {
            for (char v : vowelsArray) {
                if (ch == v) {
                    Vowelcount++;
                }
            }
            for (char c : consonantArray) {
                if (ch == c) {
                    Consonantcount++;
                }
            }
        }
            System.out.println("Vowels: " +Vowelcount);
            System.out.println("Consonant: " +Consonantcount);
        }
    }


