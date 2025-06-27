# 🚀 13º Atividade - Aula 13 🚀
Atividade Referente a Aula 13 de Padrões de Projetos

- [clique aqui](https://github.com/Hugo-Machado02/padroes-projeto-atividades/tree/13º-Atividade-Aula-13/src) para poder ir ao repositório!

# :bulb: Padrão Observer :bulb:
O padrão Observer é utilizado quando um objeto precisa notificar automaticamente múltiplos outros objetos sobre mudanças no seu estado.
Um Subject (sujeito) mantém a lista de objetos Observer (observadores), para que, quando algo acontece, o Subject chama um método dos Observers para avisar sobre essa mudança.

# :bulb: Explicação do Código :bulb:
Esse código faz a represetnação de notificar um usuário de acordo com o gênero que o mesmo prefira.
Com isso, temos as interfaces Subject e Obserser. Onde a subject, que terá os métodos que serão implementados pela Classe Plataforma, a o Observer terá o método de notificação que será implementado pela classe usuário.
A classe Plataforma será a responsável por adicionar novos conteúdos, e terá os métodos para que o usuário possa se inscrever nos filmes que deseja ser notificado.

#  :bulb: UML do Código :bulb:
![13º Atividade - Aula 13](https://github.com/user-attachments/assets/269b2d8c-abdf-4b78-9442-9fb8e153ffb8)
