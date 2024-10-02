public class secondHighest {
    public static void main(String[] arg) {
        double arr[] = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        double sMax = arr[0];
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                sMax = max; //here the first maximum number is stored as second maximum but not updated
                max = arr[i]; //update the maximum number
            } else if (arr[i] > sMax) {
                sMax = arr[i]; //the number which has stored as 2nd maximum if that is not the actual 2nd, check whether
            }
        }
        System.out.println(sMax);
    }
}

