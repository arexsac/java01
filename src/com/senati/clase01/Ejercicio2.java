package com.senati.clase01;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio 2 Realizar un ejercicio que intercambie el valor de dos variables,
		 * es decir crearemos e inicializaremos la variable x igual 5 y la variable y a
		 * 2. Cuando finalice el programa y deber� contener 5 y x contendr� 2.
		 */
		int x = 5;
		int y = 2;
		int aux = 0;
		//proceso
		aux = x;
		x = y;
		y = aux;
		//salida
		System.out.println(x);
		System.out.println(y);


	}

}
