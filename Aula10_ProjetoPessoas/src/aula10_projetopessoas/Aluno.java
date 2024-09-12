package aula10_projetopessoas;

public class Aluno extends Pessoa{
    private int ra;
    private String curso;

    public Aluno(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }

    public void cancelMat(){
        System.out.println("Matrícula cancelada ");
    }
    
    @Override
    public void status(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("RA: " + this.getRa());
        System.out.println("Curso: " + this.getCurso());
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
        
}
