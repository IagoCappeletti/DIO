import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        while(true) {

            System.out.print("Digite um nome: ");    
            String nome = sc.next();
            if (nome.equals("0")) break;
            System.out.print("Idade: ");  
            int idade = sc.nextInt();

            System.out.println();
            System.out.println("Nome digitado foi: " + nome);
            System.out.println("Idade digitado foi: " + idade);
        }
            



        sc.close();
    }
}