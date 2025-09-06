package exercicios_arrays;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] notas = new double[10][4];  // 10 alunos x 4 notas
        double[] medias = new double[10];
        int aprovados = 0;

        System.out.println("Digite as 4 notas de cada aluno:");

        for (int i = 0; i < 10; i++) {
            double soma = 0;
            for (int j = 0; j < 4; j++) {
                System.out.print("Aluno " + (i+1) + ", nota " + (j+1) + ": ");
                notas[i][j] = sc.nextDouble();
                soma += notas[i][j];
            }
            medias[i] = soma / 4.0;
            if (medias[i] >= 7.0) {
                aprovados++;
            }
        }

        System.out.println("\nMédias dos alunos:");
        for (int i = 0; i < medias.length; i++) {
            System.out.println("Aluno " + (i+1) + ": " + medias[i]);
        }

        System.out.println("\nQuantidade de alunos com média >= 7.0: " + aprovados);

        sc.close();
    }
}
