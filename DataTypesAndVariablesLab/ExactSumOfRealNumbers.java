package DataTypesAndVariablesLab;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        BigDecimal sum = new BigDecimal(0);

        for (int i = 0; i < num; i++) {
            BigDecimal currentSum = new BigDecimal(scanner.nextLine());

            sum = sum.add(currentSum);
        }
        System.out.println(sum);
    }
}
