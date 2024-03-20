# Padrão de Projeto Abstract Factory

Este repositório contém exemplos do padrão de projeto Abstract Factory, desenvolvidos como parte de um seminário na disciplina de Programação Orientada a Objetos, no curso de Bacharelado em Sistemas de Informação.

## Integrantes do Projeto
- Lucas Matheus
- Filipe Zaidan
- Emesson Horácio
- Haul Muller

## Sobre o Padrão de Projeto Abstract Factory

O padrão de projeto Abstract Factory é um padrão de criação que fornece uma interface para criar famílias de objetos relacionados ou dependentes sem especificar suas classes concretas. Isso promove a flexibilidade e a manutenção do código, ao permitir a criação de famílias de objetos sem acoplamento direto às suas implementações concretas.

## Exemplos de Aplicação

### 1. Veículos: Carro e Motocicleta

Neste exemplo, implementamos uma fábrica abstrata para criar diferentes tipos de veículos, como carros e motocicletas.

### 2. Computadores: Notebook e Celular

No segundo exemplo, aplicamos o padrão Abstract Factory para criar uma fábrica abstrata de computadores, que pode produzir diferentes tipos de dispositivos, como notebooks e celulares. Além disso, os computadores podem ser de entrada (mais acessíveis) e de alta qualidade (mais caros).

## Como Utilizar

Cada exemplo contém sua própria implementação e demonstração do padrão de projeto Abstract Factory. Basta explorar os diretórios correspondentes para ver os códigos-fonte e exemplos de uso.

## Vantagens e Desvantagens:
Em resumo, o Abstract Factory é uma ferramenta poderosa para promover a abstração, a consistência e o desacoplamento no design de software, mas é importante pesar suas vantagens e desvantagens em relação aos requisitos específicos do projeto antes de decidir utilizá-lo.

##

### Vantagens:

### 1.1 Abstração de classes concretas:
O Abstract Factory permite definir interfaces para criar famílias de objetos relacionados sem especificar suas classes concretas. Isso promove a abstração e desacopla o código cliente das implementações específicas dos produtos.

### 1.2 Suporte a novos tipos de produtos: 
O padrão facilita a introdução de novos tipos de produtos, pois basta criar novas fábricas concretas que implementem a interface Abstract Factory e produzam os novos produtos desejados.

### 1.3 Consistência entre produtos: 
Como uma fábrica concreta é responsável por criar uma família de produtos relacionados, garante-se que esses produtos sejam compatíveis e consistentes entre si.

### 1.4 Encapsulamento de criação de objetos: 
O padrão encapsula o processo de criação de objetos dentro de uma hierarquia de fábricas, ocultando os detalhes de implementação e tornando o código cliente mais simples e limpo.

### 1.5 Facilita a troca de famílias de produtos: 
Ao utilizar o Abstract Factory, é possível trocar facilmente a família de produtos que está sendo criada pelo código cliente, bastando fornecer uma nova fábrica concreta.
##
### Desvantagens:

### 2.1 Complexidade: 
O uso do Abstract Factory pode introduzir complexidade adicional no código, especialmente quando há várias famílias de produtos e fábricas a serem gerenciadas.

### 2.2 Rigidez na extensão: 
Embora o Abstract Factory facilite a introdução de novos tipos de produtos, pode ser difícil estender a hierarquia de fábricas existente sem modificar o código cliente, o que pode levar à violação do princípio Open/Closed.

### 2.3 Overhead: 
Em algumas situações, o padrão Abstract Factory pode resultar em um overhead adicional devido à necessidade de criar várias classes e interfaces adicionais.

### 2.4 Complexidade de compreensão: 
Para desenvolvedores menos experientes, entender e implementar corretamente o padrão Abstract Factory pode ser desafiador, especialmente quando comparado a abordagens mais simples de criação de objetos.

##

