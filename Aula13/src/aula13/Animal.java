package aula13;

public abstract class Animal {
    protected float peso;
    protected int idade;
    protected int qntdMembros;
    
    public abstract void emitirSom();

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getQntdMembros() {
        return qntdMembros;
    }

    public void setQntdMembros(int qntdMembros) {
        this.qntdMembros = qntdMembros;
    }
    
    
}
