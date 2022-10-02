package questao6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int totalAlunos = 6; int reprovados = 0; int aprovados = 0; int provaFinal = 0; float mediaClasse = 0;
        float[][] notas = new float[totalAlunos][2];
        float[] medias = new float[totalAlunos];

        for (int i = 0; i < totalAlunos; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("Nota %d do aluno %d: ", j + 1, i + 1);
                notas[i][j] = keyboard.nextFloat();
            }
        }

        for (int i = 0; i < totalAlunos; i++) {
            medias[i] = (notas[i][0] + notas[i][1]) / 2;
            mediaClasse = mediaClasse + medias[i];
            System.out.printf("Media do aluno %d: %.2f\n", i + 1, medias[i]);

            if (medias[i] < 3) {
                reprovados++;
            } else if (medias[i] >= 7) {
                aprovados++;
            } else {
                provaFinal++;
            }
        }

        mediaClasse = mediaClasse / totalAlunos;
        System.out.printf("Aprovados: %d", aprovados);
        System.out.printf("Em exame: %d", provaFinal);
        System.out.printf("Reprovados: %d", reprovados);
        System.out.printf("Media da classe: %f", mediaClasse);
    }
}
