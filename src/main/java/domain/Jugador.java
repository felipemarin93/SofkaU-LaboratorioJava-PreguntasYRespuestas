package domain;

/**
 * Clase jugador con sus atributos.
 *
 * @version 1.0.0 2022-06-03
 * @author Daniel Steven Gil Cruz <danistcruz@gmail.com> - Daniel Felipe Marin Giraldo <felipemaringiraldo@gmail.com>
 * @since 1.0.0
 */
public class Jugador {
    public String nombre;
    public int dineroAcumulado;

    /**
     * Daniel Steven Gil Cruz <danistcruz@gmail.com> - Daniel Felipe Marin Giraldo <felipemaringiraldo@gmail.com>
     * @since 1.0.0
     * Constructor de jugador vacio
     */
    public Jugador() {
    }

    /**
     * Daniel Steven Gil Cruz <danistcruz@gmail.com> - Daniel Felipe Marin Giraldo <felipemaringiraldo@gmail.com>
     * @since 1.0.0
     * Constructor de jugador con nombre y dinero acomulado
     */
    public Jugador(String nombre, int dineroAcumulado) {
        this.nombre = nombre;
        this.dineroAcumulado = dineroAcumulado;
    }

    /**
     * Daniel Steven Gil Cruz <danistcruz@gmail.com> - Daniel Felipe Marin Giraldo <felipemaringiraldo@gmail.com>
     * @since 1.0.0
     * Metodo para acceder a nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Daniel Steven Gil Cruz <danistcruz@gmail.com> - Daniel Felipe Marin Giraldo <felipemaringiraldo@gmail.com>
     * @since 1.0.0
     * Metodo modificador de nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Daniel Steven Gil Cruz <danistcruz@gmail.com> - Daniel Felipe Marin Giraldo <felipemaringiraldo@gmail.com>
     * @since 1.0.0
     * Metodo para acceder a dinero acumulado
     */
    public int getDineroAcumulado() {return dineroAcumulado;}

    /**
     * Daniel Steven Gil Cruz <danistcruz@gmail.com> - Daniel Felipe Marin Giraldo <felipemaringiraldo@gmail.com>
     * @since 1.0.0
     * Metodo modificador de dinero acumulado
     */
    public void setDineroAcumulado(int dineroAcumulado) {this.dineroAcumulado = dineroAcumulado;}
}