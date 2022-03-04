package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.BusinessExeption;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		System.out.println("Number:");
		int number =  sc.nextInt();
		System.out.println("Holder");
		sc.next();
		String holder = sc.next();
		System.out.println("Initial balance: ");
		Double initialBalance = sc.nextDouble();
		System.out.println("Withdraw limit:");
		Double withdrawLimit = sc.nextDouble();
		
		Account acc = new Account(number, holder, initialBalance, withdrawLimit);
		System.out.println("Enter amount for withdraw:");
		Double withDrawAmount =  sc.nextDouble();
		
		try {
			acc.withDraw(withDrawAmount);
			System.out.printf("New Balance:" + "%.2f%n", acc.getBalance());
		}catch(BusinessExeption  e) {
			System.out.println("Withdraw error:" + e.getMessage());
		}
		
		
		
		sc.close();
	}
	
}
