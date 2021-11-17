package org.generation.italy;
import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		// init Scanner
		Scanner input = new Scanner(System.in);
		
		//input varabili
		double costoPerKm = 0.21;
		double kmDaPercorrere;
		int eta;
		double under = 0.2;
		double over = 0.4;
		
		System.out.print("Digitare i chilometri da percorrere: ");
		kmDaPercorrere = input.nextDouble();
		
		System.out.print("Digitare la sua età: ");
		eta = input.nextInt();
		
		double prezzo = costoPerKm * kmDaPercorrere;
		
		//conditions
		
		if(eta < 18 && eta >1) {
			prezzo = prezzo - (prezzo * under);
		} else if(eta >= 65) {
			prezzo = prezzo - (prezzo * over);
		}
		//print
		System.out.println("Costo del biglietto: " + prezzo + " euro");
			
		// close  Scanner
		input.close();
	}
}
