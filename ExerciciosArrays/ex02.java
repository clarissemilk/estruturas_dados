/* Faça um programa em Java que leia um vetor de 
10 números reais e mostre-os na ordem inversa. */

package ExerciciosArrays;

import java.util.Scanner;

public class ex02 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numeros = new double[10];
        double[] invertido = new double[10];

        // leitura
        System.out.println("Digite 10 números reais:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextDouble();
        }

        // preenchendo vetor invertido
        for (int i = 0; i < numeros.length; i++) {
            invertido[i] = numeros[numeros.length - 1 - i];
        }

        // exibição
        System.out.println("\nNúmeros na ordem inversa:");
        for (double n : invertido) {
            System.out.println(n);
        }

        sc.close();
    }
}

