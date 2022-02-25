
package NeatArragement;
/**
 * Importación de librerias para arreglos, números aleatorios y entradas por teclado de usuario.
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Representa la clase Arreglo Ordenado del paquete Arreglo Ordenado.
 * @version 1.0.0 2021-25-02, La clase corresponde a la versión 1 del sistema.
 * @author Yineth Vargas Guerrero - yvargas703@misena.edu.co
 */
public class NeatArragement {
    /**
     * Método Burbuja recorre el arreglo y lo ordena intercambiando valores.
     * @param arr 
     */
    public static void bubbleSort(float arr[]){    	
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    float temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
    /**
     * Método rápido (Java usa por defecto Quick Sort) divide el arreglo y lo ordena.
     * @param arr 
     */
    public static void quickSort(float arr[]) {   
    	Arrays.sort(arr);    	
    }    
    /**
     * Método main, ejecuta el programa.
     * @param args 
     */
    public static void main(String[] args) {
            /**
             * Declaración de variables para número aleatorio y opción que elije el usuario.
             */
            Random rd = new Random(); 
            Scanner in = new Scanner(System.in);
            int sortType, n;				
		
            System.out.println("Presione 1 para Bubble Sort y 0 para Quick Sort");				
            sortType = in.nextInt();
		
            System.out.println("Ingrese el numero de datos para el arreglo:");		
            n = in.nextInt();
				
            in.close();
		
            float arr[] = new float[n];
		
            for(int i=0; i < n; i++){
			arr[i] = rd.nextFloat();
            }
            /**
             * Imprime arreglo original.
             */
            System.out.println("Arreglo Original:");		
            System.out.println(Arrays.toString(arr));
				
            if(sortType == 1){
        	NeatArragement.bubbleSort(arr);
            }
            else{
		NeatArragement.quickSort(arr);
            }
            /**
             * Imprime arreglo ordenado.
             */
            System.out.println("Arreglo Ordenado:");
            System.out.println(Arrays.toString(arr));			
		
	}

}
