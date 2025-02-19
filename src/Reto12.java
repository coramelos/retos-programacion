/*
 * Reto #12
 * EN MAYÚSCULAS
 * Fecha publicación enunciado: 11/08/22
 * Fecha publicación resolución: 25/08/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea una función que reciba un String de cualquier tipo y se encargue de
 * poner en mayúscula la primera letra de cada palabra.
 *
 * !!! No se pueden utilizar operaciones del lenguaje que lo resuelvan directamente!!!
 *
 * Información adicional:
 * - Usa el canal de nuestro discord "retos-programación" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el jueves siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio.
 *
 */

import java.nio.charset.StandardCharsets;

public class Reto12 {

  public static void main(String[] args) {
    System.out.println(primeraMayuscula("Me comi 1 ñoqui o Dos - cientos"));
  }

  public static String primeraMayuscula(String frase) {
    String[] palabras;
    String fraseNueva = "";

    palabras = frase.split(" ");

    for (String palabra : palabras) {
      String primeraLetra = palabra.substring(0, 1);
      String restoLetras = palabra.substring(1, palabra.length());

      byte[] ascii = primeraLetra.getBytes(StandardCharsets.US_ASCII);
      if (ascii[0] >= 97 && ascii[0] <= 122) {
        ascii[0] -= 32;
        primeraLetra = Character.toString(ascii[0]);
      } else if (primeraLetra.equals("ñ")) {
        primeraLetra = "Ñ";
      }

      fraseNueva += primeraLetra + restoLetras + " ";
    }

    return fraseNueva;
  }
}
