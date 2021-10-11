#LOJA DE GAMES SPRING TEST - MVC


## Descrição

  O teste consiste em construir a camada de serviço de um pseudo ecommerce de games mobile utilizando Java.
  Vídeos de funcionamento está na plataforma do YouTube, em [ https://youtu.be/J4bgc6xGYlw ]( https://youtu.be/J4bgc6xGYlw).

### Como executar os testes
  
  O projeto usa o maven wrapper (mvnw).
  Para executar os testes de exemplo basta o comando abaixo:
  
  ```sh
  ./mvnw clean test
  ```
  
  Para executar projeto exemplo basta o comando abaixo:
 
  ```sh
  ./mvnw spring-boot:run
  ```

## Requisitos

  - Existe um exemplo de carga de banco de dados em memória em [ProductDaoExampleTest.java](./src/test/java/br/com/supera/api/models/ProductDaoExampleTest.java);
  
  - Os valores exibidos no checkout (frete, subtotal e total) devem ser calculados dinamicamente;
  
  - O usuário poderá adicionar e remover produtos do carrinho;
  
  - O usuário poderá ordenar os produtos por preço, popularidade (score) e ordem alfabética;
  
  - A cada produto adicionado, deve-se somar R$ 10,00 ao frete.

  - Quando o valor dos produtos adicionados ao carrinho for igual ou superior a R$ 250,00, o frete é grátis.


#### Requerimentos/Conhecimentos e Tecnologias utilizadas

  - JDK 8([https://www.oracle.com/technetwork/java/javaee/overview/index.html](https://www.oracle.com/technetwork/java/javaee/overview/index.html))
  - Spring Boot 2+([https://spring.io/projects/spring-boot#learn](https://spring.io/projects/spring-boot#learn))
  - Thymeleaf([https://www.thymeleaf.org/](https://www.thymeleaf.org/))
  - Materialize([https://materializecss.com/](https://materializecss.com/))
  
  
####  FrameWork Spring boot:
-  Fácil implantação;
-  Acelera os resultados de entrega;
-  Impulsiona desenvolvimentos de microsserviços;
-  Estável com Java 11;
-  Prepara o ambiente de desenvolvimento, sem "dor de cabeça"; 
 
  
####  Aplicação:
#####Página incial:
* http://localhost:8080/

#####Página Carrinho de compra:
* http://localhost:8080/carrinho-de-Compra

#####Lista produtos por nome:
* http://localhost:8080/name

#####Lista produtos por preço:
* http://localhost:8080/price

#####Lista produtos por score:
* http://localhost:8080/score

  
#### TDD
__CarrinhoTest__  [CarrinhoTest.java](./src/test/java/br/com/supera/api/models/ProductDaoExampleTest.java)(s/ banco) e [ProductDaoExampleTest.java](./src/test/java/br/com/supera/api/models/ProductDaoExampleTest.java) ([c/ banco](./src/test/resources/datasets/products.yml) ); 
  -  Quantidadede de produtos no carrinho;
  -	 Remover Produto do carrinho;
  -	 Valor de compra abaixo de R$ 250,00 e cobrado tarifa de frete;
  -	 Valor de compra acima de R$ 250,00 e zerada tarifa de frete;

 
	
  
## Finalazado
##### executar
Abre o terminal e dentro do diretório digita o camando:

  ```sh
	$> ./mvnw clean test
  ```
   
##### compilar
Para obter o JAR, basta executar o comando:
   
   ```sh
  $> mvn install 
  ou 
  $>./mvnw install
  $> java -jar target/api-1.0.0-SNAPSHOT.jar
  ```
 
 Para testar o arquivo binário: 
 
   ```sh
  $> java -jar target/api-1.0.0-SNAPSHOT.jar
  ```
 
##### empacotar 

   ```sh
  $> tar -cvzf spring-test-api-rest.tar.gzip spring-test-api-rest/
  ```


