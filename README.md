# sofkaU-laboratorioJava-PreguntasYRespuestas

Laboratorio Java TRAINING DESARROLLO DE SOFTWARE C3

Enunciado del reto:

Juego o Reto indicado

Lo que se busca en este juego es pre-construir una serie de preguntas con 4 opciones de respuesta y una de ella válida, además de una categoría asociada con el mismo nivel de dificultad. Cada pregunta debe estar categorizada y debe existir mínimo 5 preguntas por categoría donde por cada ronda se debe extraer una pregunta de esa categoría de forma aleatoria, debe existir 5 rondas en todo el juego, cada ronda otorga premios (puntos o dinero) cuando el jugador acierta correctamente. El acumulado de premios está dentro del concurso pero si dado el caso el jugador pretender salir de juego puede retirarse antes de responder a la pregunta, si por el contrario el jugador pierde entonces saldría del juego sin el acumulado que llevaría en ese momento."

Lenguaje: Java

Salida: por consola
La Aplicacion en Java con Maven + Base de datos no relacional con Mongo DB.
El paquete Clases está compuesto por las clases:

-Conexión -Categoria - Jugador -Ronda -Main -Pregunta
Se importa la dependencia para Mongodb en el archivo POM.XML, se usa el formato tipo Json para guardar y mostrar los datos desde la BD.

Categorias: Las categorias del juego se encuentran en 5 archivos arreglos en la clase Categoria.
Cada categoria está compuesta por 5 preguntas y cada pregunta con sus 4 opciones de respuesta.
Cada categoría hace referencia al nivel de dificultad de cada ronda.

Premios: El juego otorgará 100 puntos por cada ronda superada.
Recuerda que si pierdes no te llevas ningún dinero.
Se tiene además la función de abandonar después de acertar una pregunta


Autores: @Daniel Felipe Marin Giraldo @Daniel Steven Gil
