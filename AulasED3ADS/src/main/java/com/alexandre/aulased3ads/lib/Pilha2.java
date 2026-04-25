package main.java.com.alexandre.aulased3ads.lib;
import main.java.com.alexandre.aulased3ads.lib.Stack;

public class Pilha2 {
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();
        System.out.println(pilha.print());
        System.out.println("Está vazia? " + (pilha.isEmpty() ? "Sim" : "Não"));
        System.out.println("-----------------------------------");

        pilha.push(35);
        pilha.push(77);
        pilha.push(19);

        System.out.println(pilha.print());
        System.out.println("Está vazia? " + (pilha.isEmpty() ? "Sim" : "Não"));
        System.out.println("-----------------------------------");

        Integer removido = pilha.pop();
        System.out.println("Removido: " + removido + ", Pilha: " + pilha.print());
        System.out.println("-----------------------------------");

        Integer ultimo = pilha.peek();
        System.out.println("Ultimo (topo): " + ultimo);
    }

}
