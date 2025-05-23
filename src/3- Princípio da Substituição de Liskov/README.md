# Principio da Substituição de Liskov

## Forma errada
O erro encotrado se trata-se do seguinte:
- O erro aqui se trata da quebra de contratos e expectativas. A classe Triangulo permite que sua largura e altura sejam definidas independentemente. Ou seja, se você chamar setLargura(5) e depois setAltura(10), um objeto Triangulo terá largura 5 e altura 10, com área 50.
- Isso quebra o Princípio da Substituição de Liskov porque, se eu tentar usar um Quadrado no lugar de um Triângulo (que é a classe pai), o programa pode funcionar de forma errada ou inesperada. Isso acontece porque o Triângulo foi pensado para ter dimensões independentes, e o Quadrado não segue essa ideia.

- ## Forma Correta
Alterações realizadas para não ferir o princípio da Substituição de Liskov:
- Em vez de fazer Quadrado herdar de Triangula, criamos uma interface Forma que define apenas o comportamento;
- Dessa forna, o Retangulo implementa Forma e gerencia sua largura e altura de forma independente, como esperado.
- Quadrado também implementa Forma, mas gerencia apenas seu lado. Não possui setters para largura e altura que poderiam levar a um comportamento inconsistente se fosse um subtipo de Retangulo.

#  :bulb: UML - Forma errada :bulb:

#  :bulb: UML - Forma Correta :bulb:
