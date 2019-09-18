import java.util.Arrays;

public class VarTry {
    public static void main(String[] args) {
        int[] b;
        b = new int[3];
        b[0] = 5;
        b[1] = 3;
        b[2] = 9;
        int[] c;
        c = new int[5];
        String strrr = Arrays.toString(b);
        String out = strrr.substring(1, strrr.length() - 1);
        System.out.println(strrr);
        System.out.println(out);
        System.out.println(b); // This only prints the references of where the variable is being stored
        System.out.println(c); // Same here as well, this means that you cannot print an array on the go. Use
                               // other methods
    }

}