package Laboratorio1.reto2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class CarreraParalela {

    public static void main(String[] args) {
        System.out.println("--- INICIANDO CARRERA ---");

        // La Gran Meta pide probar con dos listados
        List<Integer> lista1 = Arrays.asList(10, 20, 5, 8, 30); // Max 30 (Par, Múltiplo de 2, Cantidad 5 Impar)
        List<Integer> lista2 = Arrays.asList(3, 7, 1);          // Max 7 (Impar, Cantidad 3 Impar)

        System.out.println("Resultados Lista 1: " + procesarLista(lista1));
        System.out.println("Resultados Lista 2: " + procesarLista(lista2));
    }

    // CLASE RESULTADOS (Completa con todos los campos)
    static class Resultados {
        int max;
        int min;
        long cantidad;
        String validaciones; // Aquí guardaremos todo el texto

        public Resultados(int max, int min, long cantidad, String validaciones) {
            this.max = max;
            this.min = min;
            this.cantidad = cantidad;
            this.validaciones = validaciones;
        }

        @Override
        public String toString() {
            return String.format("Max: %d, Min: %d, Cant: %d | Info: %s", max, min, cantidad, validaciones);
        }
    }

    // METODO CARRIL 1 (Máximo)
    public static Integer obtenerMaximo(List<Integer> numeros) {
        Function<List<Integer>, Integer> buscarMax = list -> list.stream()
                .max(Integer::compareTo).orElse(0);
        return buscarMax.apply(numeros);
    }

    // METODO CARRIL 2 (Mínimo y Longitud)
    public static String obtenerMinimoYLongitud(List<Integer> numeros) {
        Function<List<Integer>, Integer> buscarMin = list -> list.stream()
                .min(Integer::compareTo).orElse(0);
        Integer minimo = buscarMin.apply(numeros);
        long cantidad = numeros.size();
        return "Mínimo: " + minimo + ", Total Datos: " + cantidad;
    }

    // LA GRAN META: Función Unificada
    public static Resultados procesarLista(List<Integer> numeros) {
        // 1. Obtener Max
        int max = obtenerMaximo(numeros);

        // 2. Obtener Min y Cantidad (parseando la lógica del Carril 2)
        String info = obtenerMinimoYLongitud(numeros);
        String[] partes = info.split(",");
        int min = Integer.parseInt(partes[0].split(":")[1].trim());
        long cant = Long.parseLong(partes[1].split(":")[1].trim());

        // 3. Validaciones Combinadas (Ternarios)
        // Lógica: Múltiplo (Carril 1) vs Divisor (Carril 2)
        String tipoNumero = (max % 2 == 0) ? "Es Par/Múltiplo" : (2 % max == 0 ? "Es Divisor" : "No es Divisor ni Múltiplo");

        // Lógica: Cantidad Par (Carril 1) vs Impar (Carril 2)
        String tipoCantidad = (cant % 2 == 0) ? "Cantidad PAR" : "Cantidad IMPAR";

        String validacionFinal = tipoNumero + " y " + tipoCantidad;

        return new Resultados(max, min, cant, validacionFinal);
    }
}

