import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

            System.out.print("Digite a nota: ");
            int nota = sc.nextInt();

            while(nota < 0 || nota > 10) {
                System.out.println("Nota inválida! Digite novamente");
                System.out.print("Digite a nota: ");
                nota = sc.nextInt();
            }
            System.out.print("A ultima nota digitada foi: " + nota);
        sc.close();
    }
}
