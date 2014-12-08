
import java.util.Map;
import java.util.Set;
import utfpr.dainf.if62c.pratica.Jogador;
import utfpr.dainf.if62c.pratica.Time;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author davip_000
 */
public class Pratica61 {
    public static void main(String[] args){
        Time a,b;
        Set<String> chaves;
        a = new Time();
        b = new Time();
        a.addJogador("Goleiro", new Jogador(1,"Davi"));
        a.addJogador("Lateral", new Jogador(4,"Bruna"));
        a.addJogador("Atacante", new Jogador(10,"Leandro"));
        b.addJogador("Goleiro", new Jogador(1,"João"));
        b.addJogador("Lateral", new Jogador(7,"José"));
        b.addJogador("Atacante", new Jogador(15,"Mário"));
        
        chaves = a.getJogadores().keySet();
        
        System.out.println("Posição    Time 1        Time2");
        for(String s: chaves){
            System.out.println(s + ": " + a.getJogadores().get(s) + "    " + b.getJogadores().get(s));
        }
    }
}
