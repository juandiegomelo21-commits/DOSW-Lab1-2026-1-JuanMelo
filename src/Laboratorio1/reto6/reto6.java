package Laboratorio1.reto6;

import java.util.HashMap;
import java.util.Map;

public class reto6 {

    public static void main(String[] args) {
        System.out.println("--- MÁQUINA DE DECISIONES (Map + Lambdas) ---");

        // Probamos todos los comandos
        procesarComando("SALUDAR");
        procesarComando("BROMEAR");
        procesarComando("ANALIZAR");
        procesarComando("DANZAR");
        procesarComando("EXPLOTAR"); // Comando desconocido
    }

    // SOLUCIÓN FINAL: Usamos Map<String, Runnable> en lugar de switch-case gigante
    public static void procesarComando(String comando) {
        Map<String, Runnable> acciones = new HashMap<>();

        // --- Fragmento A ---
        acciones.put("SALUDAR", () -> System.out.println("La máquina dice: ¡Saludos, viajero del tiempo y del código!"));
        acciones.put("DESPEDIR", () -> System.out.println("La máquina dice: Que los bits te acompañen, hasta la próxima misión."));
        acciones.put("CANTAR", () -> System.out.println("La máquina canta: 01010101 🎵"));
        acciones.put("DANZAR", () -> System.out.println("La máquina gira y emite chispas: Girando en modo fiesta 💃"));

        // --- Fragmento B ---
        acciones.put("BROMEAR", () -> System.out.println("La máquina ríe: ¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio... 🤡"));
        acciones.put("GRITAR", () -> System.out.println("La máquina grita: ¡¡¡ALERTA DE STACK OVERFLOW!!! 📢"));
        acciones.put("SUSURRAR", () -> System.out.println("La máquina susurra: Shhh... los bugs están dormidos 🤫"));
        acciones.put("ANALIZAR", () -> System.out.println("La máquina procesa: Analizando datos... resultado: ¡Eres increíble programando! 🧠"));

        // EJECUCIÓN SEGURA: Buscamos la acción y la ejecutamos (o avisamos si no existe)
        Runnable accion = acciones.getOrDefault(comando, () -> System.out.println("⚠️ Comando desconocido: " + comando));
        accion.run();
    }
}