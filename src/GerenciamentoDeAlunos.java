import java.util.Locale;
import java.util.Scanner;

public class GerenciamentoDeAlunos {
    public static void main(String[] args) {
        String[] disciplinas = {"Matemática", "Português", "História"};
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Quantos alunos você irá cadastrar? ");
        int qtdAlunos = input.nextInt();

        for (int i = 0; i < qtdAlunos; i++) {
            System.out.print("Aluno: ");
            String alunos = input.nextLine();

            System.out.println("Mátricula: ");
            int matricula = input.nextInt();

            String[][] notasAlunos = new String[matricula][];
            System.out.println(notasAlunos);
        }



    }
}