import java.util.Locale;
import java.util.Scanner;

public class SobreMim {

    public static void main(String[] args) {
    
        Scanner scanner  = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual é o seu nome? ");
        String nome = scanner.next();

        System.out.println("Qual seu segundo nome? ");
        String sobreNome = scanner.next();

        System.out.println("Qual sua idade? ");
        int idade = scanner.nextInt();

        System.out.println("Digite seu altura: ");
        Double altura = scanner.nextDouble();
        System.out.println();

        System.out.println("Olá, me chamo " + nome + " " + sobreNome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + " Cm ");

    }
}

