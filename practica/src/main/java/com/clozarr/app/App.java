package com.clozarr.app;

import com.clozarr.lambda.LambdaApp;
import com.clozarr.lambda.Scopes;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LambdaApp lambdaApp = new LambdaApp();
		lambdaApp.ordenarSinLambda();
		System.out.println("=============================");
		lambdaApp.ordernarConLambda();
		System.out.println("== Calculando el promedio ==");
		lambdaApp.calcularPromedio();
		System.out.println("====Scopes=======");
		Scopes scopesApp = new Scopes();
		double resultado = scopesApp.probarVariableLocal();
		System.out.println("(Variable Local) El resultado es: " + resultado);
		resultado = scopesApp.probarStaticVariables();
		System.out.println("(Variable static) El resultado es: " + resultado);

	}

}
