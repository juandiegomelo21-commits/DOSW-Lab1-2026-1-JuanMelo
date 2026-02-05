package Laboratorio1.reto3;

public class reto3 {
    public static void main(String[] args) {
        System.out.println("--- ECO MISTERIOSO ---");
        // Aquí probaremos el eco
    }


    // Lógica del Estudiante A: Repetir 3 veces con StringBuilder
    public static String generarEco(String mensaje) {
        StringBuilder sb = new StringBuilder();
        // Simulación simple del builder
        sb.append(mensaje).append(" ")
                .append(mensaje).append(" ")
                .append(mensaje);
        return sb.toString();
    }
}