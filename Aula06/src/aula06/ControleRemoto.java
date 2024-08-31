package aula06;

public class ControleRemoto implements Controlador{
    
    //ATRIBUTOS
    private int volume;
    private boolean ligado;
    private boolean tocando; 
    
    //MÉTODOS
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    
    //GETTERS
    private int getVolume() {
        return volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private boolean getTocando() {
        return tocando;
    }
    
    //SETTERS

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    // IMPLEMENTAÇÃO DA INTERFACE CONTROLADOR
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("--------MENU--------");
        System.out.println("Ligado: " + getLigado());
        System.out.println("Tocando: " + getTocando());
        System.out.print("Volume: (" + this.getVolume() + ") ");
            for (int i = 0; i < this.getVolume(); i += 10){
                System.out.print("|");
            }
        System.out.println("\n--------------------");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado() == true){
            this.setVolume(this.getVolume() + 5);
        } else{
            System.out.println("[ERRO] Controle desligado");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado() == true){
            this.setVolume(getVolume() - 5);
        } else{
            System.out.println("[ERRO] Controle desligado");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() == true && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() == true && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() == true && this.getTocando() == false){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() == true && this.getTocando() == true){
            this.setTocando(false);
        }        
    }
    
}
