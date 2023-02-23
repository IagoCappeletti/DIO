import java.util.Scanner;

public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int [] vect = {-5, -6, 15, 50, 8, 4};

            System.out.print("Vetor: ");
            for (int i = 0; i < vect.length; i++) {
                System.out.print(vect[i] + " ");
            }

            System.out.print("\nVetor inverso: ");
            for (int i = (vect.length - 1); i >= 0; i--) {
                System.out.print(vect[i] + " ");
            }

        sc.close();
    }
    
}