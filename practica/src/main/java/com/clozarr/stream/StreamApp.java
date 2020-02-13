package com.clozarr.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamApp {

	private List<String> nombres;
	private List<String> numeros;
	
	
	public StreamApp() {
		super();
		
		nombres = new ArrayList<>();
		nombres.add("Carlos");
		nombres.add("Andres");
		nombres.add("Lozano");
		nombres.add("Arroyo");
		
		
		
		numeros = new ArrayList<>();
		numeros.add("1");
		numeros.add("2");
		numeros.add("3");
		numeros.add("4");
		numeros.add("5");
		numeros.add("6");
		
	}
	
	public void filtrar() {
		
		//Filtrar todos los elementos de la lista que empiecen por 'A'
		nombres.stream().filter(elemento -> elemento.startsWith("A")).forEach(System.out::println);;
		 
	}
	
	public void ordenar() {
	
		//Ordenar la lista de manera Ascendente
		nombres.stream().sorted().forEach(System.out::println);
		System.out.println("=================================");
		//Ordenar la lista de manera Descendente
		nombres.stream().sorted((elemento1,elemento2) -> elemento2.compareTo(elemento1)).forEach(System.out::println);
		
	}
	
	public void transformar() {
		
		//Imprimir todos los nombres de la lista, en mayúscula
		nombres.stream().map(String::toUpperCase).forEach(System.out::println);
		
		System.out.println("==================================================");
		
		// Transformar en entero todos los elementos de la lista de números y sumarle 1, imprimir el resultado.
		numeros.stream().map(elemento -> Integer.parseInt(elemento) + 1).forEach(System.out::println);
		
		
		
	}
	
	public void limitar() {
		
		//Limitar la cantidad de elementos a mostrar
		 nombres.stream().limit(2).forEach(System.out::println);
	}
	
	public void contar() {
		
		long total = numeros.stream().count();
		System.out.println("Total: " + total);
	}
	
	public static void main(String...args) {
		
		StreamApp streamApp = new StreamApp();
		System.out.println("...:::Filtrar:::...");
		streamApp.filtrar();
		System.out.println("...:::Ordenar:::...");
		streamApp.ordenar();
		System.out.println("...:::Transformar:::...");
		streamApp.transformar();
		System.out.println("...:::Limitar:::...");
		streamApp.limitar();
		System.out.println("...:::Contar:::...");
		streamApp.contar();
		
		
	}
}
