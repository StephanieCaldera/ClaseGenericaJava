package elemento;

import java.util.Arrays;


public class CollectionCustomT <T> {
	public T [] elementos;
	
	public CollectionCustomT() {
		super();
		// TODO Auto-generated constructor stub
	}

	public T[] getElementos() {
		return elementos;
	}

	public void setElementos(T[] elementos) {
		this.elementos = elementos;
	}
	
	
	
	public int size() {	
		return elementos.length;	
	}
	
	public void add (T element) {
		T [] newElement = Arrays.copyOf(elementos, elementos.length + 1);
			newElement [elementos.length] = element;
			 elementos = newElement;
	}
		
	
	public void addLast(T element) {
		T [] newElement = Arrays.copyOf(elementos, elementos.length + 1);
		newElement [elementos.length] = element;
		elementos = newElement;
	}
	
	public void addFirst( T element) {
		T [] newElement = Arrays.copyOf(elementos, elementos.length + 1);
		newElement [0] = element;
		System.arraycopy(elementos, 0, newElement, 1, elementos.length);
		elementos = newElement;
	}
		

	public void removeElement (int indice) {
		if (indice >= 0 && indice <elementos.length) {
			T[]nuevoArreg = (T[]) new Object [elementos.length-1];
			for (int i = 0; i < indice; i++) {
				nuevoArreg[i] = elementos [i];
			}
				for (int i = indice + 1; i < elementos.length; i++) {
					nuevoArreg[i-1] = elementos [i];
				}			
				elementos = nuevoArreg;
			}
		
 	}
	
	
	public void removeTodo () {
		T valor = null;
		for (int i = 0; i < elementos.length; i++) {
			elementos [i] = valor;
		}
	}
		
		
	  public boolean empty  (){
		  if (elementos.length == 0) {
				System.out.println( "el arreglo está vacío");
			} else {
				System.out.println("el arreglo contiene elementos y son :");
			  }
		return elementos.length == 0;
		
	}
	  
	  
	  public void imprimir () {
		  for (T t : elementos) {
			System.out.println(t + " ");
		}
		  System.out.println();
	  }
	  
	  
	  

}


