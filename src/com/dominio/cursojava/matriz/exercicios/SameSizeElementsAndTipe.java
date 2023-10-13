package com.dominio.cursojava.matriz.exercicios;

import java.util.Scanner;

public class SameSizeElementsAndTipe {

	public static void main(String[] args) {
		//Criar um vetor com 5 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho e com os mesmos elemntos que do vetor A
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		
		for(int i= 0; i < vetorA.length ; i++) {
			System.out.println("Entre com o valor da posição " + (i +1) + ":");
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i];
			
		}
		System.out.println();
		for(int i= 0; i < vetorA.length ; i++) {
			System.out.println("Vetor A || Vetor B");
			System.out.println(vetorA[i] + "       ||      "  + vetorB[i]);
			
			
		}
	}

}
