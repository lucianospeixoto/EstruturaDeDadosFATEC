package main.java.com.alexandre.aulased3ads.lib;

import java.util.ArrayList;

public class Deque<T> {
    private ArrayList<T> data; //Lista Privada

    public Deque(){
        this.data = new ArrayList<T>(); //Lista Vazia
    }

    //Metodo para inserção no inicio da estrutura
    public void insertFront (T valor){
        this.data.add(0, valor);
    }

    //Metodo para inserção no final da estrutura
    public void insertBack (T valor){
        this.data.add(valor);
    }

    //Metodo para informar se o deque esta vazio ou não
    public boolean isEmpty(){
        return this.data.isEmpty();
    }

    //Metodo para consultar o inicio da estrutura (sem remover)
    public T peekFront(){
        if (isEmpty()) return null;
        return this.data.get(0);
    }

    //Metodo para consultar o final da estrutura (sem remover)
    public T peekBack(){
        if (isEmpty()) return null;
        return this.data.get(this.data.size() -1);
    }

    //Metodo para remoção do inicio da estrutura
    public T removeFront(){
        if (isEmpty()) return null;
        return this.data.remove(0);
    }

    //Metodo para remoção do final da estrutura
    public T removeBack(){
        if (isEmpty()) return null;
        return this.data.remove(this.data.size() -1);
    }

    //Metodo que imprime o deque (para efeitos de depuração)
    public String print(){
        StringBuilder output = new StringBuilder("[ ");
        for (int i = 0; i < this.data.size(); i++){
            if (output.length() > 2) output.append(", ");
            output.append(" (").append(i).append("): ").append(this.data.get(i));
        }
        output.append(" ]");
        return output.toString();
    }
}
