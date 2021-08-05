package Reto2;

public class productos_tienda_online {
	
	int codigo;
	String nombre_producto ;
	int precio ;
	int cantidad_existentes ;
	
@Override
	    public String toString() {
	        return "productos_tienda_online{" + "codigo=" + codigo + ", nombre_producto=" + nombre_producto + ", precio=" + precio + ", cantidad_existentes=" + cantidad_existentes + '}';
	    }

public productos_tienda_online (int codigo, int precio, String nombre_producto, int cantidad_existentes) {
	
	
	this.codigo=codigo;
	this.nombre_producto=nombre_producto;
	this.precio= precio;
	this.cantidad_existentes= cantidad_existentes;
}
	
public int getcodigo() {
    return codigo;
}

public void setcodigo(int codigo) {
    this.codigo = codigo;
}	

public String getnombre_producto() {
	return nombre_producto;
}
public void setnombre_producto( String nombre_producto) {
    this.nombre_producto = nombre_producto;
}	
public int getprecio() {
    return precio;
}

public void setprecio(int precio) {
    this.precio = precio;
}

public int getcantidad_existentes() {
    return cantidad_existentes;
}

public void setcantidad_existentes(int cantidad_existentes) {
    this.cantidad_existentes = cantidad_existentes;
}


}
