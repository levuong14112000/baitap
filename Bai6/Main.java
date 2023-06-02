package Bai6;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
 double transferAmount;
	account account1 = new account(12345,"Hello1", 950000);
    account account2 = new account(23456,"Hello2", 270000.0);
    Scanner input = new Scanner(System.in);
    System.out.println(account1);
    System.out.println(account2);
    System.out.println("Nhập số tiền chuyển : ");
    transferAmount = input.nextDouble();
    account.transferMoney(account1, account2,transferAmount);
    System.out.println(account2);
}
}
