package application;

import java.util.Locale;
import java.util.Scanner;

import service.PrintService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		
		Scanner sc = new Scanner(System.in);
		
		PrintService<Double> ps  = new PrintService<>();
		
			System.out.println("How many values?");
			
			int n = sc.nextInt();
			
			for(int i= 0; i<n; i++) {
				System.out.println("Enter the" + (i+1) + "º");
				double value = sc.nextDouble();
				ps.addValue(value);
			}
			
			ps.print();
			
			System.out.println();
			
			System.out.println("Fist:" + ps.fist());
			
		sc.close();
	}

}
