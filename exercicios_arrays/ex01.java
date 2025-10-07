package exercicios_arrays;
/* questão 01.  Faça um programa em Java que leia 
um vetor de 5 números inteiros e mostre-os.*/
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        System.out.println("Digite 5 números inteiros:");

        for (int i=0; i < 5; i++){
            numeros[i] = sc.nextInt();
        }

        System.out.println("\nNúmeros digitados:");
        for (int n : numeros) {
            System.out.println(n);
        }

        sc.close();
    }
}
