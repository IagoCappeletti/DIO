import java.util.Scanner;

public class exercico_03 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

            int soma = 0;
            int maior = 0;
            int cont = 0;
            do {
                System.out.print("Digite o número: ");
                int numero = sc.nextInt();
                soma = soma + numero;
                if (numero > maior){
                    maior = numero;
                }

                cont ++;
            } while(cont < 5);

            System.out.println();
            System.out.println("O maior número: " + maior);
            System.out.println("O soma dos números: " + soma);
            System.out.println("A média dos números: " + (soma/5));

        sc.close();
    }
}
