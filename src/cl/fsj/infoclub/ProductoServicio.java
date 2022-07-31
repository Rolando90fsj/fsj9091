package cl.fsj.infoclub;

import java.util.ArrayList;

public class ProductoServicio extends Producto {

	
	ArchivoServicio archivoServicio;
	Producto producto;
	
//	ArrayList contiene productos	
//	**************************** 	
	
	ArrayList <String>listaProductos = new ArrayList<String>();


	
	public ArrayList<String> getListaProductos() {
		return listaProductos;
	}
	public void setListaProductos(ArrayList<String> listaProductos) {
		this.listaProductos = listaProductos;
	}
	
// Metodos
// ********
	public void listarProductos () {
		for (int i = 0;i<listaProductos.size();i++) {
			System.out.println(getListaProductos().get(i));
		}
	}
	
	public void agregarProductos(String [] arreglo) {
		
		listaProductos.add(arreglo[0]);
		
	}
	
}
