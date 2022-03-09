package exemplo.aulas;

import java.util.Locale;
import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String name;
		double grossSalary, tax, netSalary, percentage, increased;
		
		System.out.print("Name: ");
		name = sc.nextLine();
		
		System.out.print("Gross salary: ");
		grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		tax = sc.nextDouble();
		
		System.out.println("====================================================");
		
		netSalary = grossSalary - tax;
		System.out.println("Employee: " + name + ", $ " + String.format("%.2f", netSalary));
		System.out.println("====================================================");
		
		System.out.print("Which percentage to increase salary: ");
		percentage = sc.nextDouble();
		System.out.println("====================================================");
		
		increased = (percentage/100) * grossSalary + netSalary;
		System.out.print("Updated data: " + name + ", $ " + String.format("%.2f", increased));
		
		sc.close();
	}

}
