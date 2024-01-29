
public class Refaccionaria {
//With Scanner
	/*-> Refacccionaria 
 nombre_Refaccionaria 
 ubicacion 
 tipo_refaccion 
 precio_refaccion 
 cantidad
 Precio_compra
 ganacias 

Listar 
guardar -> Refaccionaria maria -> reduncia de datos 
editar por cualquier atributo 
eliminar -> eliminar por cualquier atributo 
buscar -> por cualquier atributo 
compra -> cantidad x precion de compra 
gancias 10*/
	private String nombre_refaccionaria;
	private String ubicacion;
	private String tipo_refaccion;
	private float precio_refaccion;
	private int cantidad;
	private float precio_compra;
	private float ganancias;
	public Refaccionaria() {
		super();
	}
	
	public Refaccionaria(String nombre_refaccionaria, String ubicacion, String tipo_refaccion, float precio_refaccion,
			int cantidad, float precio_compra, float ganancias) {
		super();
		this.nombre_refaccionaria = nombre_refaccionaria;
		this.ubicacion = ubicacion;
		this.tipo_refaccion = tipo_refaccion;
		this.precio_refaccion = precio_refaccion;
		this.cantidad = cantidad;
		this.precio_compra = precio_compra;
		this.ganancias = ganancias;
	}
	@Override
	public String toString() {
		return "Refaccionaria [nombre_refaccionaria=" + nombre_refaccionaria + ", ubicacion=" + ubicacion
				+ ", tipo_refaccion=" + tipo_refaccion + ", precio_refaccion=" + precio_refaccion + ", cantidad="
				+ cantidad + ", precio_compra=" + precio_compra + ", ganancias=" + ganancias + "]'n";
	}
	public String getNombre_refaccionaria() {
		return nombre_refaccionaria;
	}
	public void setNombre_refaccionaria(String nombre_refaccionaria) {
		this.nombre_refaccionaria = nombre_refaccionaria;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public String getTipo_refaccion() {
		return tipo_refaccion;
	}
	public void setTipo_refaccion(String tipo_refaccion) {
		this.tipo_refaccion = tipo_refaccion;
	}
	public float getPrecio_refaccion() {
		return precio_refaccion;
	}
	public void setPrecio_refaccion(float precio_refaccion) {
		this.precio_refaccion = precio_refaccion;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public float getPrecio_compra() {
		return precio_compra;
	}
	public void setPrecio_compra(float precio_compra) {
		this.precio_compra = precio_compra;
	}
	public float getGanancias() {
		return ganancias;
	}
	public void setGanancias(float ganancias) {
		this.ganancias = ganancias;
	}
	
	
	
	
	
	
	
	
	
	
	
}
