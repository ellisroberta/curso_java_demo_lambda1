package application;

import model.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        // Criando uma lista de produtos
        List<Product> list = new ArrayList<>();

        // Adicionando produtos à lista
        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        // Ordenando a lista de produtos usando uma expressão lambda "direto no argumento"
        list.sort((p1, p2) ->
                p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase())
        );

        // Imprimindo os produtos ordenados
        for (Product p : list) {
            System.out.println(p);
        }
    }
}