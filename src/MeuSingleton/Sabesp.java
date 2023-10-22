package MeuSingleton;

public class Sabesp {
    private static Sabesp instacia;
    private int abastecimentoAgua;

    private Sabesp(){
        abastecimentoAgua = 40000;
    }

    public static Sabesp getInstance(){
        if(instacia == null){
            instacia = new Sabesp();
        }
        return instacia;
    }

    public void abastecimentoAgua(int amount){
        if (abastecimentoAgua >= amount){
            System.out.println("Sabesp forneceu " + abastecimentoAgua + " Litros de água");
            abastecimentoAgua -= amount;
        } else {
            System.out.println("Sabesp não pode fornecer água. Estoque esgotado");
        }
    }

    public int getabastecimentoAgua(){
        return abastecimentoAgua;
    }
}
