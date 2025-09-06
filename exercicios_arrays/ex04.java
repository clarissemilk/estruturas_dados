/*Faça um programa em Java que leia um vetor de 10 caracteres, e diga quantas 
consoantes foram lidas. Imprima as consoantes. */

package exercicios_arrays;

import java.util.*;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] letras = new char[10];
        System.out.println("Digite 10 caracteres:");

        for (int i = 0; i < letras.length; i++) {
            letras[i] = sc.next().charAt(0);
        }

        List<Character> vogais = Arrays.asList('a','e','i','o','u','A','E','I','O','U');
        List<Character> consoantes = new ArrayList<>();

        for (char c : letras) {
            if (Character.isLetter(c) && !vogais.contains(c)) {
                consoantes.add(c);
            }
        }

        System.out.println("Consoantes: " + consoantes);
        System.out.println("Quantidade: " + consoantes.size());

        sc.close();
    }
}
