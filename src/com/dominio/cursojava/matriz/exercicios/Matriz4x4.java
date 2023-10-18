package com.dominio.cursojava.matriz.exercicios;

import java.util.Random;

public class Matriz4x4 {

    public static void main(String[] args) {
        // Gere e imprima uma matriz 4x4 com valores aleatórios entre 0-9. Após isso, determine o maior número da matriz e sua posição (linha, coluna)
        int[][] numerosAleatorios = new int[4][4];
        Random numeroRandom = new Random();

        // Fill the matrix with random values between 0-9
        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) { // Changed 'i' to 'j' here
                numerosAleatorios[i][j] = numeroRandom.nextInt(10); // Generate random values between 0-9
            }
        }

        int maior = Integer.MIN_VALUE;
        int linha = 0;
        int coluna = 0;

        // Find the largest value and its position in the matrix
        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) { // Changed 'i' to 'j' here
                if (numerosAleatorios[i][j] > maior) {
                    maior = numerosAleatorios[i][j];
                    linha = i;
                    coluna = j;
                }  
            }
        }

        // Print the matrix
        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                System.out.print(numerosAleatorios[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Maior valor = " + maior);
        System.out.println("Linha = " + linha);
        System.out.println("Coluna = " + coluna);
    }
}

