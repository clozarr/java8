package com.clozarr.lambda;

public class Scopes {

	private static double staticNumber;
	private double number;
	
	
	public double probarVariableLocal() {
		
		/* Para poder usar una variable local, dentro de una clase anónima es necesario
		 *  que tenga modificador 'final'
		 */
	    final double n3 = 3;
		
		Operaciones operaciones = (n1,n2)->{
			
	       /* n3 = 5;  
	        * {No se puede alterar el valor de la variable,porque tiene un contexto final}
	        */
			return n1+n2+n3;
		};
		
		return operaciones.promedio(5,6);
	}
	
	
	public double probarStaticVariables() {
		
		Operaciones operaciones = (n1,n2) -> {
			staticNumber = n1 + n2;
			number = staticNumber;
			return number;
			
		};
		
		return operaciones.promedio(10,12);
	}
	
}
