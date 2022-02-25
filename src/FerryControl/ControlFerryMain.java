
package FerryControl;
/**
 * Importación de librerias para mostrar formato de fecha, y entradas por teclado de usuario.
 */
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 * Representa la clase Control Ferry del paquete FerryControl.
 * @version 1.0.0 2021-25-02, La clase corresponde a la versión 1 del sistema. 
 * @author Yineth Vargas Guerrero - yvargas703@misena.edu.co
 */
public abstract class ControlFerryMain {
    /**
     * Método que permite elegir el Medio de desplazamiento de un vehiculo.
     * @param m
     * @return 
     */
    public static DisplacementMedium defineMedium(String m) {
        
            switch (m) {
            case "water": {
                
                    return DisplacementMedium.WATER;
            }
            case "air": {
			
                    return DisplacementMedium.AIR;
            }
            case "land": {
			
                    return DisplacementMedium.LAND;
            }
            default:
                    throw new IllegalArgumentException("Unexpected value: " + m);
		}
	}
	/**
         * Método main, permite la ejecución del programa.
         * @param args 
         */
	public static void main(String[] args) {
                /**
                 * Definición de variables y objetos.
                 */
		int n = 10; // número de vehiculos a listar
		Vehicle[] vehicles = new Vehicle[n]; 
		String enrollment;
		DisplacementMedium displacementMedium;
		String admissionTime;
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < n; i++) {
			
			System.out.println("Ingrese la matricula del vehiculo:");
			enrollment = in.next();
			System.out.println("Ingrese el Medio:");
			displacementMedium = defineMedium(in.next());
			admissionTime = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
			
			vehicles[i] = new Vehicle(enrollment, displacementMedium, admissionTime);

}
                in.close();
                
               
        for (Vehicle obj : vehicles) {
            System.out.println(obj);
        }

        }
}