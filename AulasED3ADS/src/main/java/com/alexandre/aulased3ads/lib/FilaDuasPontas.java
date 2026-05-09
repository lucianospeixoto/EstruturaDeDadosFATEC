package main.java.com.alexandre.aulased3ads.lib;

public class FilaDuasPontas {
    static void main(String[] args) {
        Deque<String> listaCompras = new Deque();
        System.out.println(listaCompras.print());

        //Alimenticio --> Inicio
        listaCompras.insertFront("Arroz");
        listaCompras.insertFront("Feijão");
        listaCompras.insertFront("Macarrão");
        System.out.println(listaCompras.print());

        //Higiene/Limpeza --> Final
        listaCompras.insertBack("Sabão em pó");
        listaCompras.insertBack("Desodorante");
        listaCompras.insertBack("Agua Sanitária");
        System.out.println(listaCompras.print());

        listaCompras.insertFront("Café");
        listaCompras.insertFront("Açucar");
        System.out.println(listaCompras.print());

        listaCompras.insertBack("Shampoo");
        listaCompras.insertBack("Amaciante");
        System.out.println(listaCompras.print());

        //Desisti de comprar algumas coisas do final
        String removido = listaCompras.removeBack();
        System.out.println("Removido (Back): " + removido);
        System.out.println(listaCompras.print());

        //Desisti de comprar algumas coisas do inicio
        removido = listaCompras.removeFront();
        System.out.println("Removido (Front): " + removido);
        System.out.println(listaCompras.print());

        //Consultar qual proximo item da lista (inicial)
        String proximo = listaCompras.peekFront();
        System.out.println("Proximo (Front): " + proximo);

        //Consultar qual proximo item da lista (final)
        String ultimo = listaCompras.peekBack();
        System.out.println("Ultimo (Back): " + ultimo);

    }
}
