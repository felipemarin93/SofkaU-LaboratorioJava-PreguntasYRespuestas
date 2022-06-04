package domain;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Clase Ronda con sus atributos.
 *
 * @version 1.0.0 2022-06-03
 * @author Daniel Steven Gil Cruz <danistcruz@gmail.com> - Daniel Felipe Marin Giraldo <felipemaringiraldo@gmail.com>
 * @since 1.0.0
 */
public class Ronda extends Pregunta{
    private int rCorrecta;
    private int si_No;
    private int puntos;

    /**
     * Daniel Steven Gil Cruz <danistcruz@gmail.com> - Daniel Felipe Marin Giraldo <felipemaringiraldo@gmail.com>
     * @since 1.0.0
     * Constructor de Ronda
     */
    public Ronda() {
        // Constructor de ronda
    }

    /**
     * Daniel Steven Gil Cruz <danistcruz@gmail.com> - Daniel Felipe Marin Giraldo <felipemaringiraldo@gmail.com>
     * @since 1.0.0
     * Metodo para acceder a dinero acumulado
     */
    public int getrCorrecta() {return rCorrecta;}

    /**
     * Daniel Steven Gil Cruz <danistcruz@gmail.com> - Daniel Felipe Marin Giraldo <felipemaringiraldo@gmail.com>
     * @since 1.0.0
     * Metodo modificador de nombre
     */
    public void setrCorrecta(int rCorrecta) {this.rCorrecta = rCorrecta;}

    public int getSi_No() {return si_No;}

    public void setSi_No(int si_No) {this.si_No = si_No;}

    public int getPuntos() {return puntos;}

    public void setPuntos(int puntos) {this.puntos = puntos;}

    public void hacerPregunta(Pregunta pregunta){
        Logger log = Logger.getLogger(Ronda.class.getName());
        Scanner scanner = new Scanner(System.in);
        log.info("Ingrese la letra de la respuesta que considere correcta");
        log.info(pregunta.getPreguntaNum()+". "+pregunta.getDescripcion());
        log.info(pregunta.getOpcion1());
        log.info(pregunta.getOpcion2());
        log.info(pregunta.getOpcion3());
        log.info(pregunta.getOpcion4());
        pregunta.setRespuestaJugador(scanner.nextLine());

        if(pregunta.getRespuestaJugador().equalsIgnoreCase(pregunta.getRespuestaCorrect())){
            log.info("Es Correcto");
            setrCorrecta(1);
            sumarPuntos();
        } else {
            log.info("Es Incorrecto");
            setrCorrecta(0);
            puntosaCero();
        }
    }

    public void sumarPuntos(){
        int acumulado = getPuntos();
        acumulado += 100;
        setPuntos(acumulado);

    }
    public void puntosaCero(){
        setPuntos(0);
    }

    public int generarNumeroAleatorio(){
        int numeroAleatorio = (int)(Math.random()*4+0);
        return numeroAleatorio;
    }

    public void continuarSi_No(){
        Logger log = Logger.getLogger(Ronda.class.getName());
        Scanner scanner = new Scanner(System.in);
        log.info("Ahora tienes: "+ getPuntos() +" puntos");
        log.info("Â¿Deseas continuar jugando?, recuerda que si la siguiente pregunta se responde incorrecta tu dinero sera 0$ y habra finalizado el juego");
        log.info("Si deseas continuar marca 1 de lo contrario marca 2");
        setSi_No(scanner.nextInt());
    }

    public void puntosPorDinero(Jugador jugador){
        int dinero;
        dinero = getPuntos() * 10000;
        jugador.setDineroAcumulado(dinero);
    }

    public void rondaLogica(ArrayList<Pregunta> arrayList){
        Logger log = Logger.getLogger(Ronda.class.getName());
        if(getrCorrecta() == 1 && getSi_No() == 1){
            hacerPregunta(arrayList.get(generarNumeroAleatorio()));
            if (getrCorrecta() == 1){
                continuarSi_No();
                if (getrCorrecta() == 1 && getSi_No() == 2){
                    String respuesta = ("Te has retirado, te llevas un total de "+ getPuntos()+ "puntos");
                    log.info(respuesta);

                }
            }
        }else {
            if(getrCorrecta() == 0){
                log.info("Quisiste finalizar el juego");
                setrCorrecta(0);
            }
        }
    }

    public void primeraRonda(ArrayList<Pregunta> preguntamFacil){
        Logger log = Logger.getLogger(Ronda.class.getName());
        hacerPregunta(preguntamFacil.get(generarNumeroAleatorio()));
        if (getrCorrecta() == 1){
            continuarSi_No();
            if(getrCorrecta() == 1 && getSi_No() == 2){
                log.info("Te has retirado,  te llevas un total de "+ getPuntos()+ " Puntos");
            }
        }else {
            if(getrCorrecta() == 0){
                setrCorrecta(0);
                log.info("Has finalizado el juego");
            }
        }
    }

    public void segundaRonda(ArrayList<Pregunta> preguntaFacil){
        rondaLogica(preguntaFacil);
    }

    public void terceraRonda(ArrayList<Pregunta> preguntaModerada){
        rondaLogica(preguntaModerada);
    }

    public void cuartaRonda(ArrayList<Pregunta> preguntaDificil){
        rondaLogica(preguntaDificil);
    }
    public void quintaRonda (ArrayList<Pregunta> preguntaExperto){
        Logger log = Logger.getLogger(Ronda.class.getName());
        if(getrCorrecta() == 1 && getSi_No() == 1){
            hacerPregunta(preguntaExperto.get(generarNumeroAleatorio()));
            if (getrCorrecta() == 1){
                log.info("Has acumulado un monto de: "+ getPuntos()+ " Puntos");
            }
        }else {
            if (getrCorrecta() == 0) {
                setrCorrecta(0);
                log.info("Has finalizado el juego");
            }
        }
    }
}