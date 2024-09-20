package aula11;

public class Bolsista extends Aluno {
    private int bolsa;
    
    public void renovarBolsa(){
        System.out.println("Renovando a bolsa do(a) querido(a) " + this.getNome() + "!!");
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome() + " possui bolsa. Matricula paga.");
    }

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    
    @Override
    public void status(){
        System.out.println("-----------BOLSISTA----------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("RA: " + this.getRa());
        System.out.println("Curso: " + this.getCurso());
        System.out.println("Bolsa: " + this.getBolsa());
        System.out.println("-----------------------------");
    }
}
