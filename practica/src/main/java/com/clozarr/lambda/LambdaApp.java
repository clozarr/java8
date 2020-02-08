package com.clozarr.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Ejemplo de función Lambda
 *
 */
public class LambdaApp {

	public void ordenarSinLambda() {

		List<String> lista = new ArrayList<>();
		lista.add("Carlos");
		lista.add("Andres");
		lista.add("Lozano");
		lista.add("Martinez");

		Collections.sort(lista, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		});

		for (String elemento : lista) {
			System.out.println("-> " + elemento);
		}
	}

	public void ordernarConLambda() {

		List<String> lista = new ArrayList<>();
		lista.add("Cindy");
		lista.add("Paola");
		lista.add("Hernandez");
		lista.add("De la Hoz");

		Collections.sort(lista, (p1, p2) -> p1.compareTo(p2));

		for (String elemento : lista) {
			System.out.println("-> " + elemento);
		}
	}

	public void calcularPromedio() {

		Operaciones operaciones = (n1,n2)-> (n1+n2)/2;
		double promedio = operaciones.promedio(6, 8);
		System.out.println("el promedio es:  " + promedio);
		
		
	}

}
