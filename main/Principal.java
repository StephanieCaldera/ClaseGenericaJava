package main;


import elemento.CollectionCustomT;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	//creando el arreglo
	CollectionCustomT<String> nombres1 = new CollectionCustomT<>();	
    
	nombres1.elementos= new String[0];
	
	nombres1.empty();
	nombres1.imprimir();
	
	
	//agregando elementos a la lista
	System.out.println("MOSTRAR LOS  ELEMENTOS AGREGADOS AL ARREGLO");
	nombres1.add("Maria");
	nombres1.add("Pepe");
	nombres1.add("José");
	nombres1.add("Juan");
	
	//invocando el metodo de mostrar los elementos del arreglo
	nombres1.imprimir();

	//añadir al elemento en la primera posicion

	System.out.println("MOSTRAR ELEMENTO AGREGADO AL PRINCIPIO");
	nombres1.addFirst("Sara");
	nombres1.imprimir();
	
	//agregar el ultimo elemento de la lista
	System.out.println("MOSTRAR EL ELEMENTO AGREGADO AL FINAL");
	nombres1.addLast("Pedro");
	nombres1.imprimir();
	
	//mostrar el numero total de elementos del arreglo
	System.out.println("EL NUMERO TOTAL DE ELEMENTOS EN EL ARREGLO ES:");
	int elementos = nombres1.size();
	System.out.println (elementos);
	
	System.out.println("");
	
	//REMOVER EL ELEMENTO INDICADO
	System.out.println("ELIMINAR ELEMENTO INDICADO");
	int posicionEliminar= 2;
	nombres1.removeElement(posicionEliminar);
	nombres1.imprimir();
	
    //indicar si el arreglo esta vacio
	System.out.println("INDICAR SI HAY ELEMENTOS EN EL ARREGLO");
	nombres1.empty();
	nombres1.imprimir();
	
	
	
	//REMOVER TODOS LOS ELEMENTOS
	System.out.println("MOSTRAR POSICIONES VACIAS DEL ELEMENTO");
	nombres1.removeTodo();
	nombres1.imprimir();

	
	

		
	
	
	}	

}
