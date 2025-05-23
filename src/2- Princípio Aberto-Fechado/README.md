# Principio Aberto-Fechado

## Forma errada
O erro encotrado se trata-se do seguinte:
- Na classe conta, a cada vez que colocarmos uma nova extenção, como por exemplo, um novo tipo de conta, teremos que mexer em seu código;
- Seguinto o Princípio Aberto-Fechado, a aplicação não deve receber alteracões em códigos prontos assim.

## Forma Correta
Alterações realizadas para não ferir o principio Aberto-Fechado:
- Criamos então uma classe abstrata, que conterá os métodos essenciais para todas as outras classes;
- conforme forem adicionando novos tipos de contas, basta herdar da classe Conta (abstrata).

#  :bulb: UML - Forma errada :bulb:

#  :bulb: UML - Forma Correta :bulb:
