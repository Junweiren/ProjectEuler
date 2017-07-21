/**
 * Created by Junwei on 7/19/2017.
 */

/**
 * - Largest prime factor
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
public class Problem3 {
    public static long TEST_NUMBER = 600851475143L;
    public long get_largest_prime_factor(long number){
        if(number <=1 ) return -1;
        else if(number == 2) return 2;
        if(number % 2 == 0) number = number/2;
        int largestPrime = 0;
        for (int i = 3; i <= number; i+=2) {
            if(MathUtility.isPrime(i)){
                if(number % i == 0){
                    number /= i;
                    largestPrime = i;
                }
            }
        }
        return largestPrime;
    }

    public static void main(String[] args) {
        System.out.println(new Problem3().get_largest_prime_factor(TEST_NUMBER));
    }
}
