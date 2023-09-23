package com.dominio.cursojava.matriz.explicacao;

import java.util.Scanner;

public class ArraysIrregulares {

	public static void main(String[] args) {
	int[][] arrayIrregular = new int[3][];
	arrayIrregular[0] = new int[1];
	arrayIrregular[1] = new int[2];
	arrayIrregular[2] = new int[3];
	
	//exercicio:
	Scanner scan = new Scanner(System.in);
	System.out.println("Entre com o número de pessoas que serão entrevistadas");
	int numEntrevistados = scan.nextInt();
	
	String[][] nomesFilhos = new String[numEntrevistados][];
	
	for(int i = 0; i < nomesFilhos.length; i++) {
		System.out.println("Entre com a quantidade de filhos");
		int qtdFilhos = scan.nextInt();
		
		nomesFilhos[i] = new String[qtdFilhos];
		for(int j = 0; j< nomesFilhos[i].length; j++) {
			System.out.println("Digite o nome do filho " + (j+1));
			nomesFilhos[i][j] = scan.next();
		}
	}
	
	for(int i = 0; i < nomesFilhos.length; i++) {
		System.out.println("Pessoa " + (i + 1) + " tem " + nomesFilhos[i].length	+ " filho(s)");
		for(int j = 0; j< nomesFilhos[i].length; j++) {
			System.out.println(nomesFilhos[i][j]);
		}
	}

}
}
