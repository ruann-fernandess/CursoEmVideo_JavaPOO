package ultraemojicombat;

public class Lutador {
    // Atributos
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;
    
    // Construtor
    public Lutador(String nome, String nacionalidade, int idade, int vitorias, int derrotas, int empates, float altura, float peso) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.altura = altura;
        this.setPeso(peso); // automaticamente calcula a categoria
    }
    
    // Métodos
    public void apresentar() {
        System.out.println("----------------------------------------------");
        System.out.println("Vindo diretamente do pais " + this.nacionalidade);
        System.out.println("com " + this.idade + " anos de idade e com");
        System.out.println("seus incriveis " + this.altura +"m de altura, ");
        System.out.println("pesando brutais " + this.peso + "Kg composto por:");
        System.out.println(this.vitorias + " vitorias");
        System.out.println(this.derrotas + " derrotas");
        System.out.println(this.empates + " empates");
        System.out.println("ELE, O GRANDE, O MONSTRO, " + this.nome + "!!!!!");
        System.out.println("----------------------------------------------");

    }
    public void status(){ 
        System.out.println("----------------------------------------------");
        System.out.println(this.nome + ", um peso " + this.categoria + " com:");
        System.out.println(this.vitorias + " vitorias");
        System.out.println(this.derrotas + " derrotas");
        System.out.println(this.empates + " empates");
        System.out.println("----------------------------------------------");
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
    
    // Métodos especiais (getters & setters)
    // GETTERS
    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getIdade() {
        return idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public float getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }
    
    // SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    private void setCategoria() {
        if (this.peso < 50 || this.peso > 120){
            this.categoria = "[ERRO] Lutador fora de peso.";
        } else if (this.peso <= 70){
            this.categoria = "Leve";
        } else if (this.peso <= 90){
            this.categoria = "Medio";
        } else if (this.peso <= 120){
            this.categoria = "Pesado";
        }
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
    
}

