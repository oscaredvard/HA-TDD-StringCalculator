import java.util.Arrays;

public class StringCalculator {

    public int add(String input) {
        if (input.isEmpty()) {
            return 0;
        } else {
            int[] arr = Arrays.stream(input.split("[,\n]"))
                    .mapToInt(Integer::parseInt).toArray();

            return Arrays.stream(arr).sum();
        }
    }
}
