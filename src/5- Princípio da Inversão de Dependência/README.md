# Principio da Inversão de Dependências

## Forma errada
O erro encotrado se trata-se do seguinte:
- A classe Notificador (alto nível) está diretamente ligada à classe concreta EmailService (baixo nível), trazendo um Acoplamento Forte e Dependência Direta.
- Se, depois de um tempo, precisarmos mudar o método de notificação de e-mail para SMS, ou qualquer outro, teremos que modificar a classe Notificador.
- Isso viola o princípio, pois a classe de alto nível não deveria serrado por uma mudança em um detalhe de baixo nível

- ## Forma Correta
Alterações realizadas para não ferir a Responsabilidade Unica:
- Criamos então uma interface Mensageiro que define o contrato para qualquer serviço que possa "enviar" uma mensagem.
- Esta é a abstração que ambas as Classes, de alto e baixo nível, irão depender;
- Com isso, as classes de baixo nível (EmailService, SMSService) implementam a abstração Mensageiro.
- A classe Notificador agora recebe uma instância de Mensageiro através de seu construtor, indicnado que o Notificador não cria a dependência; ela é fornecida a ele;
- Com isso o Notificador depende da abstração, e não de um detalhe concreto.

#  :bulb: UML - Forma errada :bulb:

#  :bulb: UML - Forma Correta :bulb:
