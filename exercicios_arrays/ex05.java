/*5. Faça um programa em Java que leia 20 números inteiros e armazene-os num vetor. 
Armazene os números pares no vetor PAR e os números IMPARES no vetor impar.
Imprima os três vetores. */

package exercicios_arrays;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[20];
        int[] pares = new int[20];
        int[] impares = new int[20];
        int qtdPares = 0, qtdImpares = 0;

        System.out.println("Digite 20 números inteiros:");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();

            if (numeros[i] % 2 == 0) {
                pares[qtdPares++] = numeros[i];
            } else {
                impares[qtdImpares++] = numeros[i];
            }
        }

        System.out.print("\nVetor original: ");
        for (int n : numeros) System.out.print(n + " ");

        System.out.print("\nVetor PAR: ");
        for (int i = 0; i < qtdPares; i++) System.out.print(pares[i] + " ");

        System.out.print("\nVetor IMPAR: ");
        for (int i = 0; i < qtdImpares; i++) System.out.print(impares[i] + " ");

        sc.close();
    }
}
