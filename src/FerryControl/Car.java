
package FerryControl;
/**
 * Importación de libreria para entradas por teclado de usario. 
 */
import java.util.Scanner;

/**
 * Representa la clase Auto del paquete FerryControl.
 * @version 1.0.0 2021-25-02, La clase corresponde a la versión 1 del sistema. 
 * @author Yineth Vargas Guerrero - yvargas703@misena.edu.co
 */
public class Car extends Vehicle{
    /**
     * Declaración de variable, atributo diferenciador.
     */
    public int doors;
    /**
     * Método constructor instancia objeto.
     * @param enrollment
     * @param displacementMedium
     * @param admissionHour 
     */
    public Car(String enrollment, DisplacementMedium displacementMedium, String admissionHour) {
        super(enrollment, displacementMedium, admissionHour);

    }
    /**
     * Método abstracto de la clase vehiculo.
     * Con la propiedad sobre escritura
     * @throws Se utiliza la excepción para verificar el número de puertas.
     */
    @Override
    public void registerVehicle() {				
            try {
                    Scanner in = new Scanner(System.in);
			
                    System.out.println("Ingrese el color del vehiculo: ");
                    this.color = in.next();
                    System.out.println("Ingrese el numero de pasajeros del vehículo: ");
                    this.passengers = in.nextInt();
                    System.out.println("Requiere el vehiculo tripulación?");
                    this.requiredCrew = in.next();		
                    System.out.println("Ingrese las puertas del vehículo: ");
                    this.doors= in.nextInt();
                    in.close();	
            } catch (Exception e) {
                    this.doors= 4;
            }
		
    }    

}
