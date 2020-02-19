package com.clozarr.apidate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class ApiDate {

	public static final int JAVA_V7 = 7;
	public static final int JAVA_V8 = 8;

	public void verificar(int version) {

		switch (version) {

		case JAVA_V7:
			Calendar fecha1 = Calendar.getInstance();
			Calendar fecha2 = Calendar.getInstance();
			fecha1.set(1987, 5, 23);
			System.out.println("After (v7): " + fecha1.after(fecha2));

			break;

		case JAVA_V8:
			LocalDate fechaI = LocalDate.of(1988, 05, 23);
			LocalDate fechaF = LocalDate.now();

			System.out.println("Fecha I: " + fechaI + ", Fecha F: " + fechaF);
			System.out.println("After Date (v8): " + fechaI.isAfter(fechaF));
			System.out.println("Before Date (v8): " + fechaI.isBefore(fechaF));

			LocalTime timeI = LocalTime.of(22, 30, 01);
			LocalTime timeF = LocalTime.now();

			System.out.println("Time I: " + timeI + ", Time F: " + timeF);
			System.out.println("After Time (v8): " + timeI.isAfter(timeF));
			System.out.println("Before Time (v8): " + timeI.isBefore(timeF));

			LocalDateTime dateTimeI = LocalDateTime.of(1988, 05, 23, 22, 30, 02);
			LocalDateTime dateTimeF = LocalDateTime.now();

			System.out.println("DateTime I: " + dateTimeI + ", DateTime F: " + dateTimeF);
			System.out.println("After DateTime (v8): " + dateTimeI.isAfter(dateTimeF));
			System.out.println("Before DateTime (v8): " + dateTimeI.isBefore(dateTimeF));

			break;

		default:
			System.out.println("No ha sido implementado");
			break;
		}

	}

	public void medirTiempo(int version) throws InterruptedException {

		switch (version) {

		case JAVA_V7:

			long tInicial = System.currentTimeMillis();
			Thread.sleep(1000);
			long tFinal = System.currentTimeMillis();

			System.out.println("Diferencia tiempo (v7): " + (tFinal - tInicial));

			break;

		case JAVA_V8:

			Instant ini = Instant.now();
			Thread.sleep(1000);
			Instant fin = Instant.now();
			System.out.println("Diferencia tiempo (v8): " + Duration.between(ini, fin).toMillis());

			break;

		default:
			break;
		}

	}

	public void periodoEntreFechas(int version) {

		switch (version) {

		case JAVA_V7:

			Calendar nacimiento = Calendar.getInstance();
			Calendar actual = Calendar.getInstance();
			nacimiento.set(1988, 05, 23);
			actual.set(2020, 02, 18);

			int anios = 0;
			while (nacimiento.before(actual)) {

				nacimiento.add(Calendar.YEAR, 1);
				if (nacimiento.before(actual)) {
                   anios++;
				}
			}
            
			System.out.println("Años transcurridos: " +  anios);
			
			break;
		case JAVA_V8:
			
			LocalDate inicial = LocalDate.of(1985, 03, 30);
			LocalDate fin = LocalDate.now();
			
			Period periodo = Period.between(inicial, fin);
			System.out.println("Han transcurrido " + periodo.getYears() + " años, " 
			                                       + periodo.getMonths() + " meses, " 
					                               + periodo.getDays() + " dias");
			

			break;

		default:
			break;
		}

	}

	
	public void convertir(int version) throws ParseException {
		
		switch (version) {
		
		case JAVA_V7:
			 
			String fecha = "01/01/1991";
			DateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
			Date fechaConvertida = formateador.parse(fecha);
			System.out.println("Fecha Convertida: " + fechaConvertida);
			
			Date fechaActual = Calendar.getInstance().getTime();
			formateador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a");
			String fechaCadena = formateador.format(fechaActual);
			System.out.println("Fecha Cadena: " + fechaCadena);
			
			break;
		case JAVA_V8:
			
			String fechaConvertir = "03/03/1999";
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate nuevaFecha = LocalDate.parse(fechaConvertir, formatter);
			
			System.out.println("Nueva Fecha: " + nuevaFecha.format(formatter));
			
			 
			
			break;

		default:
			break;
		}
		
		
	}
	public static void main(String[] args) {
		ApiDate apiDate = new ApiDate();
		// apiDate.verificar(8);
		//apiDate.periodoEntreFechas(8);
		
		try {
			apiDate.convertir(8);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*try {

			apiDate.medirTiempo(8);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} */
	}

}
