# Problema

• Suponha uma classe Product com os atributos name e price.
• Podemos implementar a comparação de produtos por meio da
implementação da interface Comparable<Product>
• Entretanto, desta forma nossa classe não fica fechada para
alteração: se o critério de comparação mudar, precisaremos
alterar a classe Product.
• Podemos então usar o default method "sort" da interface List:
default void sort(Comparator<? super E> c)

![Product](pictures/Product.png)

## Comparator objeto de classe separada

* Classe **Program**: Esta classe contém o método main, que é o ponto de entrada do programa. 
Aqui, uma lista de produtos é criada, produtos são adicionados a essa lista e, em seguida, a lista é ordenada utilizando um comparador.

* Classe **Product**: Representa um produto, contendo dois atributos: name (nome do produto) e price (preço do produto). 
Inclui construtores, métodos para acessar (getters) e modificar (setters) os atributos, e um método toString para facilitar a visualização dos produtos.

* Classe **MyComparator**: Implementa a interface Comparator<Product>, permitindo a comparação de objetos da classe Product. 
O método compare define a lógica para comparar dois produtos com base nos seus nomes, convertendo-os para maiúsculas para garantir 
que a comparação não seja sensível a maiúsculas/minúsculas.

### Solução Usando Comparator

* Flexibilidade: Ao usar um objeto Comparator separado, a classe Product não precisa ser alterada se o critério de comparação 
mudar (por exemplo, se quisermos comparar produtos pelo preço em vez do nome). Isso segue o princípio de design aberto/fechado,
onde a classe é aberta para extensão (novos comparadores) mas fechada para modificação.
* Uso do Método sort: O método sort da lista permite ordenar os produtos de maneira flexível, utilizando diferentes implementações de Comparator.
