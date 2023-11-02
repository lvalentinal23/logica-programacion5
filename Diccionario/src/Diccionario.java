import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Diccionario {
    public static void main(String[] args) {
        // Crear un diccionario Español-Inglés
        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("casa", "house");
        diccionario.put("coche", "car");
        diccionario.put("manzana", "apple");
        diccionario.put("libro", "book");
        diccionario.put("sol", "sun");
        diccionario.put("luna", "moon");
        diccionario.put("agua", "water");
        diccionario.put("rojo", "red");
        diccionario.put("verde", "green");
        diccionario.put("azul", "blue");
        diccionario.put("amarillo", "yellow");
        diccionario.put("naranja", "orange");
        diccionario.put("tren", "train");
        diccionario.put("avión", "airplane");
        diccionario.put("computadora", "computer");
        diccionario.put("telefono", "phone");
        diccionario.put("amigo", "friend");
        diccionario.put("trabajo", "work");

        // Escoger 5 palabras al azar en español
        String[] palabrasEspanol = diccionario.keySet().toArray(new String[0]);
        Random rand = new Random();
        String[] palabrasAleatorias = new String[5];
        for (int i = 0; i < 5; i++) {
            palabrasAleatorias[i] = palabrasEspanol[rand.nextInt(palabrasEspanol.length)];
        }

        // Pedir al usuario que ingrese las traducciones y comprobar
        Scanner scanner = new Scanner(System.in);
        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;

        for (String palabraEsp : palabrasAleatorias) {
            System.out.print("Traduce '" + palabraEsp + "' al inglés: ");
            String respuesta = scanner.nextLine();
            String traduccionCorrecta = diccionario.get(palabraEsp);

            if (respuesta.equalsIgnoreCase(traduccionCorrecta)) {
                System.out.println("¡Correcto!");
                respuestasCorrectas++;
            } else {
                System.out.println("Incorrecto. La respuesta correcta es: " + traduccionCorrecta);
                respuestasIncorrectas++;
            }
        }

        // Mostrar resultados
        System.out.println("Respuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);
    }
}
