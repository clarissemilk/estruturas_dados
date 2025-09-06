/*5. Faça um programa em Java que leia 20 números inteiros e armazene-os num vetor. 
Armazene os números pares no vetor PAR e os números IMPARES no vetor impar.
Imprima os três vetores. */

package exercicios_arrays;

import java.util.Scanner;
import java.util.Arrays;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[20];
        int[] pares = new int[20];
        int[] impares = new int[20];
        int contPar = 0, contImpar = 0;

        System.out.println("Digite 20 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
            if (numeros[i] % 2 == 0) {
                pares[contPar++] = numeros[i];
            } else {
                impares[contImpar++] = numeros[i];
            }
        }

        System.out.println("Vetor original: " + Arrays.toString(numeros));
        System.out.println("Vetor PAR: " + Arrays.toString(Arrays.copyOf(pares, contPar)));
        System.out.println("Vetor IMPAR: " + Arrays.toString(Arrays.copyOf(impares, contImpar)));

        sc.close();
    }
}
