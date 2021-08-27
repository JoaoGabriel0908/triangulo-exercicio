package triangulos;

import java.util.Scanner;

public class TriangulosLados {

	public static void main(String[] args) {
	
		Scanner leitor = new Scanner (System.in);
		
		double lado1;
		double lado2;
		double lado3;
		
		System.out.print("Primeiro lado do Triângulo: ");
		lado1 = leitor.nextDouble();
		System.out.print("Segundo lado do Triângulo: ");
		lado2 = leitor.nextDouble();
		System.out.print("Terceiro lado do Triângulo: ");
		lado3 = leitor.nextDouble();
		leitor.close();
		
		if (lado1 + lado2 > lado3) {
			if (lado2 + lado3 > lado1) {
				if (lado1 + lado3 > lado2) {
					System.out.println("É um triângulo");
					
					if (lado1 == lado2 && lado2 == lado3 && lado1 == lado3) {
						System.out.println("É um triângulo equilátero");							
						} else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
							System.out.println("É um triângulo Escaleno");
						} else {	
							System.out.println("É um triângulo Isósceles");
						}					
					} 				
				} 	
			}		
		 else {
			System.out.println("Não é um triângulo");
		}		
		}	
	}

		
		
	
			
			
	
		
		
		
 			
		
		
		
		

	


