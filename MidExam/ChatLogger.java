package MidExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChatLogger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String commandInput = scanner.nextLine();
        List<String> messagesList = new ArrayList<>();
        //o	"Chat {message}"
        //o	"Delete {message}"
        //o	"Edit {message} {editedVersion}"
        //o	"Pin {message}"
        //o	"Spam {message1} {message2} {messageN}"
        //o	"end"

        while (!commandInput.equals("end")) {
            String[] commandArr = commandInput.split("\\s+");
            String command = commandArr[0];

            switch (command) {
                case "Chat":
                    String messageToAdd = commandArr[1];
                    messagesList.add(messageToAdd);
                    break;
                case "Delete":
                    String messageToDelete = commandArr[1];
                    if (messagesList.contains(messageToDelete)) {
                        messagesList.remove(messageToDelete);
                    }
                    break;
                case "Edit":
                    String oldMessage = commandArr[1];
                    String newMessage = commandArr[2];
                    for (int i = 0; i < messagesList.size(); i++) {
                        String currentMessage = messagesList.get(i);
                        if (currentMessage.equals(oldMessage)) {
                            messagesList.add(i, newMessage);
                            messagesList.remove(i + 1);
                        }
                    }
                    break;
                case "Pin":
                    String messageToPin = commandArr[1];
                    int count = messagesList.size() - 1;
                    for (int i = 0; i < count; i++) {
                        String currentMessage = messagesList.get(i);
                        if (currentMessage.equals(messageToPin)) {
                            messagesList.add(messageToPin);
                            messagesList.remove(i);
                        }
                    }

                    break;
                case "Spam":
                    for (int i = 1; i < commandArr.length ; i++) {
                        String currentMessage = commandArr[i];
                        messagesList.add(currentMessage);
                    }
                    break;
            }

            commandInput = scanner.nextLine();
        }
        for (String message:messagesList) {
            System.out.println(message);
        }
    }
}
