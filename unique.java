import java.util.*;

public class unique{

    public static void main(String[] args) {

        String alpha = "abcdcdcdcefgh";

        char[] charArray = alpha.toCharArray();

        Vector charVec = new Vector();

        // Convert array into vector
        for(int i = 0; i < charArray.length; i++){
            charVec.addElement(charArray[i]);
        }
 

        // Nested for loop, save first and check with other loop for similar, then remove.
        int size = charVec.size();

        for (int j = 0; j < size; j++) {
            for (int k = j + 1; k < size; k++) {
                if (charVec.get(j) == charVec.get(k)) {
                    charVec.remove(k);
                    size = charVec.size();
                    k -= 1;
                }
            }
        }
        System.out.println(charVec);

        // Converts to ASCII but does make it unique
        /*
        Set<Character> c = new HashSet<Character>();
        c.addAll(charVec);

        Vector unique = new Vector();
        for (int i : c) {
            unique.addElement(i);
        }

        System.out.println(unique);
        */
    }
}