import java.util.Locale;
import java.util.Scanner;

public class GerenciamentoDeAlunos1 {
    public static void main(String[] args) {
        String[] disciplinas = {"Matemática", "Português", "História"};
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Quantos alunos você irá cadastrar? ");
        int qtdAlunos = input.nextInt();
        input.nextLine();

        String[] alunos = new String[qtdAlunos];
        int[] matriculas = new int[qtdAlunos];
        double[][] notasAlunos = new double[qtdAlunos][disciplinas.length]; // notas armazenadas em uma matriz

        for (int i = 0; i < qtdAlunos; i++) {
            System.out.print("Aluno: ");
            alunos[i] = input.nextLine();

            System.out.print("Matrícula: ");
            matriculas[i] = input.nextInt();
            input.nextLine();

            System.out.println("Aluno cadastrado com sucesso!");

            for (int j = 0; j < disciplinas.length; j++) {
                System.out.printf("Nota em %s: ", disciplinas[j]);
                notasAlunos[i][j] = input.nextDouble();
                input.nextLine();
            }
        }

        for (int i = 0; i < qtdAlunos; i++) {
            System.out.printf("Aluno: %s (Matrícula: %d)%n", alunos[i], matriculas[i]);
            for (int j = 0; j < disciplinas.length; j++) {
                System.out.printf("%s: %.2f%n", disciplinas[j], notasAlunos[i][j]);
            }
            System.out.println();
        }
    }
}
