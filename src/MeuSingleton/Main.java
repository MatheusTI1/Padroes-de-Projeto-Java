package MeuSingleton;

public class Main {
    public static void main(String[] args) {
        Sabesp sabesp = Sabesp.getInstance();

        int fornecido = 30000;
        sabesp.abastecimentoAgua(fornecido);

        System.out.println("Sabesp forneceu " + fornecido + " litros de água");

        System.out.println("Estoque restante (Sabesp): " + sabesp.getabastecimentoAgua() + " litros");
    }
}
