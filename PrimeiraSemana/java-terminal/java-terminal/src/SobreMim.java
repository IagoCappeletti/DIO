public class SobreMim {

    public static void main(String[] args) {
    
        String nome = args[0];
        String sobreNome = args[1];
        int idade = Integer.valueOf(args[3]);
        double altura = Double.valueOf(args[4]);

        System.out.println("Olá, me chamo " + nome + " " + sobreNome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + "Cm ");

    }
}

