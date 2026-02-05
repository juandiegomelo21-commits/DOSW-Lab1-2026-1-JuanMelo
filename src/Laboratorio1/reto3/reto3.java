package Laboratorio1.reto3;

public class reto3 {
    public static void main(String[] args) {
        System.out.println("--- ECO MISTERIOSO ---");
        // Aquí probaremos el eco
    }


    // Lógica del Estudiante B: Invertir texto con StringBuffer
    public static String generarEco(String mensaje) {
        StringBuffer sbuffer = new StringBuffer(mensaje);
        return sbuffer.reverse().toString();
    }
}