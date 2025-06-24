# 🚀 Parte 2 - Proxy 🚀

O padrão Proxy é um padrão estrutural que oferece um substituto ou representante para outro objeto com o objetivo de controlar o acesso a ele. Esse controle pode incluir inicialização preguiçosa (lazy loading), controle de permissões, cache de resultados ou registro de operações, sem que o cliente perceba qualquer diferença no uso do objeto.

O Proxy implementa a mesma interface do objeto real, sendo transparente para o cliente, que não precisa saber se está interagindo com o objeto real ou com o proxy. Ele decide quando criar ou delegar o trabalho ao objeto real. Um exemplo prático é o cartão de crédito, que funciona como um proxy do dinheiro no banco: permite fazer compras sem carregar o dinheiro físico, mas cumpre a mesma função.

O Padrão Proxy permite incluir funcionalidades extras como controle de acesso, cache de resultados ou registro de operações, sem precisar modificar o código do objeto real. Porém, o uso desse padrão pode deixar o sistema mais complexo e, dependendo da situação, gerar pequenos atrasos na resposta do serviço real..

#  :bulb: UML - Proxy :bulb:
![2º - Proxy - Trabalho Final](https://github.com/user-attachments/assets/c267a969-53ee-47fe-9752-4bd2efc1a8c6)
