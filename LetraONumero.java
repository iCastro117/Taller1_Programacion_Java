import java.util.Scanner;

public class LetraONumero {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Escriba un programa que determine si un caracter ingresado es letra, número, o ninguno de
        //los dos. En caso que sea letra, determine si es mayúscula o minúscula.
        //TIP: Para cada caracter es asignado un valor entero (Correspondiente al código ASCII),
        //usted puede aprovechar esto para hacer sus comparaciones de manera más sencilla.
        //EJ:
        //La letra 'a' corresponde al valor entero 97.

        int caracter;
        System.out.println("Ingrese el número del caracter a analizar (Según el número de código código ASCII)");
        caracter = sc.nextInt();

        if ((caracter >= 97 && caracter <= 122)) {

            System.out.println("El caracter es una letra minúscula.");

        } else {
            if (caracter >= 65 && caracter <= 90) {

                System.out.println("El caracter es una letra mayúscula.");
            }
            else {
                if (caracter >= 48 && caracter <= 57) {
                    System.out.println("El caracter es un número.");

                } else {
                    if (caracter >= 128 && caracter <= 255) {
                        System.out.println("El caracter es un caracter ASCII extendido NO IMPRIMIBLE.");

                    } else {
                        System.out.println("El caracter no es ni una letra ni un número.");
                    }

                }//Cierre main

            }
        }
    }// Cierre Main
}//Cierre Class