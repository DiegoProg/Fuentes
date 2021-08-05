package Reto2;

import java.util.ArrayList;
import java.util.Iterator;




public class tienda_online {
	
	
	
	public tienda_online() {
		
		
		
	} 
	
	private ArrayList<productos_tienda_online> array = new ArrayList<>();
	
	  public ArrayList<productos_tienda_online> getArray() {
	        return array;
	    }

	    public void setArray(ArrayList<productos_tienda_online> array) {
	        this.array = array;
	    }
		
	    public void insertar_producto(productos_tienda_online pro) {
	    	
	    	this.array.add(pro);
	    	
	    }
	    
	    public void imprimirFaltantes () {
	    	
	    	Iterator<productos_tienda_online> iter = this.array.iterator();
	    	while (iter.hasNext()) {
	    		
	    		productos_tienda_online producto =iter.next();
	    		if (producto.getcantidad_existentes()<=3){
	    			
	    			System.out.print(producto);
	    		}
	    		
	    	}
	    	
	    	
	    }
	

}
