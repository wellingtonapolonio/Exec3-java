package application;

import java.util.Scanner;

import entities.sumCont;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		sumCont s = new sumCont(n1,n2);
		int x = s.sum(n1,n2);
		
		System.out.println("SOMA= "+ x);
		
		sc.close();

	}

}
