package main.java.com.alexandre.aulased3ads.lib;
import main.java.com.alexandre.aulased3ads.lib.Stack;

import java.util.ArrayList;

public class Pilha3 {
    public static void main(String[] args) {
        Stack<Character> pilha = new Stack<>();
        ArrayList<Character> vetor = new ArrayList<>();


        String frase = "Socorram-me, subi no onibus em Marrocos";

        for (int i = 0; i < frase.length(); i++){
            pilha.push(frase.charAt(i));
        }
        System.out.println("Antes de Inverter: ");
        System.out.println(pilha.print());
        System.out.println("-----------------------");

        for (int i = 0; i < frase.length(); i++){
            vetor.add(pilha.pop());
        }

        System.out.println("Invertido: ");
        System.out.println(vetor);
    }
}
