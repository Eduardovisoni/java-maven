package com.proyectomaven;
import java.util.*;

public class arraysdif {
	
	public static void diferencias(String[] args) {
		
	}
	
	//Diferencias entre Arrays y ArrayList
	
	 public static void firstarray() {
		 
		 //TAMAÑO FIJO - Aqui se tiene un tamaño fijo, no puede crescer ni reducirse.
		 int[] numbers = new int[2];
		 numbers[0] = 1;
		 numbers[1] = 4;
		 System.out.println("\nEjemplo tamaño fijo: "+numbers[1]);
	 }
	 
	 public static void firstarraylist() {
		 
		 //TAMAÑO DINAMICO - Cresce automaticamente al agregar un lista.add.
		 ArrayList<Integer> lista = new ArrayList<>();
		 lista.add(10);
		 lista.add(20);
		 lista.add(30); //<-- Si agrego otro, automaticamente se suma y muestra en lista.size.
		 
		 System.out.println("Elemento en índice 1: " + lista.get(2));
		 System.out.println("Size de ArrayList: " + lista.size());
	 }
	 
	 public static void secondarray() {
		 
		 int[] numbers = new int[4];
		 numbers[0] = 9;
		 numbers[1] = 4;
		 numbers[2] = 6;
		 numbers[3] = 4;
		 
		 //No tiene metodos mas que el tamaño, y acceder por el indice.
		 System.out.println("\nEjemplo tamaño fijo: "+numbers.length);
		 System.out.println(""+numbers[2]);
	 }
	 
	 public static void secondarraylist() {
		 ArrayList<Integer> list = new ArrayList<>();
		 list.add(10);
		 list.add(20);
		 list.add(30);
		 
		 //Tiene muchos metodos utilez, add, remove, size, get y es mas flexible.
		 System.out.println("Elementos: " + list.get(2));
		 System.out.println("Tamaño: " + list.size());
		 System.out.println(list.add(10));
	 }
	 
	 //Tipos primitivos vs clases envolventes
	 public static void thirdarray() {
		 System.out.println("\nEl array guarda tipos primitivos directamente");
		 System.out.println("EJEMPLO: int[] numeros = {1,2,3..} - Esto SI SIRVE en arrays");
	 }
	 
	 //Tipos primitivos vs clases envolventes
	 public static void thirdarraylist() {
		 System.out.println("\nEn cambio, el ArrayList NO PERMITE primitivos");
		 System.out.println("Deberia ser tipo: ArrayList<Integer> lista = ... ");
		 System.out.println("Y no admite: ArrayList<int> lista = .. dara error");
	 }
	 
	 // -- ¿Como son en rendimiento? --
	 //ARRAY: Mas rapido - Mas eficiente en memoria - Es bueno para datos fijos
	 //ARRAYLIST: Es un poco mas lento - Consume mas memoria - Es mas comodo
	 
	 // -- ¿Cuando usarlos? --
	 //ARRAY: Cuando el tamaño no cambie y se necesita el maximo rendimiento.
	 //ARRAYLIST: Cuando el tamaño puede variar, y se quiere codigo mas flexible.
	 
	 //Basicamente un Array es un poco mas rapido, pero un ArrayList es mas flexible
	 
	 
}
