import java.util.*;
import java.util.PriorityQueue;

import javax.swing.JPopupMenu.Separator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
// Driver Code
public class Driver {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        // Listas en las que almacenaremos las ciudades 
        // Esta parte del codigo es para llenar el array
        ArrayList<String> ciudades = new ArrayList<String>();

        try {
            FileReader f = new FileReader(
                    "guategrafo.txt");
            BufferedReader r = new BufferedReader(f);

            String cadena;

            while ((cadena = r.readLine()) != null) {
                
                String[] separado = cadena.split(" ");
                
                // Agregar las dos primeras ciudades
                ciudades.add(separado[0]);
                ciudades.add(separado[1]);


            }

            r.close();
            // codigo para borrar repetidos
            Set<String> set = new HashSet<>(ciudades);
                ciudades.clear();
                ciudades.addAll(set);

        } catch (FileNotFoundException e) {
            System.out.println("No se ha podido abrir el archivo de texto");
        }

        // Grafo echo con el tamaño del arraylist
        Graph grafo = new Graph(ciudades.size());

        // Mostrar nomenclatura}
        System.out.println("nomenclatura para la matriz");
        for (String ciudad : ciudades) {
            System.out.println(ciudad + " " + ciudades.indexOf(ciudad));
        }

        // Ahora si, a llenar la amtriz
        try {
            FileReader f = new FileReader(
                    "guategrafo.txt");
            BufferedReader r = new BufferedReader(f);

            String cadena;

            while ((cadena = r.readLine()) != null) {

                String[] datos = cadena.split(" ");
                String ciudad = datos[0];
                String destino = datos [1];

                int c = ciudades.indexOf(ciudad);
                int d = ciudades.indexOf(destino);

                int costo = Integer.valueOf(datos[2]);

                // Sumar 1 la cantidad de veces indicada por el costo de llegada
                for (int i = 0; i < costo; i++) {
                    grafo.add(c, d);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("No se ha podido abrir el archivo de texto");
        }

        grafo.showMatrix();

        // Menu
        int ciclo = 0;
        while(ciclo == 0){
            int opcion = 0;
            System.out.println("Menu de opciones");
            System.out.println("1. Ruta mas corta de una ciudad a otra");
            System.out.println("2. Centro del grafo");
            System.out.println("3. Modificar la distancia de una ciudad a otra");
            System.out.println("4. Salir");

            opcion = scan.nextInt();

            if(opcion == 1){
                System.out.println("Ciudad a la que desea llegar");
            }

        }
    }
}