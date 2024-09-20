package aula11;

public class Aula11 {

    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("Robertinho Visiteros");
        v1.setIdade(23);
        v1.setSexo("M");
        v1.status();
        
        Aluno a1 = new Aluno();
        a1.setNome("Leonardo Estudencio");
        a1.setIdade(21);
        a1.setSexo("M");
        a1.setRa(529097678);
        a1.setCurso("ADS");
        a1.status();
        a1.pagarMensalidade();;
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Gabriela Bolselas");
        b1.setIdade(22);
        b1.setSexo("F");
        b1.setRa(921477);
        b1.setCurso("COMEX");
        b1.setBolsa(139081);
        b1.status();
        b1.renovarBolsa();
        b1.pagarMensalidade();
        
    }
    
}
