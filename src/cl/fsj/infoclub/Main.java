package cl.fsj.infoclub;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException,InterruptedException {

		
		
		int opcion;
		Producto producto1 = new Producto();
		ProductoServicio lista1 = new ProductoServicio();
		ArchivoServicio archivo = new ArchivoServicio();
		
		Scanner teclado = new Scanner (System.in);
//		
//		
		do {
			Menu.menu();
			opcion=teclado.nextInt();
			
			if(opcion == 1) {
				System.out.println("Datos del Producto: \n");
				lista1.listarProductos();
				System.out.println("----------------------");
				
			}else if (opcion == 2) {
				System.out.println("Beta");
				
			}else if (opcion == 3) {
				
				System.out.println("IMPORTAR DATOS");
				System.out.println("Ingresa la ruta en donde se encuentra el archivo\n" + 
						"ProductosImportados.csv:");
				Scanner dir = new Scanner (System.in);
				String path = dir.next();
				ArchivoServicio archivo1 = new ArchivoServicio();
				archivo.cargarDatos(path+"/ProductosImportados.csv",null);
				
			}else if (opcion==4) {
				System.out.println("Adios");
				break;
			}
				
		}while(opcion==1||opcion==2||opcion==3);
		teclado.close();	
		
		
		
		
	}

}
