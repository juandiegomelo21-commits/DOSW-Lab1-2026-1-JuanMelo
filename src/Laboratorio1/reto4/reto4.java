package Laboratorio1.reto4;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reto4 {

    public static void main(String[] args) {
        System.out.println("--- TESORO DE LLAVES ---");

        // Datos de prueba del PDF
        Map<String, Integer> mapaA = new HashMap<>();
        mapaA.put("oro", 5); mapaA.put("plata", 3); mapaA.put("diamante", 10);

        Map<String, Integer> tablaB = new Hashtable<>();
        tablaB.put("plata", 8); tablaB.put("rubi", 4); tablaB.put("oro", 12); tablaB.put("esmeralda", 6);

        combinaMapas(mapaA, tablaB);
    }

    // SOLUCIÓN FINAL: Stream, Filter, UpperCase, Sorted, Collectors
    public static void combinaMapas(Map<String, Integer> mapa, Map<String, Integer> tabla) {

        // Unimos las llaves de ambos mapas
        Stream.concat(mapa.keySet().stream(), tabla.keySet().stream())
                .distinct() // Evitamos procesar doble
                .map(String::toUpperCase) // 1. Convertir a Mayúsculas
                .sorted() // 2. Ordenar Ascendente
                .forEach(claveMayus -> {
                    // Recuperamos la clave original (en minúscula) para buscar el valor
                    String claveOriginal = claveMayus.toLowerCase();

                    // 3. Prioridad: Si está en Hashtable (tabla), se usa ese. Si no, HashMap.
                    Integer valor = tabla.containsKey(claveOriginal) ? tabla.get(claveOriginal) : mapa.get(claveOriginal);

                    if (valor != null) {
                        System.out.println("Clave: " + claveMayus + " | Valor: " + valor);
                    }
                });
    }
}