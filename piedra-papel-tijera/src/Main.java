import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner print = new Scanner(System.in);

        // Prints para comenzar el juego

        System.out.println("Piedra, Papel o tijera");
        System.out.println("Las jugadas son: ");
        System.out.println("1: Piedra");
        System.out.println("2: Papel");
        System.out.println("3: Tijera");
        System.out.println("Introduce el número de tu jugada");


        // Creamos la variable con scanner, para saber lo que va a jugar el usuario contra la maquina
        int numeroDeJugador = print.nextInt();
        // Creamos la variable de la "maquina", haciendo un numero random del 1 al 3
        int numeroAleatorio = (int) (Math.random()*3+1);

        // Creamos las dos variables para saber la jugada de cada uno, llamando a la funcion jugada, con sus respectivos datos
        String numJug = jugada(numeroDeJugador);
        String numAl = jugada(numeroAleatorio);

        // Switch para cada uno de los 3 casos
        switch (numeroDeJugador) {
            case 1:
                // Mostramos cada unos de las jugadas que ha hecho el jugador y la maquina
                System.out.println("Jugador 1 ha sacado: " + numJug);
                System.out.println("Jugador 2 ha sacado: " + numAl);

                // Mostramos el resultado de las dos jugadas
                resultado(numeroDeJugador, numeroAleatorio);
                break;

            case 2:
                // Mostramos cada unos de las jugadas que ha hecho el jugador y la maquina
                System.out.println("Jugador 1 ha sacado: " + numJug);
                System.out.println("Jugador 2 ha sacado: " + numAl);

                // Mostramos el resultado de las dos jugadas
                resultado(numeroDeJugador, numeroAleatorio);
                break;

            case 3:
                // Mostramos cada unos de las jugadas que ha hecho el jugador y la maquina
                System.out.println("Jugador 1 ha sacado: " + numJug);
                System.out.println("Jugador 2 ha sacado: " + numAl);

                // Mostramos el resultado de las dos jugadas
                resultado(numeroDeJugador, numeroAleatorio);
                break;

        }
    }

    // Creamos la funcion para la jugada.
    public static String jugada(int numero) {
        // En caso de que la jugada sea 1 da igual el usuario, se devuelve piedra
        if (numero == 1) {
            return "Piedra";
        // En caso de que la jugada sea 2 da igual el usuario, se devuelve papel
        } else if (numero == 2){
            return "Papel";
        // En caso de que no sea ninguna de las dos jugadas anteriores, se devuelve tijera
        } else {
            return "Tijera";
        }
    }

    // Creamos la funcion para determinar el resultado.
    public static void resultado(int numeroDeJugador, int numeroAleatorio) {

        // En caso de que los dos numeros sean iguales, mostrar el resultado como empate
        if (numeroDeJugador == numeroAleatorio) {
            System.out.println("El resultado es: empate.");

        // En caso de que corresponda a alguno de estos comparadores, el resultado siempre será que el jugador 1 gana
        } else if ((numeroDeJugador == 1 && numeroAleatorio == 3) || (numeroDeJugador == 2 && numeroAleatorio == 1) ||(numeroDeJugador == 3 && numeroAleatorio == 2)) {
            System.out.println("El ganador es: Jugador 1");
        } else {
            // En caso de que sea cualquier otra jugada ganará el jugador 2.
            System.out.println("El ganador es: Jugador 2");
        }
    }
}