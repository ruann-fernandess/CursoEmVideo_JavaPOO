package projetoyoutube;

public class Video implements AcoesVideo {
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindoSimNao;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0; 
        this.curtidas = 0;
        this.reproduzindoSimNao = false;
    }

    @Override
    public void play() {
    }

    @Override
    public void pause() {
    }

    @Override
    public void like() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (this.avaliacao + avaliacao)/this.views;
        this.avaliacao = nova;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean getReproduzindoSimNao() {
        return reproduzindoSimNao;
    }

    public void setReproduzindoSimNao(boolean reproduzindoSimNao) {
        this.reproduzindoSimNao = reproduzindoSimNao;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo 
             + "\n Avaliacao: " + avaliacao 
             + "\n Views: " + views 
             + "\n Curtidas: " + curtidas 
             + "\n ReproduzindoSimNao: " + reproduzindoSimNao;
    }
    
    
}
