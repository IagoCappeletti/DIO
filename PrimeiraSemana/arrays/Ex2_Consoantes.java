/*
    Fazer um Programa que irá ler um vetor de 6 caracteres,
    e mostrar quantas consoantes forem lidas.
    imprimir as consoantes.
 */

import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            String[] consoantes = new String[6];
            int quantidadeConsoantes = 0;

            for (int i = 0; i < consoantes.length; i++ ){
                System.out.print("Digite uma letra: ");
                String letra = sc.next();

                if ( !(letra.equalsIgnoreCase("a") |
                        letra.equalsIgnoreCase("e") |
                        letra.equalsIgnoreCase("i") |
                        letra.equalsIgnoreCase("o") |
                        letra.equalsIgnoreCase("u") )) {
                        //atribua a letra ao elemento do vetor na posição indicada pelo contador, caso seja consoante.
                        consoantes[i] = letra;
                        quantidadeConsoantes++;
                        }
            }

            System.out.print("Consoantes: ");
            for (String consoante : consoantes) { //para cada consoante dentro do array consoantes
                if (consoante != null){ //se o valor da consoante for diferente de null
                    System.out.print(consoante + " "); //imprima a consoante
                }
            }

            System.out.println("\nQuantidade de consoantes: " + quantidadeConsoantes);
        sc.close();
    }
}
