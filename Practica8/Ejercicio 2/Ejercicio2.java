package mx.unam.fi.poo.g1.p8;

/**
 * Clase principal para Ejercicio2
 * @author Campos Cortés Isaac Jareth
 * @version Octubre 2024
 */
public class Ejercicio2 {
    /**
     * Método principal en el que se ejecuta la funcionalidad del programa.
     * @param args -> Arreglo definido por defecto para main.
     */
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Rodrigo Pérez", "Coordinador", 5);
        Programador programador = new Programador("Dolores Salgrado", "Backend", "Middle");

        System.out.println("A continuación se presenta la información sobre dos empleados:");
        System.out.println("\nInformación sobre el gerente: ");
        gerente.imprimirInformacion();
        System.out.println("\nInformación sobre el programador: ");
        programador.imprimirInformacion();
        System.out.println("");


    }
}

