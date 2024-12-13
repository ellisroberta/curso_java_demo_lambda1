# Projeto de Comparação de Produtos

## Introdução
Este projeto possui como objetivo demonstrar diferentes formas de implementar a comparação de produtos em Java utilizando a classe `Product` como base. Serão abordadas abordagens utilizando `Comparator`, classes anônimas, expressões lambda e a flexibilidade do método `sort`.

## Problema
- A classe `Product` contém os atributos `name` e `price`.
- A implementação da interface `Comparable<Product>` pode levar a dificuldades de manutenção quando o critério de comparação muda.
- O uso do método `sort` da interface `List` permite um comportamento mais flexível.

![Product](pictures/Product.png)

## Implementações

### Comparator Objeto de Classe Separada
- **Classe `Program`**: Implementa a lógica do programa principal.
- **Classe `Product`**: Representa um produto com atributos, construtores e métodos.
- **Classe `MyComparator`**: Implementa `Comparator<Product>` para comparar produtos.

### Comparator Objeto de Classe Anônima
- **Classe `Program`**: Utiliza uma classe anônima para comparar produtos.
- **Vantagens**: Implementações rápidas, escopo local.

### Comparator Objeto de Expressão Lambda com Chaves
- **Classe `Program`**: Utiliza expressões lambda com chaves para a comparação.
- **Vantagens**: Sintaxe concisa, foco na lógica.

### Comparator Objeto de Expressão Lambda Sem Chaves
- **Classe `Program`**: Utiliza expressões lambda sem chaves para a comparação.
- **Vantagens**: Código mais limpo, redução de verbosidade.

### Comparator Expressão Lambda "Direto no Argumento"
- **Classe `Program`**: Utiliza expressões lambda diretamente como argumentos no método `sort`.
- **Vantagens**: Simplicidade e clareza.

## Conclusão
Este projeto demonstra como diferentes abordagens podem ser utilizadas para implementar a comparação de produtos em Java, 
oferecendo flexibilidade e mantendo a manutenção do código em um nível gerenciável.