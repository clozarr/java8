package com.clozarr.funcionesaltoorden;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class AltoOrden {

	/*
	 * Funciones de alto orden, en el operador diamante se especifican los tipos de
	 * datos de entrada y salida de la función, de la siguiente manera:
	 * 
	 * Function<TipoDatoEntrada, TipoDatoSalida> nombreFuncion
	 * 
	 **/
	private Function<String, String> convertirMayuscula = parametro -> parametro.toUpperCase();
	private Function<String, String> convertirMinuscula = parametro -> parametro.toLowerCase();

	public void imprimir(Function<String, String> funcion, String valor) {

		String resultado = funcion.apply(valor);
		System.out.println("El resulrado es: " + resultado);

	}
    
	 /*
	  * Forma 1: Metodo que devuelve una función
	  * */
	public Function<String, String> mostrarMensaje(String mensaje) {

		return destinatario -> mensaje + " " + destinatario;
	}

	 /*
	  * Forma 2: Metodo que devuelve una función
	  * */
	public Function<String, String> mostrarMensaje2(String mensaje) {

		Function<String,String> funcionMensaje = destinatario ->  mensaje + " " + destinatario;
		return funcionMensaje;
	}
	
	/**
	 * Filtrar por longitud
	 * 
	 **/
	public void filtrarPorLongitud(List<String> lista, Consumer<String>consumidor, int longitud) {
		
		lista.stream().filter(logicaFiltroPorLongitud(longitud)).forEach(consumidor);
		
	}
	/**
	 * Filtrar por contenido
	 * 
	 **/
	public void filtrarPorContenido(List<String> lista, Consumer<String>consumidor, String contenido) {
		
		lista.stream().filter(logicaFiltroPorContenido(contenido)).forEach(consumidor);
		
	}
	
	private Predicate<String> logicaFiltroPorLongitud(int longitud){
		 
		 return texto -> texto.length() < longitud;	
	}
	private Predicate<String> logicaFiltroPorContenido(String expresion){
		 
		 return texto -> texto.contains(expresion);	
	}
	
	

	public static void main(String[] args) {

		AltoOrden appAltoOrden = new AltoOrden();
		appAltoOrden.imprimir(appAltoOrden.convertirMayuscula, "carlos");
		appAltoOrden.imprimir(appAltoOrden.convertirMinuscula, "CARLOS");

		String mensaje = appAltoOrden.mostrarMensaje("Bienvenido").apply("Carlos");
		System.out.println("Este es el mensaje: " + mensaje);
		
		System.out.println("=================================================================");
		List<String> lista = new ArrayList<String>();
		lista.add("Carlos");
		lista.add("Andres - BBBB");
		lista.add("Lozano");
		lista.add("Arroyo - AAAA");
		
		appAltoOrden.filtrarPorLongitud(lista, System.out::println, 7);
		appAltoOrden.filtrarPorContenido(lista, System.out::println, "A");

	}

}
