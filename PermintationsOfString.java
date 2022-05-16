package bridgelabz;
import java.util.*;
public class PermintationsOfString {
        static Set<String> set = new HashSet<>();
        /**
         * Recursive function to generate all permutations of a string
         * @param partial   takes in the partial permutation of the string
         * @param remaining takes in the remaining part of the string
         */
        private static void permutations(String partial, String remaining) {
            // base case
            if (remaining == null) {
                return;
            }
            // permutation case
            if (remaining.length() == 0) {
                set.add(partial);
            }
            for (int i = 0; i < remaining.length(); i++) {
                String newCandidate = partial + remaining.charAt(i);
                String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
                permutations(newCandidate, newRemaining);
            }
        }
        // Find Permutations of a string in Java
        public static void main(String[] args) {
            String str = "ABC";
            permutations("", str);
            System.out.println(Arrays.toString(set.toArray()));
        }
    }
