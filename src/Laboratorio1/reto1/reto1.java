package Laboratorio1.reto1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class reto1 {

    // 1. Clase interna estática para el Estudiante (Requisito del PDF)
    static class Estudiante {
        String nombre;
        String correo;
        String semestre;
        int edad;

        public Estudiante(String nombre, String correo, String semestre, int edad) {
            this.nombre = nombre;
            this.correo = correo;
            this.semestre = semestre;
            this.edad = edad;
        }
    }

    public static void main(String[] args) {
        // 2. Crear la lista de estudiantes (Simula tu pareja)
        List<Estudiante> estudiantes = Arrays.asList(
                new Estudiante("Juan Melo", "juan.melo@mail.com", "6.°", 21),
                new Estudiante("Pepe Perez", "pepe.perez@mail.com", "5.°", 20)
        );

        // 3. Tu Misión: Usar Stream y Map para transformar la lista en el mensaje
        // REQUISITO: Usar lambda, map y collect
        String mensaje = estudiantes.stream()
                .map(e -> "Hola, soy " + e.nombre + ", estudiante de " + e.semestre + " semestre. " +"tengo "+  e.edad +" años y este es mi correo electronico " + e.correo)
                .collect(Collectors.joining("\n"));

        System.out.println(mensaje);

        // TIP: El reto pide imprimir edad y correos también, ¡completa el string dentro del map!
    }
}