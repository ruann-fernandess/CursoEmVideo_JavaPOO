package aula11;

public class Aluno extends Pessoa{
    private int ra;
    private String curso;
    
    public void pagarMensalidade(){
        System.out.println("Indo cobrar o meliante " + this.getNome() + "!!");
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
    
    @Override
    public void status(){
        System.out.println("------------ALUNO------------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("RA: " + this.getRa());
        System.out.println("Curso: " + this.getCurso());
        System.out.println("-----------------------------");
    }
}
