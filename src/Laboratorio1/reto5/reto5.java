package Laboratorio1.reto5;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class reto5 {

    public static void main(String[] args) {
        System.out.println("--- BATALLA DE CONJUNTOS ---");

        // Datos de prueba del PDF [cite: 342, 343, 344]
        List<Integer> hashData = Arrays.asList(4, 9, 15, 7, 18, 21, 10, 5);
        List<Integer> treeData = Arrays.asList(12, 3, 25, 10, 7, 30, 18, 4);

        unirEjercitos(hashData, treeData);
    }

    // SOLUCIÓN FINAL: Unión de HashSet y TreeSet filtrados
    public static void unirEjercitos(List<Integer> inputHash, List<Integer> inputTree) {

        // 1. Estudiante A (HashSet): Elimina múltiplos de 3 usando stream().filter()
        Set<Integer> ejercitoA = inputHash.stream()
                .filter(n -> n % 3 != 0) // Deja pasar solo los que NO son múltiplos de 3
                .collect(Collectors.toSet()); // Colecta en un Set sin orden

        // 2. Estudiante B (TreeSet): Elimina múltiplos de 5 usando stream().filter()
        Set<Integer> ejercitoB = inputTree.stream()
                .filter(n -> n % 5 != 0) // Deja pasar solo los que NO son múltiplos de 5
                .collect(Collectors.toCollection(TreeSet::new)); // Colecta en TreeSet (Ordenado)

        // 3. UNIÓN: Juntamos ambos en un TreeSet final para que quede ordenado y sin duplicados
        Set<Integer> unionFinal = new TreeSet<>(ejercitoA);
        unionFinal.addAll(ejercitoB);

        // 4. Salida: Imprimir usando Lambda [cite: 341]
        System.out.println("--- RESULTADO FINAL (Ordenado y Filtrado) ---");
        unionFinal.forEach(n -> System.out.println("Número en arena: " + n));
    }
}