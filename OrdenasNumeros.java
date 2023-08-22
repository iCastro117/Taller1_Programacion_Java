import java.util.Scanner;

public class OrdenasNumeros {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Escriba un programa que reciba como entrada cuatro números, y los muestre ordenados de
        //menor a mayor:
        //Ingrese numero: 7
        //Ingrese numero: 0
        //Ingrese numero: 6
        //Ingrese numero: 1
        //0 1 6 7
        //Hay más de una manera de resolver este ejercicio

        int num1;
        int num2;
        int num3;
        int num4;
        int mayor;
        int menor;
        int medio1 = 0;
        int medio2 = 0;

        System.out.println("Este programa ordena de menor a mayor 4 números enteros, ingresados por teclado");
        System.out.println("Para ello:");
        System.out.println(" ");

        System.out.println("Ingrese el primer número");
        num1=sc.nextInt();
        System.out.println("Ingrese el segundo número");
        num2=sc.nextInt();
        System.out.println("Ingrese el tercer número");
        num3=sc.nextInt();
        System.out.println("Ingrese el cuarto número");
        num4=sc.nextInt();

        System.out.println(" ");

        if (num1>num2 && num1>num3 && num1>num4) {
            mayor = num1;

        }else if (num2>num1 && num2>num3 && num2>num4) {
            mayor = num2;

        }else if (num3>num1 && num3>num2 && num3>num4) {
            mayor = num3;

        }else   {
            mayor=4;
        }

        if (num1<num2 && num1<num3 && num1<num4) {
            menor = num1;

        }else if (num2<num3 && num2<num1 && num2<num4) {
            menor = num2;

        }else if (num3<num1 && num3<num2 && num3<num4) {
            menor = num3;

        }else   {
            menor=num4;
        }


        if (num1==mayor && num2==menor && num3>num4) {
            medio1 = num3;
            medio2 = num4;

        }else if (num1==mayor && num3==menor && num2>num4) {
            medio1 = num2;
            medio2 = num4;

        }else if (num1==mayor && num4==menor && num2>num3) {
            medio1 = num2;
            medio2 = num3;


        }

        if (num2==mayor && num1==menor && num3>num4) {
            medio1 = num3;
            medio2 = num4;

        }else if (num2==mayor && num3==menor && num1>num4) {
            medio1 = num1;
            medio2 = num4;

        }else if (num2==mayor && num4==menor && num1>num3) {
            medio1 = num1;
            medio2 = num3;

        }


        if (num3==mayor && num1==menor && num2>num4) {
            medio1 = num2;
            medio2 = num4;

        }else if (num3==mayor && num2==menor && num1>num4) {
            medio1 = num1;
            medio2 = num4;

        }else if (num3==mayor && num4==menor && num1>num2) {
            medio1 = num1;
            medio2 = num2;

        }

        if (num4==mayor && num1==menor && num3>num2) {
            medio1 = num3;
            medio2 = num2;

        }else if (num4==mayor && num2==menor && num3>num1) {
            medio1 = num3;
            medio2 = num1;

        }else if (num4==mayor && num3==menor && num2>num1) {
            medio1 = num2;
            medio2 = num1;

        }













        if (num1==mayor && num2==menor && num4>num3) {
            medio1 = num4;
            medio2 = num3;

        }else if (num1==mayor && num3==menor && num4>num2) {
            medio1 = num4;
            medio2 = num2;

        }else if (num1==mayor && num4==menor && num3>num2) {
            medio1 = num3;
            medio2 = num2;


        }

        if (num2==mayor && num1==menor && num4>num3) {
            medio1 = num4;
            medio2 = num3;

        }else if (num2==mayor && num3==menor && num4>num1) {
            medio1 = num4;
            medio2 = num1;

        }else if (num2==mayor && num4==menor && num3>num1) {
            medio1 = num3;
            medio2 = num1;

        }


        if (num3==mayor && num1==menor && num2<num4) {
            medio1 = num4;
            medio2 = num2;

        }else if (num3==mayor && num2==menor && num4>num1) {
            medio1 = num4;
            medio2 = num1;

        }else if (num3==mayor && num4==menor && num2>num1) {
            medio1 = num2;
            medio2 = num1;

        }

        if (num4==mayor && num1==menor && num2>num1) {
            medio1 = num2;
            medio2 = num3;
            System.out.println( menor + " " + medio1 +  " " + medio2 + " " + mayor);

        }else if (num4==mayor && num2==menor && num1>num3) {
            medio1 = num1;
            medio2 = num3;
            System.out.println( menor + " " + medio1 +  " " + medio2 + " " + mayor);
        }else if (num4==mayor && num3==menor && num1>num2) {
            medio1 = num1;
            medio2 = num2;

        }

        System.out.println( menor + " " + medio1 +  " " + medio2 + " " + mayor);

    }// cierre main
}// cierre class