# Rest API - Fazenda
Rest API desenvolvida com Spring para controle de rebanho.<br>
Objetivo:<br>
Desenvolver uma REST Api para diversos controles de rebanho para fazendeiros. Em geral, os produtores podem ter uma ou mais fazendas, e gostam de separar o gado por grupos(baias).

Em suas fazendas é comum que o rebanho fique separado, e essa divisão é feita principalmente pela idade dos animais.

Trata-se de gado leiteiro. E uma dentre as informações que os produtores precisam são: Árvore Genealógica, peso, raça, produção diária de leite, fazenda e baia. Existe também a possibilidade de a fazenda acomodar animais de outros produtores, nesse caso é preciso saber quais são esses animais, e quanto da produção desse animal será usada como pagamento pela "hospedagem". Também é preciso saber quem é o proprietário do animal.

Por fim, é preciso permitir também um histórico das vacinas de cada animal.

<h1><b>Diagramas</b></h1>

<b>Modelo conceitual</b>
![uml_v1](https://user-images.githubusercontent.com/20268288/197793389-9bab84a9-0ffa-4f76-a6d0-3afad111db4b.PNG)

<h1><b>O que foi feito</b></h1>
Todas as entidades foram criadas.
Endpoint "users" foi criado, com a funcionada de exibir um usuário com informações básicas, usuário e seus bovinos e usuário e suas fazendas.


