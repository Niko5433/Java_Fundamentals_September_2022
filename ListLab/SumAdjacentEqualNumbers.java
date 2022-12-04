package ListLab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> number = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i < number.size() - 1; i++) {
            double currentNum = number.get(i);
            double nextNum = number.get(i + 1);

            if (currentNum == nextNum) {
                number.set(i, currentNum + nextNum);
                number.remove(i + 1);
                i = -1;
            }
        }
        System.out.println(joinItemsByDelimiter(number, " "));
    }

    public static String joinItemsByDelimiter(List<Double> list, String delimiter) {
        DecimalFormat df = new DecimalFormat("0.#");
        String result = "";
        for (double item : list) {
            String dfSum = df.format(item) + delimiter;
            result += dfSum;
        }
        return result;
    }
}
