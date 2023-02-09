public class Main {
    public static void main(String[] args) {

        String primeiroNome = "Iago";
        String segundoNome = "Cappeletti";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método = " + primeiroNome + segundoNome;
    }
}