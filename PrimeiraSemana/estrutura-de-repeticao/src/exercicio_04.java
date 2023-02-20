import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int cont = 0;
            int numeros;
            int contPar = 0, contImpar = 0;
           
                System.out.print("Quantos números quer digitar? ");
                int quantidadeNumeros = sc. nextInt();
            do {
                System.out.print("Digite o numero: ");
                numeros = sc.nextInt();
                cont++;
                if (numeros % 2 == 0) {
                    contPar++;
                } else {
                    contImpar++;
                }
            } while(cont < quantidadeNumeros);

            System.out.println();
            System.out.println("Quantidade de pares = "  + contPar);
            System.out.println("Quantidade de impares = "  + contImpar);
        sc.close();
    }
}
