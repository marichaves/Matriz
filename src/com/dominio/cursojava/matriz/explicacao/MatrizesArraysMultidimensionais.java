package com.dominio.cursojava.matriz.explicacao;

public class MatrizesArraysMultidimensionais {

	public static void main(String[] args) {

		double[][] notasAlunos = new double[3][4]; // Linhas x colunas

		// primeiro aluno
		notasAlunos[0][0] = 10; // primeira nota do primeiro aluno
		notasAlunos[0][1] = 8;
		notasAlunos[0][2] = 8;
		notasAlunos[0][3] = 10;

		// Segundo aluno
		notasAlunos[1][0] = 8; // primeira nota do segundo aluno
		notasAlunos[1][1] = 7;
		notasAlunos[1][2] = 5;
		notasAlunos[1][3] = 10;

		// Terceiro aluno
		notasAlunos[2][0] = 3.6; // primeira nota do segundo aluno
		notasAlunos[2][1] = 5;
		notasAlunos[2][2] = 3.6;
		notasAlunos[2][3] = 9.9;

//		for (int i = 0; i < notasAlunos.length; i++) {
//			// System.out.println(notasAlunos[i]);
//			for (int j = 0; j < notasAlunos[i].length; j++) {
//				System.out.print(notasAlunos[i][j] + " - ");
//			}
//			System.out.println();
//		}
//		notasAlunos[0][3] = 6.6; // alterei uma nota
//		System.out.println();
//		for (int i = 0; i < notasAlunos.length; i++) {
//			// System.out.println(notasAlunos[i]);
//			for (int j = 0; j < notasAlunos[i].length; j++) {
//				System.out.println(notasAlunos[i][j] + "");
//			}
//			System.out.println();
//		}
		// Media:

		System.out.println("Calculando a média de cada aluno: ");
		double soma;
		for (int i = 0; i < notasAlunos.length; i++) {
			soma = 0;
			for (int j = 0; j < notasAlunos[i].length; j++) {
				soma += notasAlunos[i][j];
			}
			System.out.println("MÉdia do aluno " + (i +1) + " é = " + (soma/4));
		}

	}

}
