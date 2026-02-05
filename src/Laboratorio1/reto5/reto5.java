package Laboratorio1.reto5;

import java.util.*;

public class Reto5 { // Asegúrate que el nombre de la clase coincida con tu archivo

    public static void main(String[] args) {
        System.out.println("--- BATALLA DE CONJUNTOS ---");
    }

    // Lógica Estudiante B: TreeSet (Ordenado) - Elimina múltiplos de 5
    // NOTA: Usamos este método ocupando el mismo lugar para causar el conflicto
    public static Set<Integer> crearEjercito(List<Integer> numeros) {
        // Usamos TreeSet para que los datos queden ordenados automáticamente
        Set<Integer> treeSet = new TreeSet<>(numeros);

        // Regla del Carril 2: Eliminar múltiplos de 5
        treeSet.removeIf(n -> n % 5 == 0);

        return treeSet;
    }
}