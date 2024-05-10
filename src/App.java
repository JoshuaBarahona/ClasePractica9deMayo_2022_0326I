/*leer n cantidad de productos a registrar, leer el arreglo de nombres de esos n productos, utilizar busqueda lineal para encontrar uno de los productos, 
si encuentra el producto muestra "se encontró x producto" de lo contrario el producto no está disponible*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        int i;
        String[] producto = new String[5];
        String target;
        String result = linearSearch(producto, target);
        

        for(i=0; i<producto.length; i++)
        {
            System.out.println("Ingrese los productos a registrar: ");
            producto[i] = leer.nextLine();
        }
        if (producto[i].equalsIgnoreCase(target)) {
            System.out.println("Producto encontrado: " + result);
        } else {
            System.out.println("Producto no encontrado en el array.");
        }
        
    }

        

     // Función para realizar la búsqueda lineal
     public static String linearSearch(String[] producto, String target) {
        // Iterar a través de cada elemento del array
        for (int i = 0; i < producto.length; i++) {
            // Comprobar si el elemento actual es igual al valor buscado
            if (producto[i] == target) {
                // Devolver la posición del elemento si se encuentra
                return i;
            }
        }
        // Devolver -1 si el elemento no se encuentra en el array
        return -1;
    }
     
}

