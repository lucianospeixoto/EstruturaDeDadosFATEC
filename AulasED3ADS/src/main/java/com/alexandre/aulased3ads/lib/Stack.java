package main.java.com.alexandre.aulased3ads.lib;

import java.util.ArrayList;

public class Stack<T> {
    private ArrayList<T> data; // lista interna privada

    public Stack() {
        this.data = new ArrayList<T>(); // lista vazia
    }

    // metodo para inserção na pilha
    public void push(T val){
        this.data.add(val);
    }

    // metodo para remoção da pilha
    public T pop(){
        if(isEmpty()) return null;
        return this.data.remove(this.data.size() -1);
    }

    // metodo para informar se a pilha esta vazia ou não
    public boolean isEmpty(){
        return this.data.isEmpty();
    }

    // metodo para consultar o topo (ultima posição) da pilha
    // sem remover o elemento
    public T peek(){
        if(isEmpty()) return null;
        return this.data.get(this.data.size() -1);
    }

    // metodo que imprime a pilha (para efeitos de depuração)
    public String print(){
        return this.data.toString();
    }

    public void add(T c) {
    }
}
