package ProjetoLivro;
public class Aula09 {
    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[2];
        Livro l[] = new Livro[2];
                         
                          // nome,  idade, sexo
        p[0] = new Pessoa("Ruan", 20, "Masculino"); 
        p[1] = new Pessoa("Rafaella", 21, "Feminino"); 
        
                          // titulo, autor, total de paginas, leitor
        l[0] = new Livro("Pequeno Principe", "Antoine de Saint-Exupéry", 96, p[1]);
        l[1] = new Livro("Malorie", "Josh Malerman", 288, p[0]);
        
        l[0].detalhes();
        l[0].abrir();
        l[0].folhear(53);
        l[0].avancarPag();
        l[0].avancarPag();
        l[0].voltarPag();
        l[0].setLeitor(p[0]);
        l[0].detalhes();
    }
    
}
