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
        String validacion; // <--- NUEVO CAMPO
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
    // Lógica Exclusiva del CARRIL 2 (Divisor)
    public static Resultados procesarLista(List<Integer> numeros) {
        int max = obtenerMaximo(numeros);

        String info = obtenerMinimoYLongitud(numeros);
        String[] partes = info.split(",");
        int min = Integer.parseInt(partes[0].split(":")[1].trim());
        long cant = Long.parseLong(partes[1].split(":")[1].trim());

        // FUSION MANUAL: Combinamos Carril 1 (Múltiplo) y Carril 2 (Divisor)
        String esMultiplo = (max % 2 == 0) ? "Es Múltiplo" : "No es Múltiplo";
        String esDivisor  = (max != 0 && 2 % max == 0) ? "Es Divisor" : "No es Divisor";
        String paridad = (cant % 2 != 0) ? "La Cantidad es IMPAR" : "La Cantidad es PAR";

        String val = esMultiplo + " y " + esDivisor + " / " + paridad;

        return new Resultados(max, min, cant, val);
    }
}