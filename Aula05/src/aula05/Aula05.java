package aula05;

public class Aula05 {

    public static void main(String[] args) {
        Conta_Banco conta1 = new Conta_Banco();
            conta1.numConta = 552;
            conta1.tipo = "cc";
            conta1.setDono("Ruan Fernandes Mendonca");
            conta1.setSaldo(200.00f);
            conta1.setStatus(true);
        conta1.exibirConta();
    }
    
}
