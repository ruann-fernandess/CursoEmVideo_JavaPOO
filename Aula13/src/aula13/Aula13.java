package aula13;

public class Aula13 {

    public static void main(String[] args) {
        
        Mamifero coelho = new Mamifero();
        coelho.emitirSom();
        
        Lobo loboMau = new Lobo();
        loboMau.emitirSom();
        
        Cachorro caramelo = new Cachorro();
        caramelo.emitirSom();
        caramelo.reagir("Ola!"); //Reagir a frase
        caramelo.reagir("Petisco"); //Reagir a frase 
        caramelo.reagir(17); //Hora
        caramelo.reagir(true); //Dono
        caramelo.reagir(7,10.5f); //Idade e Peso
    }
    
}
