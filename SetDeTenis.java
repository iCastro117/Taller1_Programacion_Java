import java.util.Scanner;

public class SetDeTenis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //El joven periodista Ricardo Jorge debe relatar un partido de tenis, pero no conoce las reglas
        //del deporte. En particular, no ha logrado aprender cómo saber si un set ya terminó, y quién lo
        //ganó.
        //Un partido de tenis se divide en sets. Para ganar un set, un jugador debe ganar 6 juegos, pero
        //además debe haber ganado por lo menos dos juegos más que su rival. Si el set está empatado
        //a 5 juegos, el ganador es el primero que llegue a 7. Si el set está empatado a 6 juegos, el set
        //se define en un último juego, en cuyo caso el resultado final es 7-6.
        //Sabiendo que el jugador A ha ganado m juegos, y el jugador B, n juegos, al periodista le
        //gustaría saber:
        //● si A ganó el set, o
        //● si B ganó el set, o
        //● si el set todavía no termina, o
        //● si el resultado es inválido (por ejemplo, 8-6 o 7-3).

        int setJugadorA ;
        int setJugadorB ;

        System.out.println("Ingrese nùmero de SET del Jugador A");
        setJugadorA = sc.nextInt();
        System.out.println("Ingrese nùmero de SET del Jugador B");
        setJugadorB = sc.nextInt();

        if (setJugadorA <= 7 && setJugadorB <= 7) {
            if (setJugadorA >= 6 || setJugadorB >= 6) {
                if (setJugadorA >= 6 && setJugadorA - setJugadorB >= 2) {
                    System.out.println("Ganador: Jugador A");

                } else if (setJugadorB >= 6 && setJugadorB - setJugadorA >= 2) {
                    System.out.println("Ganador: Jugador B");

                } else if (setJugadorA == 7 && setJugadorB == 6) {
                    System.out.println("Ganador: Jugador A (Resultado final: 7-6)");

                } else if (setJugadorB == 7 && setJugadorA == 6) {
                    System.out.println("Ganador: Jugador B (Resultado final: 7-6)");

                } else {
                    System.out.println("El set todavía no termina");
                }
            } else {
                System.out.println("El set todavía no termina");
            }
        } else {
            System.out.println("Resultado inválido");
        }

    } //cierre main


} //cierre class