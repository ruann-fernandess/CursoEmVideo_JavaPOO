package ProjetoLivro;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPag, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPag = totPag;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }
    
    public void detalhes(){
        System.out.println("--------------------------------------------------");
        System.out.println("Este livro possui as seguintes caracteristicas:");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Total de paginas: " + this.totPag);
        System.out.println("Pagina atual: " + this.pagAtual);
        System.out.println("Aberto: " + this.aberto);
        System.out.println("Leitor atual: " + this.leitor.getNome());
        System.out.println("--------------------------------------------------");

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPag() {
        return totPag;
    }

    public void setTotPag(int totPag) {
        this.totPag = totPag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if (this.aberto == true){
            if (this.totPag >= p && p >= 0){
                this.pagAtual = p;
            } else{
                this.pagAtual = 0;
            }
        } else {
            System.out.println("[ERRO] Livro esta fechado!");
        }
    }

    @Override
    public void avancarPag() {
        if (this.aberto == true){
            if (this.pagAtual<this.totPag){
                this.pagAtual += 1;
            }
        } else {
            System.out.println("[ERRO] Livro esta fechado!");
        }
    }

    @Override
    public void voltarPag() {
        if (this.aberto == true){
            if (this.pagAtual > 0){
                this.pagAtual -= 1;
            }
        } else {
            System.out.println("[ERRO] Livro esta fechado!");
        }
    }
    
    
}
