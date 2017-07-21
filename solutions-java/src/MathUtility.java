/**
 * Created by Junwei on 7/19/2017.
 */
public class MathUtility {
    public static boolean isPrime(int number){
        if(number == 2) return true;
        int squareRoot = (int) Math.sqrt(number);
        for (int tempNum = 3; tempNum <= squareRoot; tempNum+=2) {
            if(number % tempNum == 0)
                return false;
        }
        return true;
    }
}
