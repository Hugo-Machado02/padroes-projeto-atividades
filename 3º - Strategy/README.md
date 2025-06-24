# 🚀 Parte 3 - Strategy 🚀

O padrão Strategy é um padrão comportamental que permite definir uma família de algoritmos, encapsulá-los em classes separadas e torná-los intercambiáveis dentro de um mesmo contexto. Isso permite que o comportamento de um objeto possa ser alterado em tempo de execução, sem necessidade de modificar sua estrutura interna.

Esse padrão é ideal quando existe a necessidade de alternar entre diferentes formas de executar uma tarefa. Por exemplo, em um aplicativo de navegação, podem existir estratégias diferentes de cálculo de rotas: a pé, de carro, de bicicleta ou transporte público. Cada uma dessas formas é representada por uma estratégia específica, enquanto a classe principal (chamada Contexto) apenas delega a execução para a estratégia escolhida, sem saber os detalhes de sua implementação.

A estrutura do padrão envolve a Interface Strategy que é comum a todas as estratégias e define o método que será utilizado, as Concrete Strategies que fazem as implementações específicas dos algoritmos e o contexto que mantém a referência para uma estratégia e a utiliza para realizar a tarefa desejada.

O Padrão Strategy pode proporcionar flexibilidade e facilitar a adição de novas variações de comportamento sem impactar o código existente. Entretanto, pode aumentar o número de classes no sistema e exigir que o cliente conheça bem as estratégias disponíveis para selecionar a mais apropriada.

#  :bulb: UML - Strategy :bulb:
![3º - Strategy - Trabalho Final](https://github.com/user-attachments/assets/6c5446d4-b96a-4573-8bc4-cf416050fd37)
