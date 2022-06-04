package domain;

/**
 * Clase Pregunta con sus atributos.
 *
 * @version 1.0.0 2022-06-03
 * @author Daniel Steven Gil Cruz <danistcruz@gmail.com> - Daniel Felipe Marin Giraldo <felipemaringiraldo@gmail.com>
 * @since 1.0.0
 */
public class Pregunta {

    private int preguntaNum;
    private String descripcion;
    private String respuestaCorrect;
    private String opcion1;
    private String opcion2;
    private String opcion3;
    private String opcion4;
    private String respuestaJugador;


    /**
     * Daniel Steven Gil Cruz <danistcruz@gmail.com> - Daniel Felipe Marin Giraldo <felipemaringiraldo@gmail.com>
     * @since 1.0.0
     * Constructor de pregunta
     */
    public Pregunta(int preguntaNum, String descripcion, String respuestaCorrect, String opcion1, String opcion2, String opcion3, String opcion4){
        this.preguntaNum = preguntaNum;
        this.descripcion = descripcion;
        this.respuestaCorrect = respuestaCorrect;
        this.opcion1 = opcion1;
        this.opcion2 = opcion2;
        this.opcion3 = opcion3;
        this.opcion4 = opcion4;

    }

    /**
     * Daniel Steven Gil Cruz <danistcruz@gmail.com> - Daniel Felipe Marin Giraldo <felipemaringiraldo@gmail.com>
     * @since 1.0.0
     * Constructor de pregunta
     */
    public Pregunta() {
    }

    /**
     * Daniel Steven Gil Cruz <danistcruz@gmail.com> - Daniel Felipe Marin Giraldo <felipemaringiraldo@gmail.com>
     * @since 1.0.0
     * Metodo para acceder a preguntaNum
     */
    public int getPreguntaNum() {return preguntaNum;}

    /**
     * Daniel Steven Gil Cruz <danistcruz@gmail.com> - Daniel Felipe Marin Giraldo <felipemaringiraldo@gmail.com>
     * @since 1.0.0
     * Metodo modificador de preguntaNum
     */
    public void setPreguntaNum(int preguntaNum) {this.preguntaNum = preguntaNum;}

    /**
     * Daniel Steven Gil Cruz <danistcruz@gmail.com> - Daniel Felipe Marin Giraldo <felipemaringiraldo@gmail.com>
     * @since 1.0.0
     * Metodo para acceder a descripcion
     */
    public String getDescripcion() {return descripcion;}

    /**
     * Daniel Steven Gil Cruz <danistcruz@gmail.com> - Daniel Felipe Marin Giraldo <felipemaringiraldo@gmail.com>
     * @since 1.0.0
     * Metodo modificador de descripcion
     */
    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}


    /**
     * Daniel Steven Gil Cruz <danistcruz@gmail.com> - Daniel Felipe Marin Giraldo <felipemaringiraldo@gmail.com>
     * @since 1.0.0
     * Metodo para acceder a respuestaCorrect
     */
    public String getRespuestaCorrect() {return respuestaCorrect;}

    /**
     * Daniel Steven Gil Cruz <danistcruz@gmail.com> - Daniel Felipe Marin Giraldo <felipemaringiraldo@gmail.com>
     * @since 1.0.0
     * Metodo modificador de respuestaCorrect
     */
    public void setRespuestaCorrect(String respuestaCorrect) {this.respuestaCorrect = respuestaCorrect;}

    /**
     * Daniel Steven Gil Cruz <danistcruz@gmail.com> - Daniel Felipe Marin Giraldo <felipemaringiraldo@gmail.com>
     * @since 1.0.0
     * Metodo para acceder a opcion1
     */
    public String getOpcion1() {return opcion1;}

    /**
     * Daniel Steven Gil Cruz <danistcruz@gmail.com> - Daniel Felipe Marin Giraldo <felipemaringiraldo@gmail.com>
     * @since 1.0.0
     * Metodo modificador de opcion1
     */
    public void setOpcion1(String opcion1) {this.opcion1 = opcion1;}

    /**
     * Daniel Steven Gil Cruz <danistcruz@gmail.com> - Daniel Felipe Marin Giraldo <felipemaringiraldo@gmail.com>
     * @since 1.0.0
     * Metodo para acceder a opcion2
     */
    public String getOpcion2() {return opcion2;}

    /**
     * Daniel Steven Gil Cruz <danistcruz@gmail.com> - Daniel Felipe Marin Giraldo <felipemaringiraldo@gmail.com>
     * @since 1.0.0
     * Metodo modificador de opcion2
     */
    public void setOpcion2(String opcion2) {this.opcion2 = opcion2;}

    /**
     * Daniel Steven Gil Cruz <danistcruz@gmail.com> - Daniel Felipe Marin Giraldo <felipemaringiraldo@gmail.com>
     * @since 1.0.0
     * Metodo para acceder a opcion3
     */
    public String getOpcion3() {return opcion3;}

    /**
     * Daniel Steven Gil Cruz <danistcruz@gmail.com> - Daniel Felipe Marin Giraldo <felipemaringiraldo@gmail.com>
     * @since 1.0.0
     * Metodo modificador de opcion3
     */
    public void setOpcion3(String opcion3) {this.opcion3 = opcion3;}

    /**
     * Daniel Steven Gil Cruz <danistcruz@gmail.com> - Daniel Felipe Marin Giraldo <felipemaringiraldo@gmail.com>
     * @since 1.0.0
     * Metodo para acceder a opcion4
     */
    public String getOpcion4() {return opcion4;}

    /**
     * Daniel Steven Gil Cruz <danistcruz@gmail.com> - Daniel Felipe Marin Giraldo <felipemaringiraldo@gmail.com>
     * @since 1.0.0
     * Metodo modificador de opcion4
     */
    public void setOpcion4(String opcion4) {this.opcion4 = opcion4;}

    /**
     * Daniel Steven Gil Cruz <danistcruz@gmail.com> - Daniel Felipe Marin Giraldo <felipemaringiraldo@gmail.com>
     * @since 1.0.0
     * Metodo para acceder a respuestaJugador
     */
    public String getRespuestaJugador() {return respuestaJugador;}

    /**
     * Daniel Steven Gil Cruz <danistcruz@gmail.com> - Daniel Felipe Marin Giraldo <felipemaringiraldo@gmail.com>
     * @since 1.0.0
     * Metodo modificador de respuestaJugador
     */
    public void setRespuestaJugador(String respuestaJugador) {this.respuestaJugador = respuestaJugador;}

  }