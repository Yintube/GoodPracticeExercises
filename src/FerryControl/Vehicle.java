
package FerryControl;
/**
 * Importación libreria para entradas por teclado de usuario.
 */
import java.util.Scanner;

/**
 * Representa la clase Vehiculo del paquete FerryControl.
 * @version 1.0.0 2021-25-02, La clase corresponde a la versión 1 del sistema. 
 * @author Yineth Vargas Guerrero - yvargas703@misena.edu.co
 */
public class Vehicle {
    /**
     * Declaración de variables, protected para abstracción de otras clases.
     */
    protected String enrollment;
    protected DisplacementMedium displacementMedium;
    protected String color;
    protected int passengers;
    protected String requiredCrew;
    protected String admissionHour;
    protected String departureHour;
    /**
     * Método Sobre escrito para mostrar caracteristicas de vehiculo.
     * @return 
     */
    @Override
    public String toString() {
            return "Vehiculo [enrollment=" + enrollment + ", displacementMedium=" + displacementMedium + ", color=" + color
                            + ", passengers=" + passengers + ", requiredCrew=" + requiredCrew + ", admissionHour="
                            + admissionHour + ", departureHour=" + departureHour + "]";
    }
    /**
     * Método constructor instancia objeto.
     * @param enrollment
     * @param displacementMedium
     * @param admissionHour 
     */
    public Vehicle(String enrollment, DisplacementMedium displacementMedium, String admissionHour) {
        super();
        this.enrollment = enrollment;
        this.displacementMedium = displacementMedium;
        this.admissionHour = admissionHour;
    }
    /**
     * Método que permite regitrar vehiculo.
     */
    public void registerVehicle(){
            Scanner in = new Scanner(System.in);
		
            System.out.println("Ingrese el color del vehiculo: ");
            this.color = in.next();
            System.out.println("Ingrese el numero de pasajeros del vehiculo: ");
            this.passengers = in.nextInt();
            System.out.println("Requiere el vehiculo tripulaci�n?");
            this.requiredCrew = in.next();		
		
            in.close();
    }
    /**
     * Encapsulamiento, creación de métodos getter and setter para obtener o modificar los atributos de la clase.
     * Como buena práctica es aconsejable crear solo los get, pero decidí implementar los set.
     * @return 
     */
    public String getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(String enrollment) {
        this.enrollment = enrollment;
    }

    public DisplacementMedium getDisplacementMedium() {
        return displacementMedium;
    }

    public void setDisplacementMedium(DisplacementMedium displacementMedium) {
        this.displacementMedium = displacementMedium;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public String isRequiredCrew() {
        return requiredCrew;
    }

    public void setRequiredCrew(String requiredCrew) {
        this.requiredCrew = requiredCrew;
    }

    public String getAdmissionHour() {
        return admissionHour;
    }

    public void setAdmissionHour(String admissionHour) {
        this.admissionHour = admissionHour;
    }

    public String getDepartureHour() {
        return departureHour;
    }

    public void setDepartureHour(String departureHour) {
        this.departureHour = departureHour;
    }
    
    
    
    
    
    
        
    

}
