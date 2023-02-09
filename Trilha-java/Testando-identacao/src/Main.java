import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            System.out.print("Qual foi a média do aluno? ");
            int media = sc.nextInt();

            if (media < 6) {
                System.out.println("Aluno REPROVADO!");
            } else if (media == 6) {
                System.out.println("prova de RECUPERAAÇÃO");
            } else {
                System.out.println("ALUNO APROVADO !!!!");
            }

        sc.close();
    }
}