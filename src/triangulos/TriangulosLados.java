package triangulos;

import java.util.Scanner;

public class TriangulosLados {

	public static void main(String[] args) {
	
		Scanner leitor = new Scanner (System.in);
		
		double lado1;
		double lado2;
		double lado3;
		
		System.out.print("Primeiro lado do Tri�ngulo: ");
		lado1 = leitor.nextDouble();
		System.out.print("Segundo lado do Tri�ngulo: ");
		lado2 = leitor.nextDouble();
		System.out.print("Terceiro lado do Tri�ngulo: ");
		lado3 = leitor.nextDouble();
		leitor.close();
		
		if (lado1 + lado2 > lado3) {
			if (lado2 + lado3 > lado1) {
				if (lado1 + lado3 > lado2) {
					System.out.println("� um tri�ngulo");
					
					if (lado1 == lado2 && lado2 == lado3 && lado1 == lado3) {
						System.out.println("� um tri�ngulo equil�tero");							
						} else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
							System.out.println("� um tri�ngulo Escaleno");
						} else {	
							System.out.println("� um tri�ngulo Is�sceles");
						}					
					} 				
				} 	
			}		
		 else {
			System.out.println("N�o � um tri�ngulo");
		}		
		}	
	}

		
		
	
			
			
	
		
		
		
 			
		
		
		
		

	


