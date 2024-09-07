package ultraemojicombat;

public class UltraEmojiCombat {

    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        
        //nome, nacionalidade, idade, vitorias, derrotas, empates, altura, peso
        l[0] = new Lutador("Pretty Boy", "Franca", 31, 11, 2, 1, 1.75f, 68.9f);
        l[1] = new Lutador("Putscript", "Brasil", 29, 14, 2, 3, 1.68f, 57.8f);
        l[2] = new Lutador("Snapshadow", "EUA", 35, 12, 2, 1, 1.65f, 80.9f);
        l[3] = new Lutador("Dead Code", "Autrália", 28, 13, 0, 2, 1.93f, 81.6f);
        l[4] = new Lutador("UFOCobol", "Brasil", 37, 5, 3, 4, 1.70f, 119.3f);
        l[5] = new Lutador("Nerdart", "EUA", 30, 12, 2, 4, 1.81f, 105.7f);
        
        Luta luta1 = new Luta();
        luta1.marcarLuta(l[0], l[1]);
        luta1.lutar();
        l[0].status();
        l[1].status();
        
    }
    
}
