
package FerryControl;
/**
 * Importación de libreria para entradas por teclado de usario. 
 */
import java.util.Scanner;

/**
 * Representa la clase Moto del paquete FerryControl.
 * @version 1.0.0 2021-25-02, La clase corresponde a la versión 1 del sistema. 
 * @author Yineth Vargas Guerrero - yvargas703@misena.edu.co
 */
public class Motorcycle extends Vehicle {
    /**
     * Declaración de variable, atributo diferenciador.
     */    
    public int wheels;
    /**
     * Método constructor instancia objeto.
     * @param enrollment
     * @param displacementMedium
     * @param admissionHour 
     */
    public Motorcycle(String enrollment, DisplacementMedium displacementMedium, String admissionHour) {
        super(enrollment, displacementMedium, admissionHour);
    }
    /**
     * Método abstracto de la clase vehiculo.
     * Con la propiedad sobre escritura
     * @throws Se utiliza la excepción para verificar el número de ruedas.
     */
    @Override
    public void registerVehicle() {				
            try {
                    super.registerVehicle();
                    Scanner in = new Scanner(System.in);
                    System.out.println("Ingrese las llantas del vehiculo: ");
                    this.wheels = in.nextInt();
                    in.close();	
            } catch (Exception e) {
                    this.wheels = 2;
            }
    }
		    

}
