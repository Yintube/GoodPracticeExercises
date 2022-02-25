
package PlanetarySystem;

/**
 * Representa la clase Main o Principal del paquete PlanetarySystem, contribuye con la ejecución del programa.
 * @version 1.0.0 2021-25-02, La clase corresponde a la versión 1 del sistema.
 * @author Yineth Vargas Guerrero - yvargas703@misena.edu.co
 */
public class Main {
    
    public static void main(String[] args) {
        /**
         * Abstracción sistema planetario. Creación de objetos astronomicos. 
         */
        AstronomicalObject star = new AstronomicalObject(AstronomicalObjectType.STAR, "Sol");
        star.setMass(0);
        AstronomicalObject p1 = new AstronomicalObject(AstronomicalObjectType.PLANET, "Mercurio");
        p1.setMass(3.285 * Math.pow(10, 23));
        p1.setStarDistanceMillionsKm(68.519);
        AstronomicalObject p2 = new AstronomicalObject(AstronomicalObjectType.PLANET, "Venus");
        p2.setMass(4.867 * Math.pow(10, 24));
        p2.setStarDistanceMillionsKm(68.519);
        
        /**
         *Imprime ejemplo del cálculo de atracción.
         */
        System.out.println(String.format("La atracción gravitacional entre %s y  el %s es: ",p1.getName(), star.getName()));
        System.out.println(p1.gravitationalAttraction(p1, p2.getStarDistanceMillionsKm()));
        
    }

}
