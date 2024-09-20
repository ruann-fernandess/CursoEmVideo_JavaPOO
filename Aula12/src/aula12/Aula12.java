package aula12;

public class Aula12 {

    public static void main(String[] args) {
        //Animal n = new Animal();
        
        Mamifero m = new Mamifero();
        Peixe p = new Peixe();
        Reptil r = new Reptil();
        Ave a = new Ave();
        
        Canguru kangaroo = new Canguru();
        Cachorro dog = new Cachorro();
        Cobra sneak = new Cobra();
        Tartaruga turtle = new Tartaruga();
        GoldFish fish = new GoldFish();
        Arara macaw = new Arara();
        
        kangaroo.emitirSom();
        dog.emitirSom();
        sneak.locomover();
        macaw.locomover();
    }
    
}
