package domain;
import java.util.ArrayList;

public class Categoria {
    public Categoria(){
    }

    public ArrayList categoria1(){
        // Level 1,
        Pregunta  pregunta1 = new Pregunta(1 , "¿Cuál es el río más largo del mundo?", "a", "A. Amazonas", "B. Nilo", "C. Ganges", "D. Tamesis");
        Pregunta  pregunta2 = new Pregunta(2 , "¿Dónde está Transilvania?", "c", "A. Bulgaria", "B. Albania", "C. Rumania", "D. Austria");
        Pregunta  pregunta3 = new Pregunta(3 , "¿Qué día es la fiesta nacional de los Estados Unidos?", "b", "A. 20 de julio", "B. 4 de julio", "C. 11 de Noviembre", "D. 4 de mayo");
        Pregunta  pregunta4 = new Pregunta(4 , "¿Cuál es el océano más grande del mundo?", "b", "A. Indico", "B. Pacifico", "C. Atlantico", "D. Artico");
        Pregunta  pregunta5 = new Pregunta(5 , "¿Cuál es el planeta más grande del Sistema Solar?", "d", "A. Saturno", "B. Tierra", "C. Neptuno", "D. Jupiter");
        ArrayList<Pregunta> preguntamFacil = new ArrayList<>();
        preguntamFacil.add(0, pregunta1);
        preguntamFacil.add(1, pregunta2);
        preguntamFacil.add(2, pregunta3);
        preguntamFacil.add(3, pregunta4);
        preguntamFacil.add(4, pregunta5);
        return preguntamFacil;
    }

    public ArrayList categoria2(){
        Pregunta  pregunta6 = new Pregunta(6 , "¿Cuál es la capital de Alemania?", "c", "A. Múnich", "B. Hamburgo", "C. Berlín", "D. Bremen");
        Pregunta  pregunta7 = new Pregunta(7 , "¿Cuál es la capital de Colombia?", "b", "A. Medellín", "B. Bogotá", "C. Cali", "D. Barranquilla");
        Pregunta  pregunta8 = new Pregunta(8 , "¿Cuál es la capital de China?", "d", "A. Hong Kong", "B. Shanghái", "C. Tianjin", "D. Pekín");
        Pregunta  pregunta9 = new Pregunta(9 , "¿Cuál es la capital de Australia?", "a", "A. Sídney", "B. Canberra", "C. Melbourne", "D. Perth");
        Pregunta  pregunta10 = new Pregunta(10 , "¿Cuál es la capital de Canada?", "c", "A. Vancouver", "B. Montreal", "C. Toronto", "D. Quebec");
        ArrayList<Pregunta> preguntaFacil = new ArrayList<>();
        preguntaFacil.add(0, pregunta6);
        preguntaFacil.add(1, pregunta7);
        preguntaFacil.add(2, pregunta8);
        preguntaFacil.add(3, pregunta9);
        preguntaFacil.add(4, pregunta10);
        return preguntaFacil;
    }

    public ArrayList categoria3(){
        Pregunta  pregunta11 = new Pregunta(11 , "¿Quién fue el primer emperador romano?", "b", "A. Julio Cesar", "B. Cesar Augusto", "C. Nerón", "D. Calígula");
        Pregunta  pregunta12 = new Pregunta(12 , "¿En qué país nació Adolf Hitler?", "a", "A. Austria", "B. Alemania", "C. Suiza", "D. Polonia");
        Pregunta  pregunta13 = new Pregunta(13 , "¿Cómo se llamaba el padre de Alejandro Magno?", "b", "A. Ptolomeo I", "B. Filipo II de Macedonia", "C. Leónidas", "D. Flipo I de Grecia");
        Pregunta  pregunta14 = new Pregunta(14 , "¿Cuál era la capital del Imperio Inca?", "a", "A. Cuzco", "B. Quito", "C. Machu Picchu", "D. Lima");
        Pregunta  pregunta15 = new Pregunta(15 , "¿Cómo se llamaba el primer Presidente de los Estados Unidos?", "b", "A. John Adams", "B. George Washington", "C. Abraham Lincoln", "D. Thomas Jefferson");
        ArrayList<Pregunta> preguntaModerada = new ArrayList<>();
        preguntaModerada.add(0, pregunta11);
        preguntaModerada.add(1, pregunta12);
        preguntaModerada.add(2, pregunta13);
        preguntaModerada.add(3, pregunta14);
        preguntaModerada.add(4, pregunta15);
        return preguntaModerada;
    }

