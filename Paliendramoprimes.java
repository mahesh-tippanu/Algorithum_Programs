package bridgelabz;
import java.util.ArrayList;
public class Paliendramoprimes {
    public static class PrimeNumbers {
        ArrayList<Integer> primes = new ArrayList<>();
        /**
         * Method for determining primes in the given range
         * @param Range takes int the value upto which primeNumbers have to be printed
         */
        public void primeNumbers(int Range) {
            for (int i = 2; i <= Range; i++) {
                int count = 0;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        count++;
                        break;
                    }
                }
                if (count == 0 || i == 2) {
                    primes.add(i);
                }
            }
            System.out.println(primes);
        }
        /**
         * Method for determining the palindrome in prime numbers
         */
        public void palindromes() {
            ArrayList<Integer> palindromeList = new ArrayList<>();
            for (int i : primes) {
                if (i > 10) {
                    if (i == reverse(i)) {
                        palindromeList.add(i);
                    }
                }
            }
            System.out.println(palindromeList);
        }
        /**
         * Method for reversing the number
         * @param num takes integer as parameter
         * @return returns the reverse of the passed integer
         */
        public int reverse(int num) {
            int update = 0;
            while (num > 0) {
                int remainder = num % 10;
                update = update * 10 + remainder;
                num = num / 10;
            }
            return update;
        }
        public static void main(String[] args) {
            PrimeNumbers obj = new PrimeNumbers();
            System.out.println("Primes are: ");
            obj.primeNumbers(1000);
            System.out.println("Palindrome primes are: ");
            obj.palindromes();
        }
    }
}
