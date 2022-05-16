package bridgelabz;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
public class AnagramDetection {
         /**
         * This method takes in the two strings and converts string to char array
         * And the character arrays are sorted and compared
         */
        private static void isAnagram() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter first string : ");
            String str1 = sc.nextLine().toLowerCase();
            System.out.print("Enter second string : ");
            String str2 = sc.nextLine().toLowerCase();
            if (str1.length() != str2.length()) {
                System.out.println(str1 + " and " + str2 + " are not anagrams");
            } else {
                char[] s1Array = str1.toLowerCase(Locale.ROOT).toCharArray();
                char[] s2Array = str2.toLowerCase(Locale.ROOT).toCharArray();
                Arrays.sort(s1Array);
                Arrays.sort(s2Array);
                if (Arrays.equals(s1Array, s2Array)) {
                    System.out.println(str1 + " and " + str2 + " are anagrams");
                }
            }
        }
        //Driver code
        public static void main(String[] args) {
            isAnagram();
        }
    }

