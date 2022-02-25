
package PlanetarySystem;
/**
 * Importación de libreria Clase Object para implementar los métodos HashCode y Equals.
 */
import java.util.Objects;

/**
 * Representa la clase Main o Principal del paquete PlanetarySystem, contribuye con la ejecución del programa.
 * @version 1.0.0 2021-25-02, La clase corresponde a la versión 1 del sistema.
 * @author Yineth Vargas Guerrero - yvargas703@misena.edu.co
 */
public class AstronomicalObject {
    /**
     * Declaración de atributos para Objeto Astronomico.
     */
    public static final double G = .67430 * Math.pow(10, -11); 
    private int id;
    private AstronomicalObjectType type; 
    private String name;
    private double mass;
    private double density;
    private double diameter;
    private double starDistanceMillionsKm;
    
    /**
     * Método constructor instancia un objeto.
     * @param type
     * @param name 
     */
    public AstronomicalObject(AstronomicalObjectType type, String name) {
        super();
        this.type = type;
        this.name = name;
    }
    
    /**
     * Este método permite calcular la atracción gravitacional entre 2 cuerpos celestes.
     * @param objAst
     * @param r
     * @return 
     */
    public double gravitationalAttraction(AstronomicalObject objAst, double r){
        return G*(this.mass * objAst.getMass())/Math.pow(r, 2);
    
    }

    public int getId() {
        return id;
    }
    
    private void setId() {
        this.id = this.hashCode();
    }
    /**
     * Método HashCode (número que hace referencia a la localización del objeto en la memoria Heap)
     * @return 
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, type);
    }
    /**
     * Método Equals permite comparar objetos.
     * @param obj
     * @return 
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
                return true;
        if (obj == null)
                return false;
        if (getClass() != obj.getClass())
                return false;
        AstronomicalObject other = (AstronomicalObject) obj;
        return Objects.equals(name, other.name) && type == other.type;
        
    }
    /**
     * Encapsulamiento, creación de métodos getter and setter para obtener o modificar los atributos de la clase.
     * Como buena práctica es aconsejable crear solo los get, pero decidí implementar los set.
     * @return 
     */
    public AstronomicalObjectType getType(){
        return type;
    }
    
    public void setType(AstronomicalObjectType type){
        this.type = type;
        this.setId();
    }
    
    public String getName() {
        return name;
    }
    
    public void setName (String name) {
        this.name = name;
        this.setId();
    }
    
    public double getMass() {
        return mass;
    }
    
    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getStarDistanceMillionsKm() {
        return starDistanceMillionsKm;
    }

    public void setStarDistanceMillionsKm(double starDistanceMillionsKm) {
        this.starDistanceMillionsKm = starDistanceMillionsKm;
    }
    
         
}
