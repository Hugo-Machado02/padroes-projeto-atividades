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
![2º Atividade - Aula 3 - 2 1 - Erro](https://github.com/user-attachments/assets/d7ae443c-ce8e-44f6-acec-8a6b32df42d0)

#  :bulb: UML - Forma Correta :bulb:
![2º Atividade - Aula 3 - 2 2 - Correto](https://github.com/user-attachments/assets/4e0f7462-c1bc-4454-9343-8d35c8af078c)
