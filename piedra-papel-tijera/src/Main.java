import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner print = new Scanner(System.in);

        
        int numeroDeJugador = print.nextInt();
        int numeroAleatorio = (int) (Math.random()*3+1);
        System.out.println(numeroAleatorio);

        String numJug = jugada(numeroDeJugador);
        String numAl = jugada(numeroAleatorio);

        switch (numeroDeJugador) {
            case 1:
                System.out.println("Jugador 1 ha sacado: " + numJug);
                System.out.println("Jugador 2 ha sacado: " + numAl);

                resultado(numeroDeJugador, numeroAleatorio);
                break;

            case 2:
                System.out.println("Jugador 1 ha sacado: " + numJug);
                System.out.println("Jugador 2 ha sacado: " + numAl);

                resultado(numeroDeJugador, numeroAleatorio);
                break;

            case 3:
                System.out.println("Jugador 1 ha sacado: " + numJug);
                System.out.println("Jugador 2 ha sacado: " + numAl);

                resultado(numeroDeJugador, numeroAleatorio);
                break;

        }
    }

    public static String jugada(int numero) {
        if (numero == 1) {
            return "Piedra";
        } else if (numero == 2){
            return "Papel";
        } else {
            return "Tijera";
        }
    }

    public static void resultado(int numeroDeJugador, int numeroAleatorio) {

        if (numeroDeJugador == numeroAleatorio) {
            System.out.println("El resultado es: empate.");
        } else if ((numeroDeJugador == 1 && numeroAleatorio == 3) || (numeroDeJugador == 2 && numeroAleatorio == 1) ||(numeroDeJugador == 3 && numeroAleatorio == 2)) {
            System.out.println("El ganador es: Jugador 1");
        } else {
            System.out.println("El ganador es: Jugador 2");
        }
    }
}