package com.clozarr.referenciasametodos;

import java.util.Arrays;
import java.util.Comparator;

public class RefMethodApp {

	 public static void referenciarMetodoStatic() {
		 
		 System.out.println("Referenciando médoto static");
	 }
	 
	 public void referenciarMetodoDeInstanciaObjetoArbitrario() {
		 
		 String [] nombres = {"Carlos","Andrés","Lozano"};
		 // ######  ORDENAR  forma 1: implementando clase anónima #####
		 
		 /* Arrays.sort(nombres, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return o1.compareToIgnoreCase(o2);
			}
		  
		 });*/
		 
		 // #####   ORDENAR  forma 2: implementando funcion lambda #####
		 
		 /*Arrays.sort(nombres, (s1,s2) -> s1.compareToIgnoreCase(s2));*/
		 
		 // #####   ORDENAR  forma 3: implementando referencia a metodo #####
		 Arrays.sort(nombres, String::compareToIgnoreCase);
		 System.out.println(Arrays.toString(nombres));
		 
	 }

	 public void referenciarMetodoDeInstanciaObjetoParticular() {
		 
		 System.out.println("Referenciar método de instacia objeto particular");
	 }	 
	 
     public void referenciarConstructor() {
    	
    	 //Usando Clase Anónima
    	 IPersona persona1 = new IPersona() {
			
			@Override
			public Persona crear(int id, String name) {
				// TODO Auto-generated method stub
				return new Persona(id, name);
			}
		};
		Persona p1 = persona1.crear(1,"Persona 1");
		System.out.println(p1);
		
		//Usando funcion lambda
		IPersona persona2 = (id, name) -> (new Persona(id, name));
		Persona p2 = persona2.crear(2,"Persona 2");
		System.out.println(p2);
		
		// Usando referencia a método
		IPersona persona3 = Persona::new;
		Persona p3 = persona3.crear(3,"Persona 3");
		System.out.println(p3);
		
    	 
	
		
     }
	 
	 public void operar() {
		 
		 /*Implementando la interfaz funcional con lambda*/
		 ISaludo saludo = () -> RefMethodApp.referenciarMetodoStatic();
		 saludo.saludar();
		 
		 /*Implementando la interfaz funcional usando referencia a método
		  * con el operador "::"
		  * */
		 ISaludo saludo2 = RefMethodApp::referenciarMetodoStatic;
		 saludo2.saludar();
		 
	 }
	 
	
	  public static void main(String[] args) {
		RefMethodApp refMethodApp  = new RefMethodApp();
		//refMethodApp.operar();
		//refMethodApp.referenciarMetodoDeInstanciaObjetoArbitrario();
		
		//ISaludo saludo = refMethodApp::referenciarMetodoDeInstanciaObjetoParticular;
		//saludo.saludar();
		
		refMethodApp.referenciarConstructor();
	}
	
}
