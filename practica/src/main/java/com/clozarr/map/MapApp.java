package com.clozarr.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapApp {

	private Map<Integer,String> mapa1; 
	private Map<Integer,String> mapa2; 
	
	public void llenarMapas() {
	
		  mapa1 = new HashMap<Integer, String>();
		  mapa1.put(1,"Carlos");
		  mapa1.put(2,"Andres");
		  mapa1.put(3,"Lozano");
		  
		  mapa2 = new HashMap<Integer, String>();
		  mapa2.put(1,"Cindy");
		  mapa2.put(2,"Paola");
		  mapa2.put(3,"Hernandez");
		
		
	}
	
	public void imprimirMapaSinlambda() {
		
		for(Entry<Integer,String> e : mapa1.entrySet()) {
			
			System.out.println("Llave: " + e.getKey() + ", Valor: " + e.getValue());
		}
		
	}
	
	public void imprimiMapaConLambda() {
		
		mapa1.forEach((key,value) -> System.out.println("Llave: " + key + ", Valor: " + value));
		//Otra forma
		System.out.println("Otra forma");
		mapa2.entrySet().stream().forEach(System.out::println);
	}
	
	
	public void insertarSiAusente() {
		
		//Inserta en el map, porque no existe la llave 4
		mapa1.putIfAbsent(4,"Arroyo");
		
		/*No inserta en el mapa porque la llave 2, si existe 
		    (No sobreescribe a diferencia del 'put')*/
		mapa1.putIfAbsent(2, "salcedo");
		
		
	}
	
	public void operarSiPresente() {
		
		/*
		 * Permite ejecutar una operación si la llave está presente (y su value no es nulo)
		 * En este ejemplo se hizo una concatenación
		 * */
		mapa2.computeIfPresent(3, (key, value) -> key + " === " + value);
	}
	
	/**
	 * Se puede configurar un valor por defecto para el Mapa, 
	 * si no existe una llave con su respectivo valor
	 * @author carlos
	 */
	public void obtenerOrPredetermidado() {
		
		//Obtenemos una llave inexistente
		String valor = mapa1.getOrDefault(5, "Este es un valor por defecto");
		System.out.println("Este es el valor del mapa 1: " + valor);
		
		//Obtenemos una llave existente
		valor = mapa2.getOrDefault(2, "Este es otro valor por defecto");
		System.out.println("Este es el valor del mapa 2: " + valor);
		
	}
	
	public void recolectar() {
		
		Map<Integer,String> mapaRecolectado = mapa2.entrySet().stream()
				 .filter(elemento -> elemento.getValue().startsWith("C"))
				 .collect(Collectors.toMap(element -> element.getKey(), element -> element.getValue()));
	
		mapaRecolectado.forEach((key, value) -> System.out.println("Llave: " + key + ", Valor: " + value));
		
	}
	
	
	public static void main(String[] args) {
		MapApp mapApp = new MapApp();
		mapApp.llenarMapas();
		mapApp.insertarSiAusente();
		mapApp.operarSiPresente();
		System.out.println("*** Imprimir sin lambda ***");
		mapApp.imprimirMapaSinlambda();
		System.out.println("*** Imprimir con lambda ***");
		mapApp.imprimiMapaConLambda();
		System.out.println("*** Obtener Por Defecto ***");
		mapApp.obtenerOrPredetermidado();
		System.out.println("*** Recolectar ***");
		mapApp.recolectar();
		
		
	}
	
}
