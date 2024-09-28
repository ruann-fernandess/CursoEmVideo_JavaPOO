package aula13;

public class Cachorro extends Lobo {
    @Override
    public void emitirSom(){
        System.out.println("\nAu Au, mermao");
    }
    public void reagir(String frase){
        if(frase == "Petisco" || frase == "Passear"){
            System.out.println("AU AU AU (EEEEEEEBAAAAAAAAAAAA)");
        }else{
            System.out.println("*ignorar*");
        }
    }
    public void reagir(int hora){
        if(hora < 6){
            System.out.println("Au (Deixa eu dormir cara)");
        }else if(hora < 12){
            System.out.println("AUU AUUU AUUU AUU (CARTEIRO SAIA DO MEU TERRITORIO!!!!)");
        }else if(hora < 20){
            System.out.println("Au-A Aunn (Ta na hora de passear?)");
        }else if(hora < 23){
            System.out.println("AAuurr (Partiu sonequinha familia, abracos)");
        }
    }
    public void reagir(boolean donoSimNao){
        if(donoSimNao){
            System.out.println("Trouxe minha racao?");
        }else{
            System.out.println("Quem eh tu, palhaco?");
        }
    }
    public void reagir(int idade, float peso){
        if(idade > 8){
            System.out.print("Sou idoso");
            if(peso < 10){
                System.out.println(" e sarado");
            }else{
                System.out.println(" e gordo");
            }
        }else{
            System.out.print("Sou novinho");
            if(peso < 10){
                System.out.println(" e sarado");
            }else{
                System.out.println(" e gordo");
            }
        }
    }
        
}
