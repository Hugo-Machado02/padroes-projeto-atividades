# Principio da Responsabilidade Unica

## Forma errada
O erro encotrado se tratya do seguinte:
- O produto e o calculaDesconto estão Juntos, deixando essa classe então com duas responsabilidades, de gerar o produto e de calcular seu desconto
- Seguindo o princípio da responsábilidade Única, o Desconto deveria possuir uma classe somente dele, deixando o produto somente com a sua única responsabilidade

- ## Forma Correta
Alterações realizadas para não ferir a Responsabilidade Unica:
- O calculaDesconto foi retirado da Classe Produto, deixando-a somente com a responsabilidade de gerar o produto.
- O calculaDesconto então, foi colocado em uma classe só para essa determinada responsabilidade

#  :bulb: UML - Forma errada :bulb:

#  :bulb: UML - Forma Correta :bulb:
