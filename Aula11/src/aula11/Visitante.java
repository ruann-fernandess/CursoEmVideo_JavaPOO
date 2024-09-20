package aula11;

public class Visitante extends Pessoa{
    
    @Override
    public void status(){
        System.out.println("----------VISITANTE----------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("-----------------------------");
    }
}
