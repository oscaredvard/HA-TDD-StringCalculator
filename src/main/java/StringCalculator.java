import java.util.Arrays;

public class StringCalculator {

    public int add(String input) {
        if (input.isEmpty()) {
            return 0;
        } else {
            String[] arr = input.split("\n", 2);

            String delimiter = String.valueOf(arr[0].charAt(2));

            String regex = "[" + delimiter + "\\n]";

            String[] str_arr =  arr[1].split(regex);

            int[] int_arr = Arrays.stream(str_arr)
                    .mapToInt(Integer::parseInt).toArray();

            for (int i : int_arr) {
                if (Integer.signum(i) == -1) {
                    throw new IllegalArgumentException(String.format("Negatives not allowed - %d", i));
                }
            }

            return Arrays.stream(int_arr).sum();
        }
    }
}