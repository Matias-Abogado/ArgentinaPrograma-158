package Tareas;

public class EjercicioClase01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numeroInicio = 5;
		int numeroFin = 14;
		// Se deberían mostrar los números:
		//5,6,7,8,9,10,11,12,13,14
		
		System.out.println("Inicia el item A del ejecicio 1");
		while(numeroInicio <= numeroFin) {
			
			System.out.println(numeroInicio);
			numeroInicio++; //numeroInicio + numeroInicio + 1;
		}
		
		
		System.out.println("Inicia el item B del ejecicio 1");
		 numeroInicio = 5;
		 numeroFin = 14;
		
		while(numeroInicio <= numeroFin) {
			
			if(numeroInicio % 2 ==0) {
				System.out.println(numeroInicio);
			}
			numeroInicio++;
		}
		
		System.out.println("Inicia el item B del ejecicio 1");
		
		numeroInicio = 5;
		boolean esPar = false;//true -> se impriman los pares ; false los impares
		while(numeroInicio <= numeroFin) {
			
			if(numeroInicio % 2 == 0 && esPar) {
				System.out.println(numeroInicio);
			}
			
			if(numeroInicio %2 != 0 && !esPar) {
				System.out.println(numeroInicio);
			}
			
			numeroInicio++;
			}
		
		System.out.println("Inicia el ejecicio 2");
		
		float ingresosMensuales = 100000;
		int cantidadVehiculosMenorA5Anos = 3;
		int cantidadInmuebles = 1;
		int cantidadVehiculosLujo = 0; // Incluye embarcacion, aeronave o titular de activos
		
		if(
				ingresosMensuales >= 489083 ||
				cantidadVehiculosMenorA5Anos >= 3 ||
				cantidadInmuebles >=3 ||
				cantidadVehiculosLujo >0
				) {
			System.out.print("El hogar pertenece al segmento de ingresos altos");
		}else {
			System.out.print("El hogar NO pertenece al segmento de ingresos altos");
		}
			
		}
 
		}

		
		


