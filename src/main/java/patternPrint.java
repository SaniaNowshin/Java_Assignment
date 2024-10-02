public class patternPrint {
    public static void main(String[] arg) {
        for (int i = 5; i >= 1; i--) { // the number of rows
            for (int j = 1; j <= i; j++) { // print numbers from 1 to i
                System.out.print(j + "");
            }
            System.out.println();
        }
        for (int i = 2; i <= 5; i++) { //the number of rows
            for (int j = 1; j <= i; j++) { // print numbers from 1 to i
                System.out.print(j + "");
            }
            System.out.println();
        }
    }
}

