import java.util.Scanner;


public class IndicceMasaCorporal {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //El riesgo de que una persona sufra enfermedades coronarias depende de su edad y su índice
        //de masa corporal:
        //El índice de masa corporal es el cuociente entre el peso del individuo en kilos y el cuadrado
        //de su estatura en metros.
        //Escriba un programa que reciba como entrada la estatura, el peso y la edad de una persona, y
        //le entregue su condición de riesgo.

        int edad;
        double peso;
        double estatura;
        double IMC;

        System.out.println("Este programa calcula el IMC de una persona");
        System.out.println("Para ello:");
        System.out.println(" ");

        System.out.println("Ingrese su edad");
        edad=sc.nextInt();
        System.out.println("Ingrese su peso (en Kg)");
        peso=sc.nextDouble();
        System.out.println("Ingrese su estatura (en Cm)");
        estatura=sc.nextDouble();

        //formula para calcular IMC
        IMC = peso/(estatura * estatura);


        if (IMC < 16  ) {
            System.out.println("Edad: " + edad);
            System.out.println("Altura: " + estatura);
            System.out.println("Peso: " + peso);
            System.out.println(" ");
            System.out.println("IMC: " + IMC);
            System.out.println("Estado: Delgadez severa");
        } else {
            if (IMC >= 16 && IMC <= 16.99) {
                System.out.println("Edad: " + edad);
                System.out.println("Altura: " + estatura);
                System.out.println("Peso: " + peso);
                System.out.println(" ");
                System.out.println("IMC: " + IMC);
                System.out.println("Estado: Delgadez Moderada");
            } else {
                if (IMC >= 17 && IMC <= 18.49) {
                    System.out.println("Edad: " + edad);
                    System.out.println("Altura: " + estatura);
                    System.out.println("Peso: " + peso);
                    System.out.println(" ");
                    System.out.println("IMC: " + IMC);
                    System.out.println("Estado: Delgadez Aceptable");
                } else {
                    if (IMC >= 18.5 && IMC <= 24.99) {
                        System.out.println("Edad: " + edad);
                        System.out.println("Altura: " + estatura);
                        System.out.println("Peso: " + peso);
                        System.out.println(" ");
                        System.out.println("IMC: " + IMC);
                        System.out.println("Estado: Peso Normal");
                    } else {
                        if (IMC >= 25 && IMC <= 29.99) {
                            System.out.println("Edad: " + edad);
                            System.out.println("Altura: " + estatura);
                            System.out.println("Peso: " + peso);
                            System.out.println(" ");
                            System.out.println("IMC: " + IMC);
                            System.out.println("Estado: Sobrepeso");

                        } else {
                            if (IMC >= 30 && IMC <= 34.99) {
                                System.out.println("Edad: " + edad);
                                System.out.println("Altura: " + estatura);
                                System.out.println("Peso: " + peso);
                                System.out.println(" ");
                                System.out.println("IMC: " + IMC);
                                System.out.println("Estado: Obesidad TIPO I");

                            } else {
                                if (IMC >= 35 && IMC <= 39.9) {
                                    System.out.println("Edad: " + edad);
                                    System.out.println("Altura: " + estatura);
                                    System.out.println("Peso: " + peso);
                                    System.out.println(" ");
                                    System.out.println("IMC: " + IMC);
                                    System.out.println("Estado: Obesidad TIPO II");
                                } else {
                                    if (IMC >= 40 && IMC <= 49.9) {
                                        System.out.println("Edad: " + edad);
                                        System.out.println("Altura: " + estatura);
                                        System.out.println("Peso: " + peso);
                                        System.out.println(" ");
                                        System.out.println("IMC: " + IMC);
                                        System.out.println("Estado: Obesidad TIPO III (obesidad morbida)");
                                    } else {
                                        if (IMC >= 50) {
                                            System.out.println("Edad: " + edad);
                                            System.out.println("Altura: " + estatura);
                                            System.out.println("Peso: " + peso);
                                            System.out.println(" ");
                                            System.out.println("IMC: " + IMC);
                                            System.out.println("Estado: Obesidad TIPO IV o Extrema");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

}