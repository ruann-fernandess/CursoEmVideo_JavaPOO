package aula10_projetopessoas;

public class Funcionario extends Pessoa {
    
    private String setor;
    private boolean trabalhando;
    
    public Funcionario(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }
    
    public void mudarTrabalho(){
        this.trabalhando =! this.trabalhando;
    }
    
    @Override
    public void status(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Setor: " + this.getSetor());
        System.out.println("Trabalhando?: " + this.getTrabalhando());

    }
    
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    
}
