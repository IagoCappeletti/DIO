import java.util.Random;

public class exercicio_07 {
    public static void main(String[] args) {
        Random random = new Random(); //gerador de números aleatorios 

        int[] numerosAleatórios = new int [20];

        for (int i = 0; i< numerosAleatórios.length; i++){
                int numeros = random.nextInt(100); //bound = limite
                numerosAleatórios[i] = numeros;
        }

        System.out.print("Números aleatorios: ");
        for (int numero : numerosAleatórios) {
            System.out.print(numero + " ");
        }

        System.out.print("\nAntecessor dos Números aleatorios: ");
        for (int numero : numerosAleatórios) {
            System.out.print((numero - 1) + " ");
        }
        
        System.out.print("\nSucessores dos Números aleatorios: ");
        for (int numero : numerosAleatórios) {
            System.out.print((numero + 1) + " ");
        }

        
    }
}
