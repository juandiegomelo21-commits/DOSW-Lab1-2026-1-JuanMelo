package Laboratorio1.reto2;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CarreraParalela {

    public static void main(String[] args) {
        System.out.println("Iniciando carrera...");
    }

    // CLASE RESULTADOS (Debe quedar una sola)
    static class Resultados {
        int max;
        int min;
        long cantidad;
        public Resultados(int max, int min, long cantidad) {
            this.max = max;
            this.min = min;
            this.cantidad = cantidad;
        }
    }

    // METODO DEL CARRIL 1 (Traer de la Izquierda/Actual)
    public static Integer obtenerMaximo(List<Integer> numeros) {
        Function<List<Integer>, Integer> buscarMax = list -> list.stream()
                .max(Integer::compareTo).orElse(0);
        return buscarMax.apply(numeros);
    }

    // METODO DEL CARRIL 2 (Traer de la Derecha/Incoming)
    public static String obtenerMinimoYLongitud(List<Integer> numeros) {
        Function<List<Integer>, Integer> buscarMin = list -> list.stream()
                .min(Integer::compareTo).orElse(0);
        Integer minimo = buscarMin.apply(numeros);
        long cantidad = numeros.size();
        return "Mínimo: " + minimo + ", Total Datos: " + cantidad;
    }

    // LA FUNCION FUSIONADA (Aquí está la magia)
    public static Resultados procesarLista(List<Integer> numeros) {
        // 1. Usamos la lógica del Carril 1
        int max = obtenerMaximo(numeros);

        // 2. Usamos la lógica del Carril 2 (parseando el String que inventamos)
        String info = obtenerMinimoYLongitud(numeros);
        // El string es "Mínimo: X, Total Datos: Y"
        // Hacemos una limpieza rápida para sacar los números:
        String[] partes = info.split(",");
        int min = Integer.parseInt(partes[0].split(":")[1].trim());
        long cant = Long.parseLong(partes[1].split(":")[1].trim());

        // 3. Retornamos TODO junto
        return new Resultados(max, min, cant);
    }
}