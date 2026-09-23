// Apunts

public class Variables1{
	public static void main ( String[] args) {
	
		int numAlumnes = 33;
		int numAules = 2;
		
		System.out.println("Nombre alumnes totals: " + numAlumnes);
		
		double alumnesAula = (double)numAlumnes / numAules; // Convertir de int a double amb "()"
		System.out.println("Nombre alumnes per aula: " + alumnesAula);
		
		int convertirAEnter = (int)alumnesAula;
		System.out.println("Convertir tipus double a enter: " + convertirAEnter);
		
		double sumaAlumes = alumnesAula + alumnesAula;
		System.out.println("Comprovació: " + sumaAlumes);
		System.out.println(0.1 + 0.1 + 0.1); // ERROR PRECISSIÓ
		
		int enterByte = Integer.MAX_VALUE;		
		System.out.println("enterByte + 1: " + (enterByte + 1));
		
		int esParell = 4%2;
		System.out.println("És parell: " + esParell);
		
	}
	
}