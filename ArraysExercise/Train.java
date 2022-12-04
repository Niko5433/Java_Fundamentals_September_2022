package ArraysExercise;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] countWagonsArr = new int[n];
        //пълним масива с хората, които ще се качат на влака
        for (int wagon = 0; wagon < n; wagon++) {
            int currentWagon = Integer.parseInt(scanner.nextLine());
            countWagonsArr[wagon] = currentWagon;
        }
        //принтираме масива

        int sum = 0;
        for (int number : countWagonsArr
        ) {
            System.out.print(number + " ");
            sum += number;
        }
        System.out.println();
        System.out.println(sum);


    }
}
