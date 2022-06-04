package domain;
import com.mongodb.client.MongoCollection;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Laboratorio de Java Preguntas y respuestas.
 *
 * @version 1.0.0 2022-06-03
 * @author Daniel Steven Gil Cruz <danistcruz@gmail.com> - Daniel Felipe Marin Giraldo <felipemaringiraldo@gmail.com>
 * @since 1.0.0
 */
public class Main {
    /**
     * Daniel Steven Gil Cruz <danistcruz@gmail.com> - Daniel Felipe Marin Giraldo <felipemaringiraldo@gmail.com>
     * @since 1.0.0
     * Se hace el switch para manejar un menu, y se crear el jugador
     */
    public static void main(String[] args) {
        Logger log = Logger.getLogger(Main.class.getName());
        Conexion AgregarUsuario = new Conexion();
        log.info("************Preguntas & Respuestas**********");
        log.info("Este juego consiste en una serie de preguntas,donde prodras ganar dinero.");
        log.info("Si respondes de manera correcta acumulas puntos que luego se traducen en dinero si decides retirarte con el acumulado o ganas todas las rondas,\n"
                + "si fallas no te llevas nada.");
        log.info("Ingresa tu nombre:");
        Scanner scanner = new Scanner(System.in);
        Jugador jugador = new Jugador();
        Ronda ronda = new Ronda();
        Categoria categoria = new Categoria();
        jugador.setNombre(scanner.nextLine());
        log.info("Puntos actuales: "+ronda.getPuntos());
        Scanner in = new Scanner(System.in);
        int option;
        do {
            log.info("""
                    ****** PREGUNTAS Y RESPUESTAS SOFKAMILLONARIO ********:\s
                     1-Iniciar un nuevo juego\s
                     2-Mirar el ranking de jugadores\s
                     3-Salir
                     """);
            option = in.nextInt();
            switch (option) {

                case 1 ->{
                    ronda.primeraRonda(categoria.categoria1());
                    ronda.segundaRonda(categoria.categoria2());
                    ronda.terceraRonda(categoria.categoria3());
                    ronda.cuartaRonda(categoria.categoria4());
                    ronda.quintaRonda(categoria.categoria5());
                    ronda.puntosPorDinero(jugador);
                    AgregarUsuario.crearusuario(jugador.getNombre(),jugador.getDineroAcumulado());
                    log.info(jugador.getNombre() +", El dinero ganado en total es: $"+ jugador.getDineroAcumulado()+" Gracias por jugar");
                }
                case 2 ->{
                    MongoCollection<Jugador> players = AgregarUsuario.Conexion().getCollection("playerCollection", Jugador.class);
                    for (Jugador p: players.find()) {
                        log.info(p.nombre +": "+ p.dineroAcumulado);
                    }

                }
                case 3 -> log.info("");
                default ->log.info("OPCION INCORRECTA DIGITE DE NUEVO");
            }
        } while (option != 3);
        log.info("Saliste satisfactoriamente");
    }
}
