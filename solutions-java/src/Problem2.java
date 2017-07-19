/**
 * Created by Junwei on 7/18/2017.
 */

/**
 * - Even Fibonacci numbers
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms.
 * By starting with 1 and 2, the first 10 terms will be:
 *    1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million,
 * find the sum of the even-valued terms.
 */

public class Problem2 {
    public static void main(String[] args) {
        System.out.println(new Problem2().get_sum_of_even_fibonacci_numbers_below(4000000));
    }
    public long get_sum_of_even_fibonacci_numbers_below(int limit){
        long sum = 0;
        int previousTerm1, previousTerm2 = 1;
        for (int currentTerm = 1; currentTerm < limit ; ) {
            if(currentTerm % 2 == 0){
                sum += currentTerm;
            }
            previousTerm1 = previousTerm2;
            previousTerm2 = currentTerm;
            currentTerm = previousTerm1 + previousTerm2;
        }
        return sum;
    }
}