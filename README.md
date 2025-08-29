## vehiculo-java

Se creo un archivo llamado vehiculo.java



    import java.util.Scanner;
    public class vehiculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la marca: ");
        String marca = sc.nextLine();

        System.out.print("Ingrese el modelo: ");
        String modelo = sc.nextLine();

        System.out.print("Ingrese la cilindrada: ");
        String cilindrada = sc.nextLine();

        System.out.print("Ingrese el tipo de combustible: ");
        String combustible = sc.nextLine();

        System.out.print("Ingrese la capacidad en pasajeros: ");
        int pasajeros = sc.nextInt();

        System.out.println("\nLa marca que ha ingresado es: " + marca);
        System.out.println("El modelo que ha ingresado es: " + modelo);
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada);
        System.out.println("El tipo de combustible es: " + combustible);
        System.out.println("Tiene una capacidad de " + pasajeros + " pasajeros.");

        sc.close();
      }
    }

Compilacion
en la terminal ejecutar el siguiente comando
      
      javac vehiculo.java

Lo que genera el archivo vehiculo.class

Para ejecutar el programa
          
      java vehiculo



Ejemplo de ingreso y salida de datos

    C:\Users\Marcelo\LA U>java vehiculo
    Ingrese la marca: toyota
    Ingrese el modelo: yaris
    Ingrese la cilindrada: 1496cc
    Ingrese el tipo de combustible: gasolina
    Ingrese la capacidad en pasajeros: 5

    La marca ingresada es: toyota
    El modelo ingresado es: yaris
    La cilindrada ingresada es: 1496cc
    El tipo de combustible es: gasolina
    Tiene una capacidad de 5 pasajeros.

Requerimientos Funcionales


- el sistema debe permitir ingresar la marca de un vehiculo
- el sistema debe permitir ingresar el modelo del vehiculo
- el sistema debe permitir ingresar la cilindrada del vehiculo
- el sistema debe permitir ingresar el tipo de combustible del vehiculo
- el sistema debe permitir ingresar la capacidad en pasajero del vehiculo

Requerimientos No Funcionales

- el programa debe ejecutarse en consola sin necesidad de un IDE
- el codigo del programa debe estar escrito en java
- debe compilarse con javac y ejecutarse con Java
- el programa debe funcionar sin problemas y ser claro



Cronograma
https://github.com/users/marceloalfaro/projects/1































