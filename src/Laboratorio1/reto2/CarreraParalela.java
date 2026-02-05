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

    // Clase auxiliar para guardar resultados
    static class Resultados {
        int max;
        int min; // Este campo lo llenaremos después
        long cantidad;
        public Resultados(int max, int min, long cantidad) {
            this.max = max;
            this.min = min;
            this.cantidad = cantidad;
        }
    }

    // FUNCION CONFLICTIVA - VERSION CARRIL 1
    public static Resultados procesarLista(List<Integer> numeros) {
        int max = obtenerMaximo(numeros);
        // Como soy el Carril 1, aún no sé calcular el mínimo, pongo 0
        return new Resultados(max, 0, numeros.size());
    }
}