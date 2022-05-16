package bridgelabz;
import java.util.ArrayList;
public class PrimeNumbers {
        /**
         * Method for determining primes in the given range
         * @param Range takes int the value upto which primeNumbers have to be printed
         */
        public void primeNumbers(int Range) {
            ArrayList<Integer> primes = new ArrayList<>();
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
        public static void main(String[] args) {
            PrimeNumbers obj = new PrimeNumbers();
            obj.primeNumbers(1000);
        }
    }

