package Reto2;

import java.util.*;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		tienda_online tienda = new tienda_online();
		System.out.print("Ingrese cuantos productos va a ingresar: ");
		int cantidad=scan.nextInt();
		
		while (cantidad != 0) {
			
			
			System.out.print("Ingrese el nombre: ");
			scan.nextLine();

			System.out.print("Ingrese el nombre: ");
			scan.nextLine();
			String nombre_producto=scan.nextLine();
			System.out.print("Ingrese el Codigo: ");
			int codigo=scan.nextInt();
			System.out.print("Ingrese el Precio: ");
			int precio=scan.nextInt();
			System.out.print("Ingrese cantidad: ");
			int cantidad_existentes=scan.nextInt();
			productos_tienda_online pr = new productos_tienda_online( codigo, precio, nombre_producto,cantidad_existentes);
			tienda.insertar_producto(pr);
			cantidad --;
		}
		
		tienda.imprimirFaltantes();

	}

}
