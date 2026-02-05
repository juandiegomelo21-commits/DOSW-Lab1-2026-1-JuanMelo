package Laboratorio1.reto5;
import java.util.*;
import java.util.stream.Collectors;

public class reto5 {
    public static void main(String[] args) {
        System.out.println("--- BATALLA DE CONJUNTOS ---");
    }
    // Lógica Estudiante A: HashSet (Desordenado) - Elimina múltiplos de 3
    public static Set<Integer> crearEjercitoHash(List<Integer> numeros) {
        Set<Integer> hashSet = new HashSet<>(numeros);
        // Regla: Eliminar múltiplos de 3
        hashSet.removeIf(n -> n % 3 == 0);
        return hashSet;
    }
}