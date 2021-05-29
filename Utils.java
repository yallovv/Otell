import java.lang.reflect.Method;
import java.math.BigInteger;

public class Utils {

    private Utils() { }

    public static String computeFactorial(int number)
                                               throws IllegalArgumentException {
        if (number < 1) {
            throw new IllegalArgumentException("zero or negative parameter (" + number + ')');
        }

        BigInteger factorial = new BigInteger("1");
        for (int i = 2; i <= number; i++) {
            factorial = factorial.multiply(new BigInteger(String.valueOf(i)));
        }
        return factorial.toString();
    }

}
