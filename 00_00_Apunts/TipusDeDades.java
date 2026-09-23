public class TipusDeDades {
    public static void main(String[] args) {

        // COMENTARI DEL NOSTRE CODI
		
		// Aquest fitxer serveix com apunts
		
		// LITERALS
		System.out.println(1); // Nombre enter
		System.out.println(10.5); // Nombre real
		System.out.println(2 * 3 + 4); // Expressió matemàtica de 10
		System.out.println('H'); // Un únic caràcter
		System.out.println("Variables"); // Escriu per pantalla el text "Variables"
		
		// VARIABLES
		String nom; // Declarar una variable per guardar un string
		nom = "Joan"; // Asignar un valor a la variable nom de tipus String prèviament creada.
		// Els strings han d'anar entre cometes!
		System.out.println(nom); // Imprimeix per pantalla el valor assignar a la variable.
		
		// Ordre
		System.out.println("Bon " + "dia!"); // Exemple de concatenació de dos strings
		System.out.println("Bon dia " + nom + "!"); // Concatenació d'un string, seguit de la variable nom i una exclamació.
		
		// LITERALS I VARIABLES
		int numero; // Declarem variable int, nombre enter
		numero = 10; // Inicialitzem numero a 10
		System.out.println(numero); // Mostrem variable numero
		
		double real; // Declarem variable real
		real = 10.5; // Assigna valor a real
		System.out.println(real); // Imprimeix real
		
		// Les variables poden formar expressions
		System.out.println( 2 * numero + 4); // 2 * 10 +4 (24) (Expressió)
		
		char caracter;
		caracter = 'H';
		System.out.println(caracter); // Un únic caràcter per pantalla
		
		String text;
		text = "Variables";
		System.out.println(text); // Imprimeix el text "Variables" per pantalla
        
        // Nota post-entrega:
        
        // Es pot declarar i inicialitzar a la vegada.
		
    }
}