package ultraemojicombat;
    import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;
    
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria() == l2.getCategoria() && l1 != l2){
            this.aprovado = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }else{
            this.aprovado = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar(){
        if(this.aprovado == true){
            this.desafiado.apresentar();
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); //0 1 2
            switch (vencedor){
                case 0: // Empate
                    System.out.println("EMPATE!!");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                    break;
                case 1: // Desafiado Vence
                    System.out.println("O Vencedor foi " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: // Desafiado Perde
                    System.out.println("O Vencedor foi " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
        }else{
            System.out.println("[ERRO] Luta invalida");
        }
    }

    public Lutador getDesafidado() {
        return desafiado;
    }

    public void setDesafidado(Lutador desafidado) {
        this.desafiado = desafidado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    
    
}
