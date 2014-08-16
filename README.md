
instrutor mauricio.aniche@caelum.com.br

= Vender o peixe =

* http://s3-sa-east-1.amazonaws.com/tdd-site/feedback.png

* você sempre testa seu código
o tempo para testar é o mesmo do que criar o teste aut.
mas depois é o computador que testa

= Escolher o que testar =

* conceito de classe de equivalência

pensar nos cenârios e não fazer testes equivalentes

* se tem vontade de testar método privado, refatora e coloca como público
em nova classe (obs: não concordo)

* não se testa código privado

= montar cenârio é a parte que deve(??) consumir mais tempo =

* criar Builders que ajudem a criar objetos para os seus cenários
evitando passar argumentos requeridos mas que não variam o cenário

= escolher o que teste iniciar a implementar =

= TDD =

* mais simples primeiro, pensar no teste primeiro
* criar classe teste, não compila
* criar classe testada, não passa do teste
* retornar valores fixos na classe testada, ou código simpls, só para que
o teste passe (obs: porque implementar a classe mal??)
* continue implementando testes, depois pensa na classe testada
* adicione outro teste, outra funcionalidade
* faça o teste passar
* continui até garantir todas as funcionalidades

* a proposta é pensar na api da classe ao invés do comportamento completo
a pregueça nesse sentido vira sua aliada
ser simples é a principal vantagem (obs: compicaaaado pensar que o
comportamento completo da classe de domínio vira em segundo plano, e sem
análise)
obs, ou não, testando as regras de negócio por exemplo implica que alguém
tenha criado o que pode escolher, implementado o teste, é a implementação
dos algoritmos, não é preciso exagerar e inventar métodos na hora de
criar o teste, eu acho...
* foco no problema, a implementação vem depois
* cadéncia: requisito => implementação => refatoração
* teste é documentação do utilizo dos métodos 