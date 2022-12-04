package BasicSyntaxExercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String coin = scanner.nextLine();
        //only 0.1, 0.2, 0.5, 1, and 2 coins

        double sumCoin = 0;

        while (!coin.equals("Start")){

            switch (coin){
                case "0.1":
                case "0.2":
                case "0.5":
                case "1":
                case "2":
                    sumCoin = sumCoin + Double.parseDouble(coin);
                    break;
                default:
                    System.out.printf("Cannot accept %.2f\n", Double.parseDouble(coin));
                    break;
            }
            coin = scanner.nextLine();
        }
        //"Nuts", "Water", "Crisps", "Soda", "Coke". The prices are: 2.0, 0.7, 1.5, 0.8, 1.0
        String product = scanner.nextLine();
        double productPrice = 0;

        while (!product .equals("End")){
            switch (product){
                case "Nuts":
                    productPrice = 2.0;
                    break;
                case "Water":
                    productPrice = 0.7;
                    break;
                case "Crisps":
                    productPrice = 1.5;
                    break;
                case "Soda":
                    productPrice = 0.8;
                    break;
                case "Coke":
                    productPrice = 1.0;
                    break;
                default:
                    System.out.println("Invalid product");

            }
            if (sumCoin >= productPrice && sumCoin > 0 && productPrice > 0){
                System.out.printf("Purchased %s\n", product);
                sumCoin = sumCoin - productPrice;
                productPrice = 0;
            }else if (productPrice > 0){
                System.out.println("Sorry, not enough money");
                productPrice = 0;
            }
            product = scanner.nextLine();

        }
        System.out.printf("Change: %.2f", sumCoin);
    }
}
