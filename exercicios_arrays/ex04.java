/*Faça um programa em Java que leia um vetor de 10 caracteres, e diga quantas 
consoantes foram lidas. Imprima as consoantes. */

package exercicios_arrays;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] letras = new char[10];
        int contadorConsoantes = 0;

        System.out.println("Digite 10 caracteres (um por vez):");

        for (int i = 0; i < letras.length; i++) {
            letras[i] = sc.next().charAt(0); // lê o primeiro caractere digitado
        }

        System.out.println("\nConsoantes digitadas:");
        for (char c : letras) {
            // Verifica se é letra e não é vogal
            if (Character.isLetter(c) &&
                !(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                  c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')) {
                System.out.print(c + " ");
                contadorConsoantes++;
            }
        }

        System.out.println("\nQuantidade de consoantes: " + contadorConsoantes);

        sc.close();
    }
}
