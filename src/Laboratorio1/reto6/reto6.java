package Laboratorio1.reto6;

public class reto6 {
    public static void main(String[] args) {
        System.out.println("--- MÁQUINA DE DECISIONES ---");
        procesarComando("SALUDAR");
    }

    // Lógica Estudiante A: Switch con sus comandos
    public static void procesarComando(String comando) {
        switch (comando) {
            case "SALUDAR":
                System.out.println("¡Saludos, viajero del tiempo y del código!");
                break;
            case "DESPEDIR":
                System.out.println("Que los bits te acompañen, hasta la próxima misión.");
                break;
            case "CANTAR":
                System.out.println("01010101 🎵");
                break;
            case "DANZAR":
                System.out.println("Girando en modo fiesta 💃");
                break;
            default:
                System.out.println("Error: Comando no reconocido por la Sección A.");
        }
    }
}