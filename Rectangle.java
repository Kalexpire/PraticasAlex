package exemplo.aulas;

import java.util.Locale;
import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double width, height, aR, pR, dR;
		
		System.out.println("Enter rectangle width and height: ");
		width = sc.nextDouble();
		height = sc.nextDouble();
		
		 aR = width * height;
		 pR = 2*(width + height);
		 dR = Math.sqrt((width * width) + (height * height));
		
		System.out.println(" AREA: " + String.format("%.2f", aR));
		System.out.println("PERIMETER: " + String.format("%.2f", pR));
		System.out.println("DIAGONAL: " + String.format("%.2f", dR));
		
		sc.close();
	}

}

