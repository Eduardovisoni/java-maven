package com.proyectomaven;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		helloworld();
		arrayst1();
		arrayst2();
		arraytypes();
		arrayway();	
		
		arraysdif obj = new arraysdif();
		obj.firstarray();
		obj.firstarraylist();
		obj.secondarray();
		obj.secondarraylist();
		obj.thirdarray();
		obj.thirdarraylist();
		}
	
	//--> Metodo de "Hola mundo" y operacion matematica <---------------
	public static void helloworld() {
		int a = 2;
		int b = 3;
		int res = a * b;
		System.out.println("¡Hola mundo desde Java!");
		System.out.println("Resultado de la multiplicacion: " + res);
	}
	
	//--> Arreglo inicializado con valores directamente <---------------
	public static void arrayst1() {
		int[] numbers = {67, 76, 45, 34, 98};
		
		System.out.println("\nManera numero 1: " + numbers[0]);
	}
	
	//--> Arreglo con tamaño fijo y llenado por indice manualmente <----
	public static void arrayst2() {
		int[] numbers = new int [6];
		
		numbers[0] = 25;
		numbers[1] = 45;
		numbers[2] = 34;
		numbers[3] = 5;
		numbers[4] = 4;
		numbers[5] = 46;
		
		System.out.println("Manera numero 2: " + numbers[5]);
	}
	
	//--> Metodos para usar java.util.Arrays <--------------------------

	public static void arraytypes() {
		
		int[] a = {10,20,30,40,50};
		int[] b = {5,2,4,3,1};
		int[] c = {1,2,3,4,5};
		
		// METODO 1: Imprime directamente el arreglo, sin usar un FOR.
		System.out.println("\nMetodo 1: " + Arrays.toString(a)); //<---- USO DE LA LIBRERIA
		
		// METODO 2: Imprime el arreglo completo, de menor a mayor.
		Arrays.sort(b); //<---- USO DE LA LIBRERIA
		System.out.println("Metodo 2: " + Arrays.toString(b));
		
		// METODO 3: Se comparar 2 arreglos.
		System.out.println("Los arreglos mencionados son iguales?: " + Arrays.equals(b,c)); // <-- USO DE LA LIBRERIA
		
		// METODO 4: Se busca la posicion de un numero dentro de un arreglo en orden
		int position = Arrays.binarySearch(c, 4); //<---- USO DE LA LIBRERIA
		System.out.println("La posicion del numero 4 es: " + position);
		
		// METODO 5: Procesa arreglos de manera funcional sin tantos enredos
		int suma = Arrays.stream(a).sum(); //<---- USO DE LA LIBRERIA
		System.out.println("La suma de los numeros es: "+suma+"\n");
	}
	
	//--> Metodos para recorrer arreglos <------------------------------
	public static void arrayway() {
		int[] num = {5, 10, 15, 20, 25, 30};
		
		// Usar FOR TRADICIONAL:
		for(int i = 0; i < num.length; i++) {
			System.out.println("FOR TRADICIONAL: "+num[i]);
		}
		
		// Usar FOR-EACH:
		for (int n : num) {
			System.out.println("FOR-EACH: "+n);
			
		}
		
		// Usar STREAM + FOR-EACH
		Arrays.stream(num)
		.forEach(n -> System.out.println("STREAM: "+n));
		
	}
}
