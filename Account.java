package exemplo.aulas;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Account {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number;
		String hold, balance;
		double withdraw, deposit;
		
		number = Integer.parseInt(JOptionPane.showInputDialog("Enter account number: "));
	
		hold = JOptionPane.showInputDialog("Enter account holder: ");
		
		balance = JOptionPane.showInputDialog("Is there na initial deposit(y/n)? ");
		
		
		if (balance == "y" ||(balance == "Y")) {
			JOptionPane.showInputDialog("Enter initial value: ");
		}else {
		 
		}
		
		
		
		
		
		
		
		
sc.close();
	}

}
