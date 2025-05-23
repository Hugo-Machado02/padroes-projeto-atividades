# 5 - Principio da Inversão de Dependências

## Forma errada
O erro encotrado se trata-se do seguinte:
- A classe Notificador (alto nível) está diretamente ligada à classe concreta EmailService (baixo nível), trazendo um Acoplamento Forte e Dependência Direta.
- Se, depois de um tempo, precisarmos mudar o método de notificação de e-mail para SMS, ou qualquer outro, teremos que modificar a classe Notificador.
- Isso viola o princípio, pois a classe de alto nível não deveria serrado por uma mudança em um detalhe de baixo nível

## Forma Correta
Alterações realizadas para não ferir a Responsabilidade Unica:
- Criamos então uma interface Mensageiro que define o contrato para qualquer serviço que possa "enviar" uma mensagem.
- Esta é a abstração que ambas as Classes, de alto e baixo nível, irão depender;
- Com isso, as classes de baixo nível (EmailService, SMSService) implementam a abstração Mensageiro.
- A classe Notificador agora recebe uma instância de Mensageiro através de seu construtor, indicnado que o Notificador não cria a dependência; ela é fornecida a ele;
- Com isso o Notificador depende da abstração, e não de um detalhe concreto.

#  :bulb: UML - Forma errada :bulb:
![2º Atividade - Aula 3 - 5 1 - Errado](https://github.com/user-attachments/assets/6ce2fd60-2e2a-46d3-ab4e-5ed21b37d5ea)

#  :bulb: UML - Forma Correta :bulb:
![2º Atividade - Aula 3 - 5 2 - Correto](https://github.com/user-attachments/assets/3f631e06-9554-461d-a67f-9f26bc6bc709)
