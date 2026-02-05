package Laboratorio1.reto3;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class reto3 {

    public static void main(String[] args) {
        System.out.println("--- ECO MISTERIOSO ---");
        // Probamos el eco: debe repetir 3 veces y luego darle la vuelta a todo
        System.out.println("Entrada: Hola");
        System.out.println("Salida: " + generarEco("Hola"));
    }

    // SOLUCIÓN FINAL RETO 3: Combinación de Builder + Buffer + Streams
    public static String generarEco(String mensaje) {
        // Requisito: Uso de lambda para invocar la función [cite: 333]
        Function<String, String> ecoMisterioso = texto -> {

            // Requisito: Uso de stream() para procesar las repeticiones (3 veces) [cite: 330, 334]
            String repetido = IntStream.range(0, 3)
                    .mapToObj(i -> texto) // Repite el texto
                    .collect(Collectors.joining(" ")); // Los une con espacio: "Hola Hola Hola"

            // Requisito: Invertir el resultado (Reverse) [cite: 330]
            // Usamos StringBuilder porque es más eficiente para concatenaciones rápidas
            return new StringBuilder(repetido).reverse().toString();
        };

        return ecoMisterioso.apply(mensaje);
    }



}