package problems.atm;

import java.util.Scanner;

public class ATMStarter {

    public static void main(String[] args) {
        System.out.println("Please Enter Amount");
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        ATMValidator.isValid(amount);


    }
}
