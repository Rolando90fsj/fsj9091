package cl.fsj.infoclub;

public class Producto {


//	VARIABLES
// ************************
	
	String articulo;
	String precio;
	String descripcion;
	String codigo;
	String talla;
	String marca;
	String color;
	
	
	
	public Producto() {
		super();
	}

	public Producto(String articulo, String precio, String descripcion, String codigo, String talla, String marca,
			String color) {
		super();
		this.articulo = articulo;
		this.precio = precio;
		this.descripcion = descripcion;
		this.codigo = codigo;
		this.talla = talla;
		this.marca = marca;
		this.color = color;
	}

//  GETTERS	
//	**************************

	public String getArticulo() {
		return articulo;
	}
	
	public String getPrecio() {
		return precio;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getTalla() {
		return talla;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String getColor() {
		return color;
	}
	
//  SETTERS	
//	**************************

	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}
	
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public void setTalla(String talla) {
		this.talla = talla;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

//	ToString
//	**********************************
	
	@Override
	public String toString() {
		return "Datos del Producto [articulo=" + articulo + ", precio=" + precio + ", descripcion=" + descripcion + ", codigo="
				+ codigo + ", talla=" + talla + ", marca=" + marca + ", color=" + color + "]";
	}
	

	
}
