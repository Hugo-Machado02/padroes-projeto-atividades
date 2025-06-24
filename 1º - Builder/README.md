# 🚀 Parte 1 - Builder 🚀

O padrão Builder pertence à categoria dos padrões criacionais e tem como principal objetivo facilitar a construção de objetos complexos. Ele permite criar um objeto passo a passo, separando o processo de construção da representação final. Esse padrão evita o uso de construtores com muitos parâmetros (conhecidos como "construtores telescópicos"), tornando o código mais claro, organizado e fácil de manter.

Um exemplo clássico é o caso da construção de uma casa. Dependendo da necessidade, essa casa pode ter diferentes características, como piscina, garagem, jardim ou aquecimento. Com o Builder, é possível montar o objeto especificando apenas as partes desejadas, sem a obrigatoriedade de preencher parâmetros desnecessários.

A estrutura do padrão envolve três elementos principais:
- Builder: Define as etapas de construção do objeto.
- Produto: O objeto complexo a ser construído.
- Diretor (opcional): Controla a ordem de execução das etapas de construção.

O Padrão Builder pode torna o código mais flexível, organizado e reutilizável, pois separa o processo de construção da lógica de negócio. Em contrapartida, pode aumentar a complexidade do sistema, devido à necessidade de criar múltiplas classes auxiliares.

#  :bulb: UML - Builder :bulb:
![1º - Builder - Trabalho Final](https://github.com/user-attachments/assets/ce50dd68-3ba1-4827-bf78-62a5af29c65c)
