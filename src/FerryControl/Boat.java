
package FerryControl;
/**
 * Importación de libreria para entradas por teclado de usario. 
 */
import java.util.Scanner;

/**
 * Representa la clase Lancha del paquete FerryControl.
 * @version 1.0.0 2021-25-02, La clase corresponde a la versión 1 del sistema. 
 * @author Yineth Vargas Guerrero - yvargas703@misena.edu.co
 */
public class Boat extends Vehicle{
    /**
     * Declaración de variable, atributo diferenciador.
     */  
    public float torque;
    /**
     * Método constructor instancia objeto.
     * @param enrollment
     * @param displacementMedium
     * @param admissionHour 
     */
    public Boat(String enrollment, DisplacementMedium displacementMedium, String admissionHour) {
        super(enrollment, displacementMedium, admissionHour);
    }
    /**
     * Método abstracto de la clase vehiculo.
     * Con la propiedad sobre escritura
     * @throws Se utiliza la excepción para verificar torque de la lancha.
     */    
    @Override
    public void registerVehicle() {				
            try {
                    super.registerVehicle();
                    Scanner in = new Scanner(System.in);
                    System.out.println("Ingrese el torque del vehiculo: ");
                    this.torque = in.nextInt();
                    in.close();	
            } catch (Exception e) {
                    this.torque = (float) 260.4;
                    
            }
    }
		    
   

}
