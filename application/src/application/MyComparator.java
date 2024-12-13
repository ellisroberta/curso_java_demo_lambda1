package application;

import model.entities.Product;

import java.util.Comparator;

// Classe que implementa a interface Comparator para comparar produtos
public class MyComparator implements Comparator<Product> {
    // Método que define a lógica de comparação entre dois produtos
    @Override
    public int compare(Product p1, Product p2) {
        // Compara os nomes dos produtos, ignorando diferenças de maiúsculas e minúsculas
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }
}