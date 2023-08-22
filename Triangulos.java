import java.util.Scanner;


public class Triangulos {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Los tres lados a, b y c de un triángulo deben satisfacer la desigualdad triangular: cada uno de
        //los lados no puede ser más largo que la suma de los otros dos.
        //Escriba un programa que reciba como entrada los tres lados de un triángulo, e indique:
        //● si acaso el triángulo es inválido; y
        //● si no lo es, qué tipo de triángulo es.
        //1) Triángulo equilátero. Tres lados iguales.
        //2) Triángulo isósceles. Dos lados iguales.
        //3) Triángulo escaleno. Tres lados desiguales


        double a;
        double b;
        double c;

        System.out.println("Este programa calcula el Tipo de Triangulo, segun la medida de sus 3 lados");
        System.out.println("Para ello:");
        System.out.println(" ");

        System.out.println("Ingrese la medida del lado A");
        a=sc.nextDouble();
        System.out.println("Ingrese la medida del lado B");
        b=sc.nextDouble();
        System.out.println("Ingrese la medida del lado C");
        c=sc.nextDouble();

        //Operaciones de Desigualdad de Triangulos

        //Triángulo equilátero (Tres lados iguales): Cualquier longitud positiva y/o representa los lados de un triangulo equilátero.
        //Triángulo isósceles (Dos lados iguales): Si tomamos un lado igual a (por ejemplo, a = 5 a=5),
        //entonces los otros dos lados deben satisfacer la desigualdad: 2n > C
        // 2⋅5 > C
        //10>C

        //Triángulo escaleno (Tres lados desiguales): Si tomamos tres longitudes diferentes a = 7, b = 10 y c= 12,
        //debemos verificar las tres desigualdades:
        //a + b > c
        //7 + 12 > 10
        //17 > 12

        if (a != b && a != c && a + b < c ) {
            System.out.println("Es un triangulo Equilátero");

        } else {
            if (c == a || c == b || a == b || b==a ) {

                System.out.println("Es un triangulo Isóceles");

            } else {

                if (a + b > c ) {
                    System.out.println("Es un Triángulo Escaleno");
                } else {

                    System.out.println("No es un Triángulo Válido");
                }
            }
        }

    }

}