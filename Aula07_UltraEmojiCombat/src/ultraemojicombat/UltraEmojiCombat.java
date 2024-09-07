package ultraemojicombat;

public class UltraEmojiCombat {

    public static void main(String[] args) {
        Lutador lutador[] = new Lutador[6];
        
        //nome, nacionalidade, idade, vitorias, derrotas, empates, altura, peso
        lutador[0] = new Lutador("Pretty Boy", "Franca", 31, 11, 2, 1, 1.75f, 68.9f);
        lutador[1] = new Lutador("Putscript", "Brasil", 29, 14, 2, 3, 1.68f, 57.8f);
        lutador[2] = new Lutador("Snapshadow", "EUA", 35, 12, 2, 1, 1.65f, 80.9f);
        lutador[3] = new Lutador("Dead Code", "Autrália", 28, 13, 0, 2, 1.93f, 81.6f);
        lutador[4] = new Lutador("UFOCobol", "Brasil", 37, 5, 3, 4, 1.70f, 119.3f);
        lutador[5] = new Lutador("Nerdart", "EUA", 30, 12, 2, 4, 1.81f, 105.7f);
        
        lutador[1].apresentar();
        lutador[0].apresentar();
        lutador[1].ganharLuta();
        lutador[0].perderLuta();
        lutador[1].status();
        lutador[0].status();
    }
    
}
