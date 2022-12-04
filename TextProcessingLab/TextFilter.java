package TextProcessingLab;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] banWordsArr = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String banWord: banWordsArr) {
            text = text.replace(banWord, repeatedStars("*", banWord.length()));

        }
        System.out.println(text);
    }
    public static String repeatedStars (String s, int count){
        String result = "";
        for (int i = 0; i < count; i++) {
            result += s;
        }
        return result;
    }

}
