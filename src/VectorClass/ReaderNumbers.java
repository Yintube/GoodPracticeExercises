
package VectorClass;
/**
 * Importación de libreria para entradas por teclado de usario y vector. 
 */
import java.util.Scanner;
import java.util.Vector;

/**
 * Representa la clase lector de Números del paquete VectorClass.
 * @version 1.0.0 2021-25-02, La clase corresponde a la versión 1 del sistema. 
 * @author Yineth Vargas Guerrero - yvargas703@misena.edu.co
 */
public class ReaderNumbers {
        /**
         * Método main, permite la ejecución del programa.
         * @param args 
         */
	public static void main(String[] args) {  
        /**
         * Definición de variables y vector.
         */
        Vector<Integer> vector = new Vector<Integer>();
        Scanner scanner = new Scanner(System.in);
        int input;
        
        System.out.println("Ingrese los valores:");
        
        boolean arregloValido = true; 
        while(arregloValido)
        {        	
                    
        	input = scanner.nextInt();
        	arregloValido = !(vector.contains(input));
            vector.add(input);    
                        
        }
        /**
         * Método que cierra las entradas por teclado.
         */
        scanner.close();

        System.out.println("Valores Ingresados:");
        for (Integer obj : vector) {
            System.out.println(obj);
        }                

	}
}
    
 



