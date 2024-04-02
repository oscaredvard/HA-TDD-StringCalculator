import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringCalculator {

    public int add(String input) {
        if (input.isEmpty()) {
            return 0;
        } else {
            int[] arr = Arrays.stream(input.split(","))
                    .mapToInt(Integer::parseInt).toArray();

            return Arrays.stream(arr).sum();
        }
    }
}
