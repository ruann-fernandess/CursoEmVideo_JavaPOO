package aula10_projetopessoas;

public class Professor extends Pessoa {
    
    private String materia;
    private float salario;
    
    public Professor(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }
    
    public void receberAumento(float x){
        this.salario += x;
    }
    
    @Override
    public void status(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Disciplina: " + this.getMateria());
        System.out.println("Salario: RS" + this.getSalario());

    }
    
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}
