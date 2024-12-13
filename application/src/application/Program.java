package application;

import model.entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        // Criando uma lista de produtos
        List<Product> list = new ArrayList<>();

        // Adicionando produtos à lista
        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        // Criando um objeto Comparator usando uma expressão lambda com chaves
        Comparator<Product> comp = (p1, p2) -> {
            // Compara os nomes dos produtos, ignorando diferenças de maiúsculas e minúsculas
            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        };

        // Ordenando a lista de produtos usando o comparador definido
        list.sort(comp);

        // Imprimindo os produtos ordenados
        for (Product p : list) {
            System.out.println(p);
        }
    }
}