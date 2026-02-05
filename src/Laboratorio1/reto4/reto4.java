package Laboratorio1.reto4;

import java.util.*;

public class reto4 {
    public static void main(String[] args) {
        System.out.println("--- TESORO DE LLAVES ---");
    }

// ... dentro de la clase Reto4 ...

    // Lógica Estudiante A: HashMap (Rápido, permite nulos, no sincronizado)
    public static Map<String, Integer> procesarMapa(List<Map.Entry<String, Integer>> entradas) {
        Map<String, Integer> mapa = new HashMap<>();
        for (Map.Entry<String, Integer> par : entradas) {
            // "Ignorando claves duplicadas (conserva el primer valor encontrado)"
            mapa.putIfAbsent(par.getKey(), par.getValue());
        }
        return mapa;
    }
}