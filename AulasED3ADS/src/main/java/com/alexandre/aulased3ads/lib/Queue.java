package main.java.com.alexandre.aulased3ads.lib;

import java.util.ArrayList;

public class Queue<T> {
    private ArrayList<T> data; // Lista Privada

    public Queue() {
        this.data = new ArrayList<T>(); // Lista Vazia
    }

    //Metodo para inserção de dados na fila
    public void enqueue(T valor){
        this.data.add(valor);
    }

    //Metodo para remoção de dados na fila
    public T dequeue(){
        if (isEmpty()) return null;
        return this.data.remove(0);
    }

    //Metodo para verificar se a fila esta vazia ou não
    public boolean isEmpty(){
        return this.data.isEmpty();
    }

    //Metodo para consultar o inicio da fila sem remover o elemento
    public T peek(){
        if (isEmpty()) return null;
        return this.data.get(0);
    }

    //Metodo que imprime a fila (para efeitos de depuração)
    public String print(){
        StringBuilder output = new StringBuilder("[ ");
        for (int i = 0; i < this.data.size(); i++) {
            if (output.length() > 2) output.append(", ");
            output.append(" (").append(i).append("): ").append(this.data.get(i));
        }
        output.append(" ]");
        return output.toString();
    }
}
