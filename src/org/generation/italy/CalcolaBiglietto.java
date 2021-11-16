package org.generation.italy;
import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		// init Scanner
		Scanner input = new Scanner(System.in);
		
		//input varabili
		double prezzoBiglietto = 0.21;
		double kmDaPercorrere;
		int eta;
		double under = 0.2;
		double over = 0.4;
		
		System.out.print("Digitare i chilometri da percorrere: ");
		kmDaPercorrere = input.nextDouble();
		double sommaEuroKm = prezzoBiglietto * kmDaPercorrere;
		System.out.print("Digitare la sua età: ");
		eta = input.nextInt();

		if(eta < 18 && eta >1) {
			System.out.println("Prezzo del biglietto: " + (sommaEuroKm - (sommaEuroKm * under)) + " euro");
		} else if(eta >= 65) {
			System.out.println("Prezzo del biglietto: " + (sommaEuroKm - (sommaEuroKm * over)) + " euro");
		} else {
			System.out.println("Prezzo del biglietto: " + sommaEuroKm + " euro");
		}
		
		// close  Scanner
		input.close();
	}

}
