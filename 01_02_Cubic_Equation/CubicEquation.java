public class CubicEquation {

	public static void main(String[] args) {
		int x = 3; // Assignem les valor d'x abans de fer el càlcul
		int f = x * x * x + 2 * x * x + 4 * x + 5; // Fòrmula de x³ + 2x² + 4x + 5
		System.out.println("f(" + x + ") = " + f );	// Sortida formatada
		
		// Tornem a fer-ho
		x = 5;
		f = x * x * x + 2 * x * x + 4 * x + 5;
		System.out.println("f(" + x + ") = " + f );

		x = 10;
		f = x * x * x + 2 * x * x + 4 * x + 5;
		System.out.println("f(" + x + ") = " + f );

	}
}