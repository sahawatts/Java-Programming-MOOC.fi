
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    }
    
    public static List<Integer> positive(List<Integer> numbers) {
        return numbers.stream()
                .filter(s -> s > 0)
                .collect(Collectors.toList());
    }
}
