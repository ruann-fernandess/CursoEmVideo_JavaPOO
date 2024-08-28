package aula05;

public class Conta_Banco {
    public int numConta;
    protected String tipo; //Conta corrente ou Conta poupança (cc || cp)
    private String dono;
    private float saldo;
    private boolean status;
    
    public Conta_Banco() {
        this.saldo = 0f;
        this.status = false;
    }
    public void abrirConta(String tipo){
        this.tipo = tipo;
        this.status = true;
        if(this.tipo == "cc")
            this.saldo += 50f;
        else if(this.tipo == "cp")
            this.saldo += 150f;
    }
    public void fecharConta(){
        if (this.saldo < 0){
            System.out.println("\n[ERRO] Nao eh possivel fechar conta pois esta negativado.");
        } else if (this.saldo > 0) {
            System.out.println("\n[ERRO] Ainda ha saldo em sua conta.");
        }else{
            this.status = false;
        }
    }
    public float depositar(float deposito){
        if (this.status == false){
            System.out.println("\n[ERRO] Sua conta nao foi aberta.");
            return 0;
        }else{
            this.saldo += deposito;
        }
        return saldo;
    }
    public float sacar(float saque){
        if (this.status == false){
            System.out.println("\n[ERRO] Sua conta nao foi aberta.");
            return 0;
        }else if(this.saldo <= saque){
            System.out.println("\n[ERRO] Nao ha saldo suficiente.");
            return 0;
        }else{
            this.saldo -= saque;
        }
        return saldo;
    }
    public void pagarMensal(){
        if(this.tipo == "cc"){
            this.saldo -= 12f;
        }else if(this.tipo == "cp"){
            this.saldo -= 20f;
        }
    }
    
    //GETTERS
    public int getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean getStatus() {
        return status;
    }
    
    //SETTERS
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public void exibirConta(){
        System.out.println("\nINFORMACOES DA CONTA: \n");
        System.out.println("Numero da conta: " + this.numConta);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Dono: " + this.dono);
        System.out.println("Saldo: $" + this.saldo);
        System.out.println("Status: " + this.status + "\n");
    }
}
