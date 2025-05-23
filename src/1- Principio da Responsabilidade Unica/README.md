# 1 - Principio da Responsabilidade Unica

## Forma errada
O erro encotrado se tratya do seguinte:
- O produto e o calculaDesconto estão Juntos, deixando essa classe então com duas responsabilidades, de gerar o produto e de calcular seu desconto
- Seguindo o princípio da responsábilidade Única, o Desconto deveria possuir uma classe somente dele, deixando o produto somente com a sua única responsabilidade

## Forma Correta
Alterações realizadas para não ferir a Responsabilidade Unica:
- O calculaDesconto foi retirado da Classe Produto, deixando-a somente com a responsabilidade de gerar o produto.
- O calculaDesconto então, foi colocado em uma classe só para essa determinada responsabilidade

#  :bulb: UML - Forma errada :bulb:
![2º Atividade - Aula 3 - 1 1 - Erro](https://github.com/user-attachments/assets/7dffca6c-e3f0-48c8-b74b-e6816b9a6713)

#  :bulb: UML - Forma Correta :bulb:
![2º Atividade - Aula 3 - 1 2 - Correto](https://github.com/user-attachments/assets/b0d0124e-9411-4d3b-90ba-0c53444e8d7f)
