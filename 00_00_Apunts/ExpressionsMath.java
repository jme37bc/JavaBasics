public class ExpressionsMath {
	public static void main(String[] args) {
		// OPERADORS I PRIORITATS DELS OPERADORS:
		
		// S'avalua sempre d'esquerra a dreta fient primes
		// les operacions més prioritaries.
		//
		// Poseu parèntesis!!!
		
		/*
		
		int expressio = 2 + 12 * 3; // Per exemple aquí podem veure que segons la jerarquia
		// d'operacions té prioritat de càlcul el producte abans que la suma.
		
		// Hi ha diversos operadors enters:
		// Enters: byte, short, int, long. Perill: l'overflow!
		// + - * / (numeros: int, double)
		
		// I operadors per a reals:
		// Reals: float, double. Té un perill, la pèrdua de precissió!
		// % (<-- modul)
		
		System.out.println(expressio);
		
		// Exemple d'operació amb variables
		
		int x = 10;
		int y = 3;
		int z = 4;
		
		int resultat = ((x * y) + (7 * z)) / (x - z);
		System.out.println(resultat);
		System.out.println(4 + 3 / 2); // Hauria de donar 5 ja que té prioritat la divisió
		System.out.println(4 % 5 * 50); // 200
		System.out.println(4 / 5 * 50); // 0
		
		*/
		
		// Compatibilitat entre números
		// Conversió automàtica d'enter a real.
		// (casting en anglès)
		
		System.out.println(3 + 4 * 1.0); // Aquesta operació ens retornarà un 7.0, un 7 de tipus double
		System.out.println(3 + 4 * 1.32773273427); 
		System.out.println(3 / 2 * 1.5); // Retornarà 1.5 real, ja que primer fa el 3/2 que dona 1 enter.
		System.out.println(1.5 * 3 / 2); // 2.25

		// Reals
		double d = 12.5;
		float f = 12.5f;
		System.out.println(d + f); // No puc desar un double "a la caixa dels floats", tret
		// que a la variable float li posi una f a la dreta
		
		int nota1 = 10;
		int nota2 = 7;
		int nota3 = 9;
		
		// La nota màxima
		int notaMaxima = Math.max(nota1, nota2);
		System.out.println("Nota màxima: " + notaMaxima);
		
		double mitjana = (nota1 + nota2 + nota3) / 3.0;
		System.out.println(mitjana);
		
		// Com treure els decimals
		// 8,666... --> 8
		System.out.println("Arrodonida per sota: " + (int) mitjana);
		
		// Nota mitjana arrodonida
		System.out.println("Arrodonida: " + (int) (mitjana + 0.5));
		long resultat = Math.round(mitjana);
		System.out.println(resultat);
		
		
	}
}