package HW13;

import java.util.ArrayList;
import java.util.List;

public class ArrayListInteger {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(21);
        numbers.add(37);
        numbers.add(42);
        numbers.add(53);
        numbers.add(110);
        numbers.add(234);

        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        System.out.println("Even numbers are: " + evenNumbers);

    }
}
