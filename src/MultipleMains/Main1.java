
package MultipleMains;

/**
 * Representa la clase Main o Principal del paquete MultipleMains, contribuye con la ejecución del programa.
 * @version 1.0.0 2021-25-02, La clase corresponde a la versión 1 del sistema.
 * @author Yineth Vargas Guerrero - yvargas703@misena.edu.co
 */
public class Main1 {
    
    public static void main(String[] args) {
        
            System.out.println("Punto de entrada 1");
        /**
         * Crea un elemento de traza de la pila que representa el punto de ejecución especificado.
         */
	StackTraceElement[] stack = Thread.currentThread ().getStackTrace ();
	StackTraceElement main = stack[stack.length - 1];
	String mainClass = main.getClassName ();
            System.out.println(String.format("Comando invocado (entrada): %s", mainClass));
        
    }

}
