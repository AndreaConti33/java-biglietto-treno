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
		double prezzoBiglietto = costoPerKm * kmDaPercorrere;
		System.out.print("Digitare la sua età: ");
		eta = input.nextInt();
		
		//conditions
		
		if(eta < 18 && eta >1) {
			prezzoBiglietto = prezzoBiglietto - (prezzoBiglietto * under);
		} else if(eta >= 65) {
			prezzoBiglietto = prezzoBiglietto - (prezzoBiglietto * over);
		}
		//print
		System.out.println("Costo del biglietto: " + prezzoBiglietto + " euro");
			
		// close  Scanner
		input.close();
	}
}

