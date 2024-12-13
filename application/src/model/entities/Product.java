package model.entities;

// Classe que representa um produto com nome e preço
public class Product {
    private String name;  // Atributo que armazena o nome do produto
    private Double price; // Atributo que armazena o preço do produto

    // Construtor padrão
    public Product() {
    }

    // Construtor que inicializa o nome e o preço do produto
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    // Métodos getters e setters para acessar e modificar os atributos
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    // Método que retorna uma representação em string do produto
    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }
}
