package com.clozarr.optional;

import java.util.Optional;

public class OptionalApp {

	
	public void probar(String valor) {
		
		System.out.println(valor.contains("Carlos"));
	}
	
	public void orElse(String valor) {
		
		Optional<String> optional = Optional.ofNullable(valor);
		String val = optional.orElse("Valor Predeterminado");
		System.out.println(val);
		
	}
	
	public void orElseThrow(String valor) {
		Optional<String> optional = Optional.ofNullable(valor);
		optional.orElseThrow(NumberFormatException::new);
		
	}
	
	public void isPresent(String valor) {
		
		
		Optional<String> optional = Optional.ofNullable(valor);
		boolean  isPresent = optional.isPresent();
		
		System.out.println("Está presente: " + isPresent);
	}
	
	public static void main(String...args) {
		
		OptionalApp optionalApp = new OptionalApp();
		System.out.println("****** OR ELSE ******");
		optionalApp.orElse(null);
		System.out.println("****** IS PRESENT ******");
		optionalApp.isPresent("Carlos");
		System.out.println("****** OR ELSE THROW ******");
		optionalApp.orElseThrow(null);
		
	}
}
