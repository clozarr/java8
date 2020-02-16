package com.clozarr.parallelstream;

import java.util.ArrayList;
import java.util.List;



public class ParallelStream {

   private List<Integer> numeros;
	
	private void llenar() {
		
		numeros = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			
			numeros.add(i);
		}
	}
	
	private void probarStream() {
		
		numeros.stream().forEach(System.out::println);
	}
	
	private void probarParalelo() {
		/* Como el procesamiento es en paralelo, los números se imprimen de forma aleatorea
		 * Es recomentado para usar con Hilos, pero no se debe abusar porque puede afectar el 
		 * performance.
		 * 
		 * Casos de uso: Aplicaciónes batch*/
		numeros.parallelStream().forEach(System.out::println);
	}
	

	
	
	public static void main(String[] args) {
		
		ParallelStream parallelStream = new ParallelStream();
		parallelStream.llenar();
		System.out.println("******* Stream ********");
		parallelStream.probarStream();
		System.out.println("******* Parallel Stream ********");
		parallelStream.probarParalelo();
		
       
		
		
		
	}
	
}
