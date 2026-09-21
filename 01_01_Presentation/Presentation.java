public class Presentation {
    public static void main(String[] args) {

        // Definició de variables:
		String name = "John"; // Tipus de variable string, és a dir, cadena de text.
        String surname = "Doe";
        int age = 33; // Tipus de variable integral, no admet decimals.
        String address = "123 First Avenue, London, WC1 6HB";
        double height =  1.82; // Els tipus double o float si admeten decimals, usar punts en comptes de comes.

		// Imprimir per consola les dades indicades formatades:
        System.out.println("Hello! My name is " + name + " " + surname + ".");
		// Concateno els strings no variables i les variables usant '+', formant així una frase.
		// Important posar espais i punts on s'escau, ja que no és fa automàticament.
		System.out.println("I am " + age + " y/o.");
		System.out.println("My adress is " + address + ".");
		System.out.println("My height is " + height + " meters.");
 
    }
}