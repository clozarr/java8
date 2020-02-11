package com.clozarr.colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Colecciones {

	private List<String> lista1;
	private List<String> lista2;

	public void llenarListas() {

		lista1 = new ArrayList<String>();
		lista2 = new ArrayList<String>();

		lista1.add("Carlos");
		lista1.add("Andres");
		lista1.add("Lozano");
		lista1.add("Arroyo");

		lista2.add("Cindy");
		lista2.add("Paola");
		lista2.add("Hernandez");
		lista2.add("De la Hoz");

	}

	public void usarForEach() {

		System.out.println("=== Forma 1: Lambda =======");
		/* Forma 1: Usando función lambda */
		lista1.forEach(elemento -> System.out.println(elemento));

		System.out.println("=== Forma 2: Referencia a método =======");
		/* Forma 2: Usando referencia a médoto */
		lista2.forEach(System.out::println);

	}

	public void usarRemoveIf() {

		/* Forma 1: usando iterator */
		System.out.println("Forma 1: Usando Iterator");

		Iterator<String> it = lista1.iterator();

		while (it.hasNext()) {
			if (it.next().equalsIgnoreCase("Carlos"))
				it.remove();

		}

		/* Forma 2: usando función lambda */
		System.out.println("Forma 2: Función lambda");
		lista2.removeIf(elemento -> elemento.equalsIgnoreCase("Cindy"));

	}
	
	
    public void usarSort() {
    	
    	/*Forma 1: usando Collections.sort*/
    	System.out.println("Forma 1: Collections.sort");
    	Collections.sort(lista1,(elemento1,elemento2) -> elemento1.compareTo(elemento2));
    	
    	
    	/*Forma 2: usando el método sort de la lista*/
    	System.out.println("Forma 2: Usando el médoto sort de la lista");
    	lista2.sort((elemento1,elemento2) -> elemento1.compareTo(elemento2));
    }   
	   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Colecciones colecciones = new Colecciones();
		colecciones.llenarListas();
		//colecciones.usarRemoveIf();
		colecciones.usarSort();
		colecciones.usarForEach();

	}

}
