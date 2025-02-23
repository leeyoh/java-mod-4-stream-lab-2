import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        System.out.println(maxAbsoluteVal(input));
    }

    /**
     * Returns the largest absolute value in the array of numbers.
     *
     * @param numbers the input array of String integer numbers
     * @return the maximum integer absolute value in the array
     */
    public static int maxAbsoluteVal(String[] numbers) {
        return Arrays.stream(numbers).map(x -> Math.abs(Integer.parseInt(x))).max(Integer::compareTo).get();
    }
}
