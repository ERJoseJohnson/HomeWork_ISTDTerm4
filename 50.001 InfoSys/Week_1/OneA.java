import java.util.Arrays;

//Trial file for checking Array functions and methods
public class OneA {
    public static String fibonacci(int n) {
        int[] outArray = new int[n];
        outArray[0] = 0;
        outArray[1] = 1;
        for (int i = 2; i < n; i++) {
            outArray[i] = outArray[i - 1] + outArray[i - 2];
        }
        String tempstr = Arrays.toString(outArray).replaceAll("\\s+", ""); // Used to replace whitespaces with an exmpty
                                                                           // string
        String outstr = tempstr.substring(1, tempstr.length() - 1); // Removes the brackets from the string that was
                                                                    // previously a list
        return outstr;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }
}