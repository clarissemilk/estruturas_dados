/*  Faça um programa em Java que leia 4 notas,
 mostre as notas e a média na tela */
package exercicios_arrays;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[4];
        double soma = 0;

        System.out.println("Digite 4 notas:");
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }

        System.out.println("\nNotas digitadas:");
        for (double n : notas) {
            System.out.println(n);
        }

        // Calculando e mostrando a média
        double media = soma / notas.length;
        System.out.println("\nMédia = " + media);

        sc.close();
    }
}
