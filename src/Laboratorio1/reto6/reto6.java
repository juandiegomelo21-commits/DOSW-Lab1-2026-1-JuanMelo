package Laboratorio1.reto6;

public class reto6 {
    public static void main(String[] args) {
        System.out.println("--- MÁQUINA DE DECISIONES ---");
        procesarComando("BROMEAR");
    }

    // Lógica Estudiante B: Switch con sus comandos (Sobrescribe al A)
    public static void procesarComando(String comando) {
        switch (comando) {
            case "BROMEAR":
                System.out.println("¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio... 🤡");
                break;
            case "GRITAR":
                System.out.println("¡¡¡ALERTA DE STACK OVERFLOW!!! 📢");
                break;
            case "SUSURRAR":
                System.out.println("Shhh... los bugs están dormidos 🤫");
                break;
            case "ANALIZAR":
                System.out.println("Analizando datos... resultado: ¡Eres increíble programando! 🧠");
                break;
            default:
                System.out.println("Error: Comando no reconocido por la Sección B.");
        }
    }
}