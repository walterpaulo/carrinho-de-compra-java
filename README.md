# SPRING TEST API


## Descrição

  O teste consiste em construir a camada de serviço de um pseudo ecommerce de games mobile utilizando Java

## Como executar os testes
  
  O projeto usa o maven wrapper (mvnw).
  Para executar os testes de exemplo basta o comando abaixo:
  
  ```sh
  ./mvnw clean test
  ```
  
  Para executar projeto exemplo basta o comando abaixo:
 
  ```sh
  ./mvnw clean spring-boot:run
  ```

## Requisitos

  - Existe um exemplo de carga de banco de dados em memória em [ProductDaoExampleTest.java](./src/test/java/br/com/supera/api/models/ProductDaoExampleTest.java);
  
  - Os valores exibidos no checkout (frete, subtotal e total) devem ser calculados dinamicamente;
  
  - O usuário poderá adicionar e remover produtos do carrinho;
  
  - O usuário poderá ordenar os produtos por preço, popularidade (score) e ordem alfabética;
  
  - A cada produto adicionado, deve-se somar R$ 10,00 ao frete.

  - Quando o valor dos produtos adicionados ao carrinho for igual ou superior a R$ 250,00, o frete é grátis.


## Modo

  - A API Restful
  - Spring Boot versão 2.5.5;
  
## TDD
__CarrinhoTest__  [CarrinhoTest.java](./src/test/java/br/com/supera/api/models/ProductDaoExampleTest.java)(s/ banco) e [ProductDaoExampleTest.java](./src/test/java/br/com/supera/api/models/ProductDaoExampleTest.java) ([c/ banco](./src/test/resources/datasets/products.yml) ); 
  -  Quantidadede de produtos no carrinho;
  -	 Remover Produto do carrinho;
  -	 Valor de compra abaixo de R$ 250,00 e cobrado tarifa de frete;
  -	 Valor de compra acima de R$ 250,00 e zerada tarifa de frete;

__ProdutoTest__  [ProdutoTest.java](./src/test/java/br/com/supera/api/services/ProdutoTest.java)

  -  Quantidadede de produtos(adição, exclusão e quantidade);
 
 
	
  
## Finalazado
 executar/compilar/empacotar 
