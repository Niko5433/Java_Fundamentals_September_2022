package FinalExamPrep;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> pieceComposerMap = new LinkedHashMap<>();
        Map<String, String> pieceKeyMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            //"{piece}|{composer}|{key}"
            String[] sonata = scanner.nextLine().split("\\|");
            String piece = sonata[0];
            String compose = sonata[1];
            String key = sonata[2];

            pieceComposerMap.put(piece, compose);
            pieceKeyMap.put(piece, key);
        }

        String commandInput = scanner.nextLine();

        while (!commandInput.equals("Stop")) {
            String[] commandArr = commandInput.split("\\|");
            String command = commandArr[0];

            switch (command) {
                //"Add|{piece}|{composer}|{key}"
                case "Add":
                    String piece = commandArr[1];
                    String composer = commandArr[2];
                    String key = commandArr[3];

                    if (pieceComposerMap.containsKey(piece) && pieceKeyMap.containsKey(piece)) {
                        System.out.println(piece + " is already in the collection!");
                    } else {
                        pieceComposerMap.put(piece, composer);
                        pieceKeyMap.put(piece, key);
                        System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);
                    }
                    break;
                //"Remove|{piece}"
                case "Remove":
                    String pieceToRemove = commandArr[1];
                    if (pieceComposerMap.containsKey(pieceToRemove) && pieceKeyMap.containsKey(pieceToRemove)) {
                        pieceComposerMap.remove(pieceToRemove);
                        pieceKeyMap.remove(pieceToRemove);
                        System.out.println("Successfully removed " + pieceToRemove + "!");
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", pieceToRemove);
                    }

                    break;
                //"ChangeKey|{piece}|{new key}"
                case "ChangeKey":
                    String pieceToChange = commandArr[1];
                    String newKey = commandArr[2];

                    if (pieceKeyMap.containsKey(pieceToChange)) {
                        pieceKeyMap.put(pieceToChange, newKey);
                        System.out.printf("Changed the key of %s to %s!%n", pieceToChange, newKey);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", pieceToChange);
                    }
                    break;
            }


            commandInput = scanner.nextLine();
        }
        for (Map.Entry<String, String> entry : pieceComposerMap.entrySet()) {
            System.out.printf("%s -> Composer: %s, Key: %s%n", entry.getKey(), entry.getValue(), pieceKeyMap.get(entry.getKey()));
        }


    }
}
