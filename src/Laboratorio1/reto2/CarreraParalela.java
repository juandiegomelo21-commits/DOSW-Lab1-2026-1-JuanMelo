package Laboratorio1.reto2;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CarreraParalela {
    public static void main(String[] args) {
        System.out.println("Iniciando carrera...");
    }

    // Lógica del Carril 1: Buscar Máximo
    public static Integer obtenerMaximo(List<Integer> numeros) {
        // Lambda para encontrar el maximo
        Function<List<Integer>, Integer> buscarMax = list -> list.stream()
                .max(Integer::compareTo)
                .orElse(0); // Retorna 0 si vacía
        return buscarMax.apply(numeros);
    }

    // Lógica del Carril 2: Buscar Mínimo y Cantidad
    public static String obtenerMinimoYLongitud(List<Integer> numeros) {
        // Lambda para encontrar mínimo
        Function<List<Integer>, Integer> buscarMin = list -> list.stream()
                .min(Integer::compareTo)
                .orElse(0);

        Integer minimo = buscarMin.apply(numeros);
        long cantidad = numeros.size();

        return "Mínimo: " + minimo + ", Total Datos: " + cantidad;
    }
}