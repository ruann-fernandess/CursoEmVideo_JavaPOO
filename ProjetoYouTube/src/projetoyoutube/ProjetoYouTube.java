package projetoyoutube;

public class ProjetoYouTube {

    public static void main(String[] args) {
        
        Video v[] = new Video[3];
        v[0] = new Video("Tutorial de farm de ferro");
        v[1] = new Video ("Videoaula do Guanabara");
        v[2] = new Video ("Teoria da Floresta Negra");
        System.out.println(v[0].toString());
        
        Gafanhoto aluno[] = new Gafanhoto[2];
        aluno[0] = new Gafanhoto("Ruan",20,"M","ruan@gmail.com");
        aluno[1] = new Gafanhoto("Rafaella",19,"F","rafa@gmail.com");
        System.out.println(aluno[0]);
    }
    
}
