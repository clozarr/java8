package com.clozarr.defaultmethod;

public interface IDefaultMethod {

	default public void sayHello() {
		System.out.println("Hola a todos");
	}
	
}
