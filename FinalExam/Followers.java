package FinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Followers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String commandInput = scanner.nextLine();
        Map<String, Integer> likesMap = new LinkedHashMap<>();
        int followersCounter = 0;

        while (!commandInput.equals("Log out")) {
            String[] commandArr = commandInput.split(": ");
            String command = commandArr[0];

            switch (command) {
                case "New follower": //"New follower: {username}"
                    String username = commandArr[1];
                    if (!likesMap.containsKey(username)) {
                        likesMap.put(username, 0);
                        followersCounter++;
                    }
                    break;
                case "Like": //"Like: {username}: {count}"
                    String liker = commandArr[1];
                    int countLikes = Integer.parseInt(commandArr[2]);
                    if (!likesMap.containsKey(liker)) {
                        likesMap.put(liker, countLikes);
                        followersCounter++;
                    } else {
                        likesMap.put(liker, likesMap.get(liker) + countLikes);
                    }
                    break;
                case "Comment": //"Comment: {username}"
                    String commentedUsername = commandArr[1];
                    if (!likesMap.containsKey(commentedUsername)) {
                        likesMap.put(commentedUsername, 1);
                        followersCounter++;
                    } else {
                        likesMap.put(commentedUsername, likesMap.get(commentedUsername) + 1);
                    }
                    break;
                case "Blocked": //"Blocked: {username}"
                    String userToDelete = commandArr[1];
                    if (likesMap.containsKey(userToDelete)) {
                        likesMap.remove(userToDelete);
                        followersCounter--;
                    } else {
                        System.out.println(userToDelete + " doesn't exist.");
                    }
                    break;
            }
            commandInput = scanner.nextLine();
        }
        System.out.println(followersCounter + " followers");
        for (Map.Entry<String, Integer> entry : likesMap.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }

    }
}
