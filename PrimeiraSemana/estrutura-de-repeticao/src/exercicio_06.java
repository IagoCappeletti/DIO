import java.util.Scanner;

public class exercicio_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.print("Digite o número do fatorial: ");
            int fatorial = sc.nextInt();
            System.out.println();

            int multiplicao = 1;

            System.out.print(fatorial + "! = ");
            for (int i = fatorial; i >= 1 ;i-- ) {
                multiplicao = multiplicao * i;

            }

            System.out.print(multiplicao);

        sc.close();
    }
}
