# 4 - Principio de Seguregação de Interfaces

## Forma errada
O erro encotrado se trata-se do seguinte:
- Em ambas as classes, FazAntigo e Impressora Comum, estão implementando a interface Funções;
- ao implementar dessa interface, as classes também, acabam implementando todos os seus métodos, mesmo que não o utilize;
- Seguinto o Princípio Aberto-Fechado, a aplicação não deve implementar métodos que não necessita.

## Forma Correta
Alterações realizadas para não ferir a Segregação de Interfaces:
- Criamos 3 interfaces, sendo que cada uma possui sua finalizade específica;
- com isso, agora as classes podem implementar apenas aqueles métodos que necessitam.

#  :bulb: UML - Forma errada :bulb:
![2º Atividade - Aula 3 - 4 1 - Errado](https://github.com/user-attachments/assets/c3ac2c0d-426f-4afa-b264-b16abc39efca)

#  :bulb: UML - Forma Correta :bulb:
![2º Atividade - Aula 3 - 4 2 - Correto](https://github.com/user-attachments/assets/2fcdaa4b-8e28-4d7c-b8df-c7e0f3aadfb4)