    public ArrayList categoria4(){
        // Level 4,
        Pregunta  pregunta16 = new Pregunta(16 , "SACO es a ASCO lo que 7683 es a...",  "a", "A. 6783", "B. 3876", "C. 8376", "D. 7638");
        Pregunta  pregunta17 = new Pregunta(17 , "¿Qué grupo continúa la siguiente serie: 2Z3, 4Y5, 6X7...", "c", "A. 8W3", "B. 8Z3", "C. 8W9", "D. 2W9");
        Pregunta  pregunta18 = new Pregunta(18 , "En un cuarto hay gatos, cada gato mira cinco gatos ¿Cuántos gatos hay?", "d", "A. 4", "B. 25", "C. 20", "D. 6");
        Pregunta  pregunta19 = new Pregunta(19 , "Si María habla más bajo que Carmen y Lola habla más alto que Carmen, ¿María habla más alto o más bajo que Lola?",  "c", "A. María habla más alto que Lola", "B. María habla más alto que Carmen", "C. María habla más bajo que Lola", "D. María habla igual que Lola");
        Pregunta  pregunta20 = new Pregunta(20 , "“Cansado” es a “trabajar” como “orgulloso” es a:", "b", "A. Sonreír", "B. Tener éxito", "C. Ser feliz", "D. Ninguna de las anteriores");
        ArrayList<Pregunta> preguntaDificil = new ArrayList<>();
        preguntaDificil.add(0, pregunta16);
        preguntaDificil.add(1, pregunta17);
        preguntaDificil.add(2, pregunta18);
        preguntaDificil.add(3, pregunta19);
        preguntaDificil.add(4, pregunta20);
        return preguntaDificil;
    }

    public ArrayList categoria5(){
        Pregunta  pregunta21 = new Pregunta(21 , "Una sucesión de números empieza con 1 y la secuencia que sigue es que se suma 3 y se resta uno cada vez ¿Cuál es el noveno término?", "c", "A. 7", "B. 15", "C. 17", "D. 10");
        Pregunta  pregunta22 = new Pregunta(22 , "Una persona compra tres docenas de lápices, 12 cuadernos y 10 resmas de papel en $62.4, si cada lápiz cuesta $0.30 y cada cuaderno $1.80, el costo de cada resma es:", "d", "A. $1.5", "B. $1.2", "C. $1.0", "D. $3.0");
        Pregunta  pregunta23 = new Pregunta(23 , "Si tengo 7/8 de dólar. ¿Cuánto me falta para tener un dólar?", "c", "A. 5/9", "B. 11/8", "C. 1/8", "D. 3/10");
        Pregunta  pregunta24 = new Pregunta(24 , "El 35% de una hora es equivalente en minutos a:", "b", "A. 2", "B. 21", "C. 35", "D. 14");
        Pregunta  pregunta25 = new Pregunta(25 , "Se vende un artículo con una ganancia del 15% sobre el precio del costo. Si se ha comprado en $80. Hallar el precio total de la venta.", "c", "A. $95", "B. $90", "C. $92", "D. $91");
        ArrayList<Pregunta> preguntaExperto = new ArrayList<>();
        preguntaExperto.add(0, pregunta21);
        preguntaExperto.add(1, pregunta22);
        preguntaExperto.add(2, pregunta23);
        preguntaExperto.add(3, pregunta24);
        preguntaExperto.add(4, pregunta25);
        return preguntaExperto;
    }
   // public ArrayList<ArrayList> crearpreguntas(){
   //       ArrayList categoriaUno = categoria1();
   //    ArrayList categoriaDos = categoria2();
   //   ArrayList categoriaTres = categoria3();
   //   ArrayList categoriaCuatro = categoria4();
   //   ArrayList categoriaCinco = categoria5();
    //   ArrayList[] preguntas = {categoriaUno,categoriaDos,categoriaTres,categoriaCuatro,categoriaCinco};
    //  return ArrayList<preguntas>;
    // }
}