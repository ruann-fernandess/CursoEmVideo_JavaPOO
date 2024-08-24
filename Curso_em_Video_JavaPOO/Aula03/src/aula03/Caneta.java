package aula03;

public class Caneta {
    
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga  +("%"));
        System.out.println("Tampada: " + this.tampada + "\n");
    }
    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("[ERRO] Caneta tampada! \n");
        }else{
            System.out.println("Rabiscando! \n");
        }
              
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
}

