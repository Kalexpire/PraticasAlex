package exemplo.aulas;

import javax.swing.JOptionPane;
import exemplo.aulas.Product;
public class Program {

	public static void main(String[] args) {
		
		String name;
		double price;
		int quantity;
		
		  JOptionPane.showInputDialog(null, "Enter product data: ");
		  name = JOptionPane.showInputDialog("Name: ");
		  price = Double.parseDouble(JOptionPane.showInputDialog("Price: ")); 
		  quantity = Integer.parseInt(JOptionPane.showInputDialog("Quantity in stock: "));
		  
		
		 Product p = new Product(name, price, quantity);
	
		  JOptionPane.showMessageDialog(null,"Product data: " + p); 
		  JOptionPane.showInputDialog("Enter the number of products to be added in stock: ");
		  p.addProducts(quantity);
		  JOptionPane.showMessageDialog(null, " Products adds: " + quantity);
		  JOptionPane.showMessageDialog(null, "Updated data: " + p); 
		  JOptionPane.showInputDialog("Enter the number of products to be removed from stock: ");
		  p.removeProducts(quantity);
		  JOptionPane.showMessageDialog(null, "Products removed: " + quantity); 
		  JOptionPane.showMessageDialog(null, "Updated data: " + p);
	}

}
