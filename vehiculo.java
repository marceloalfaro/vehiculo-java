import java.util.Scanner; // Importa la clase Scanner para leer datos desde la consola

public class vehiculo { 		     // Clase principal llamada vehiculo
    public static void main(String[] args) { // punto de entrada de la aplicacion
        Scanner sc = new Scanner(System.in); // se crea objeto scanner para leer la entrada del usuario

        // Entrada de datos

        System.out.print("Ingrese la marca: "); // muesta mensaje solicitando la marca
        String marca = sc.nextLine(); 		// lee la marca ingresada y continua con la otra linea

        System.out.print("Ingrese el modelo: "); // solicita el modelo
        String modelo = sc.nextLine(); 		 // guarda el mensaje y continua con la otra linea

        System.out.print("Ingrese la cilindrada: "); 	// solicita la cilindrada
        String cilindrada = sc.nextLine();	     	// guarda el mensaje y continua

        System.out.print("Ingrese el tipo de combustible: "); // solicita el tipo de combustible
        String combustible = sc.nextLine();		      // guarda mensaje y continua

        System.out.print("Ingrese la capacidad en pasajeros: "); // solicita cantidad de pasajeros
        int pasajeros = sc.nextInt();				 // guarda mensaje y continua

        // Salida de datos

        System.out.println("\nLa marca ingresada es: " + marca);		   
        System.out.println("El modelo ingresado es: " + modelo);
        System.out.println("La cilindrada ingresada es: " + cilindrada);
        System.out.println("El tipo de combustible es: " + combustible);
        System.out.println("Tiene una capacidad de " + pasajeros + " pasajeros.");

        sc.close(); // cierra el objeto Scanner
    }
}
