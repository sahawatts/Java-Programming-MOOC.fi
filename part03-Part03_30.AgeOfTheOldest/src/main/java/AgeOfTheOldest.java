
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] array = input.split(",");
        int oldest = 0;
        
        while (!input.equals("")) {
            if (Integer.valueOf(array[1]) > oldest) {
                oldest = Integer.valueOf(array[1]);
            }
            input = scanner.nextLine();
            array = input.split(",");
        }
        System.out.println("Age of the oldest: " + oldest);

    }
}
