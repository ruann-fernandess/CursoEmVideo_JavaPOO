package aula10_projetopessoas;

public class Aula10_ProjetoPessoas {

    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("Renato", 20, "M");
        Aluno p2 = new Aluno("Rafaella", 19, "F");
        Professor p3 = new Professor("Fabio", 50, "M");
        Funcionario p4 = new Funcionario("Ge", 42, "F");
        
        System.out.println("=================Antes=================");
        p1.status();
        p2.status();
        p3.status();
        p4.status();
        
        p2.setCurso("ADS");
        p2.setRa(473);
        p3.setMateria("Sistemas Operacionais II");
        p3.setSalario(6800);
        p4.setTrabalhando(true);
        p4.setSetor("Limpeza");
        
        System.out.println("=================Depois=================");
        p1.status();
        p2.status();
        p3.status();
        p4.status();
    }
    
}
