import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner print = new Scanner(System.in);

        int numeroDeJugador = print.nextInt();
        int numeroAleatorio = (int) (Math.random()*4+1);
        System.out.println(numeroAleatorio);

        String numJug;
        if (numeroDeJugador == 1) {
            numJug = "Piedra";
        } else if (numeroDeJugador == 2){
            numJug = "Papel";
        } else {
            numJug = "Tijera";
        }

        switch (numeroDeJugador) {
            case 1:
                System.out.println("Jugador 1 ha sacado: " + numJug);
                System.out.println("Jugador 2 ha sacado: ");
                break;

            case 2:
                System.out.println("Jugador 1 ha sacado: " + numJug);
                System.out.println("Jugador 2 ha sacado: ");
                System.out.println("Jugador gana ");
                break;

            case 3:
                System.out.println("Jugador 1 ha sacado: " + numJug);
                System.out.println("Jugador 2 ha sacado: ");
                System.out.println("Jugador gana ");
                break;

        }
    }
}