package cl.fsj.infoclub;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ArrayList.*;

public class ArchivoServicio {
	
	Producto producto ;
	ProductoServicio listarProductos;
	
    public ArrayList<Producto> cargarDatos(String nombreArchivo, ArrayList<Producto>lista){
    	
       ArrayList<Producto> lista1 = new ArrayList<Producto>();
        
        try {
            File archivo = new File(nombreArchivo);
            if (archivo.exists()) {
                FileReader fileReader = new FileReader(archivo);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String linea = bufferedReader.readLine(); //lectura del archivo completo
                while (linea != null) {
                    //creamos un arreglo con cada item de la fila q esta separado por ","
                  String[] arreglo = linea.split(",");
                    
                  Producto producto = new Producto(arreglo[0], arreglo[1], arreglo[2], arreglo[3], arreglo[4],
                         arreglo[5], arreglo[6]);
                  
                  	lista1.add(producto);
                	ProductoServicio productoServicio = new ProductoServicio();
                	productoServicio.(arreglo);
                	
                  	linea = bufferedReader.readLine(); //pasar a la sgte
 
                }
                
                System.out.println(lista1.toString());
                System.out.println();
                System.out.println("Datos cargados correctamente en la lista\n");
            } else {
                System.out.println("el archivo ingresado no existe");
            }
        } catch (Exception e) {
 
            e.printStackTrace();
        }
        return lista;
    }

}