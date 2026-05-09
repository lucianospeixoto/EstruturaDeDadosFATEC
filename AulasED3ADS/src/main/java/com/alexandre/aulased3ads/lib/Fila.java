package main.java.com.alexandre.aulased3ads.lib;

public class Fila {
    static void main(String[] args) {
        Queue<String> fila = new Queue ();
        System.out.println(fila.print());

        //Inserções
        fila.enqueue("Luciano");
        fila.enqueue("João");
        fila.enqueue("Ana");
        fila.enqueue("Sarah");
        fila.enqueue("Mario");

        System.out.println(fila.print());

        //Ver quem é o próximo a ser chamado
        String proximo = fila.peek();
        System.out.println("Próximo a ser chamado: " + proximo);

        //Chamar o próximo(remoção da fila)
        String atendido = fila.dequeue();

        //Atendimento
        System.out.println(atendido + ", favor dirija-se a sala 02");

        //Fila atual
        System.out.println(fila.print());
    }




}
