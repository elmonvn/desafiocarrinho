# DesafioCarrinho

Projeto para criação de RESTful API para serviço de carrinho de compras

## Equipe

* <a href="mailto:elmon.noronha@gmail.com">Elmon Noronha<a>

## Apresentação da solução

O aplicativo consiste serviço de **__carrinho de compra__**s em arquitetura de **__REST API__**.

Apesar de ser uma solução padrão e simples, optou-se por implementar este projeto como um **_RESTful API server_**, em arquitetura **_Model-View-Controller_** (**_MVC_**), para demonstrar a robustez e a flexibildiade do __framework__  [**_Spring Data REST_**](https://spring.io/projects/spring-data-rest). 
 
As tecnologias selecionadas, portanto, foram:

* **__Java__** versão 11;
* __frameworks__ **__Spring Data REST__** e **__Spring Data JPA__**;
* e base de dados embutida [**__Apache Derby__**](http://db.apache.org/derby/).

A escolha do __framework__ __Spring Data REST__ deveu-se, principalmente, pela facilidade de criar serviços __CRUD__, automaticamente a partir dos modelos e da interface <code>CrudRepository</code>. 

## Pré-requisitos

* <code>Java >= 11</code>;
* <code>Gradle >= 6</code>;
* <code>[cURL](https://curl.haxx.se/)</code> ou outra ferramenta de teste de REST APIs.

## Utilização

### Banco de Dados

Apenas é necessário o Java (versão >=9) instalado para utilização do Apache Derby. Porém, como, neste projeto, foi slecionada sua versão __embedded__, não é necessário nenhum __setup__ de ambiente. 

### Aplicação

Serão listadas aqui as possíveis interações com o aplicativo via <code>cURL</code>, mas seria factível também a utilização de _web browsers_ ou outras ferramentas de desenvolvimento _Web_, conforme mencionado acima.

#### Iniciar aplicação

Como anteriormente disposto, é necessária a utilização de um **_Java Runtime Environment_** a partir da versão **_11_**, visto que o serviço está "empacotado" como um arquivo <code>jar</code> a ser executado de forma _standalone_.

A melhor e mais segura maneira de executar o serviço de forma encapsulada, sem preocupação com dependências e __classpaths__, é através do utilitário Gradle, como segue.

Após seu download, o pacote <code>jar</code> acima deve executado como:

    ./gradlew buildRun
    
O serviço estará disponível no endereço `http://localhost:8080/api` 

#### Cadastrar cupom (com código e % de desconto)

    curl -vX POST -H "Content-type: application/json" -d '{"codigo": "sextou", "desconto": "20"}' http://localhost:8080/api/cupom

#### Listar todos os cupons cadastrados

	curl -vX GET http://localhost:8080/api/cupom

#### Deletar um cupom específico
    
    curl -vX DELETE http://localhost:8080/api/cupom/1

#### Atualizar um cupom específico

    curl -vX PUT -H "Content-type: application/json" -d '{"desconto": "30"}' http://localhost:8080/api/cupom/1
    
#### Cadastrar produto (com nome e preço)

    curl -vX POST -H "Content-type: application/json" -d '{"nome": "Detergente Ypê", "preco": "1.49"}' http://localhost:8080/api/produto

#### Listar todos os produtos cadastrados

	curl -vX GET http://localhost:8080/api/produto

#### Deletar um produto específico
    
    curl -vX DELETE http://localhost:8080/api/produto/1

#### Atualizar um produto específico

    curl -vX PUT -H "Content-type: application/json" -d '{"preco": "2.49"}' http://localhost:8080/api/produto/1

#### Criar carrinho de compras vazio

    curl -vX POST -H "Content-type: application/json" -d '{}' http://localhost:8080/api/carrinho
    
#### Listar carrinhos de compras cadastrados

    curl -vX GET http://localhost:8080/api/carrinho
    
#### Listar produtos de um carrinho específico

    curl -vX GET http://localhost:8080/api/carrinho/1/produtos

## Limitações

* Algumas funcionalidades sugeridas não foram implementadas. 

## Melhorias futuras

* Desenvolver testes unitários.
* Atenticação com __Spring Security__.
* Particionar __endpoints__ de acordo com funcionalidade, com o intuito de torná-los entradas para microsserviços de produtos, cupons etc.
* Utilização de base de dados __standalone__, sem descartar o Apache Derby.
* Inclusão do serviço __Swagger__ para guiar definição da API e __endpoints__

## Bugs

* Em breve...

## Licença

Copyright © 2020 Elmon Noronha

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
