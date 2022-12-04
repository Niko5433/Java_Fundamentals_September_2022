package BasicSyntaxExercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        String typeOfPeople = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double price = 0;

        if (dayOfWeek .equals ("Friday")) {
            if (typeOfPeople .equals("Students")){
                price = count * 8.45;
                if (count >= 30){
                    price = price - (price * 0.15);
                }
            }else if (typeOfPeople .equals("Business")){
                price = count * 10.90;
                if (count >= 100){
                    price = 10.90 * (count - 10);
                }
            }else if (typeOfPeople .equals("Regular")){
                price = count * 15;
                if (count >= 10 && count <= 20){
                    price = price - (price * 0.05);
                }
            }

        }if (dayOfWeek .equals ("Saturday")) {
            if (typeOfPeople .equals("Students")){
                price = count * 9.80;
                if (count >= 30){
                    price = price - (price * 0.15);
                }
            }else if (typeOfPeople .equals("Business")){
                price = count * 15.60;
                if (count >= 100){
                    price = 15.60 * (count - 10);
                }
            }else if (typeOfPeople .equals("Regular")){
                price = count * 20;
                if (count >= 10 && count <= 20){
                    price = price - (price * 0.05);
                }
            }

        }if (dayOfWeek .equals ("Sunday")) {
            if (typeOfPeople .equals("Students")){
                price = count * 10.46;
                if (count >= 30){
                    price = price - (price * 0.15);
                }
            }else if (typeOfPeople .equals("Business")){
                price = count * 16;
                if (count >= 100){
                    price = 16 * (count - 10);
                }
            }else if (typeOfPeople .equals("Regular")){
                price = count * 22.50;
                if (count >= 10 && count <= 20){
                    price = price - (price * 0.05);
                }
            }

        }
        System.out.printf("Total price: %.2f", price);
    }
}
