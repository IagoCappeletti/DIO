import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.print("Digite o número da tabuada: ");
            int tabuada = sc.nextInt();

            for (int i = 1; i <= 10; i++){
                System.out.println(i + " X " + tabuada + " = " + (i*tabuada));
            }

        sc.close();
    }
}
