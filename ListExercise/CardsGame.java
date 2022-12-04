package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayerDeck = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondPlayerDeck = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String result = returnWinner(firstPlayerDeck, secondPlayerDeck);
        System.out.println(result);
    }

    private static String returnWinner(List<Integer> firstPlayerDeck, List<Integer> secondPlayerDeck) {
        boolean firstPlayerWin = false;
        boolean secondPlayerWin = false;
        int sum = 0;

        while (firstPlayerDeck.size() > 0 && secondPlayerDeck.size() > 0) {
            if (firstPlayerDeck.get(0) > secondPlayerDeck.get(0)) {
                firstPlayerDeck.add(firstPlayerDeck.get(0));
                firstPlayerDeck.add(secondPlayerDeck.get(0));
                firstPlayerDeck.remove(firstPlayerDeck.get(0));
                secondPlayerDeck.remove(secondPlayerDeck.get(0));
            } else if (secondPlayerDeck.get(0) > firstPlayerDeck.get(0)) {
                secondPlayerDeck.add(secondPlayerDeck.get(0));
                secondPlayerDeck.add(firstPlayerDeck.get(0));
                firstPlayerDeck.remove(firstPlayerDeck.get(0));
                secondPlayerDeck.remove(secondPlayerDeck.get(0));
            } else {
                firstPlayerDeck.remove(firstPlayerDeck.get(0));
                secondPlayerDeck.remove(secondPlayerDeck.get(0));
            }
            if (firstPlayerDeck.size() < 1) {
                secondPlayerWin = true;
                for (int num : secondPlayerDeck) {
                    sum += num;
                }
            } else if (secondPlayerDeck.size() < 1) {
                firstPlayerWin = true;
                for (int num : firstPlayerDeck) {
                    sum += num;
                }
            }
        }

        if (firstPlayerWin) {
            return "First player wins! Sum: " + sum;
        } else {
            return "Second player wins! Sum: " + sum;
        }
    }
}
