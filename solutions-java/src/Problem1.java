/**
 * Created by Junwei on 7/16/2017.
 */

/**
 * - Multiples of 3 and 5
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */

public class Problem1 {
    public static void main(String[] args) {

        System.out.println(new Problem1().get_sum_of_multiples_of_3_or_5_below(1000));
    }

    public long get_sum_of_multiples_of_3_or_5_below(int limit){
        long sum = 0;
        for (int i = 1; i < limit; i++) {
            if(i % 3 == 0 || i % 5 == 0){
                sum += i;
            }
        }
        return sum;
    }
}
