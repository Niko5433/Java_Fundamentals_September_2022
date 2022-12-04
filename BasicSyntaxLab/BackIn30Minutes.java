package BasicSyntaxLab;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int allTime = (hour * 60) + minutes + 30;

        int hours = allTime / 60;
        int min = allTime % 60;

        if (hours > 23){
            hours = 0;
        }

        System.out.printf("%d:%02d", hours , min);

    }
}
