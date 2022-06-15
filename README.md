

# Case técnico - Qa








## Authors

- [@andersonmwati](https://www.github.com/andersonmwati)




Pergunta numero 1:

## Dado esse cenário, como você iniciaria uma estratégia de teste?

Antes mesmo de começar o desenvolvimento do incremento da sprint, vou atua em todo o planejamento do que será desenvolvido. Nessa etapa eu posso auxiliar o P.O. a:

Identificar pontos de atenção nos requisitos levantados que precisam ser mais detalhados;
Identificação prévia dos possíveis cenários de testes;
Apoio na definição dos critérios de aceite,  ajudando a escrever o que precisa ser atingido para atender os requisitos.

## Quais abordagens de teste você consideraria?

* observar o comportamento interno (teste caixa branca)
*  apenas o comportamento externo (teste caixa preta)
* processo para depurar aplicativos de software, fazendo uma entrada pelo front-end e verificando os dados no back-end. (Teste de caixa-cinza)

## Como você trabalharia com diferentes tipos/níveis de teste?






eu vou seguir esse etapa para chegar no resultado esperado
* Teste de Componentes(juntos com programdor)
* Integração
* Teste de Sistema
* Teste de Aceitação
* Teste Funcional










## Quais ferramentas você consideraria usar?

Depende das demandas... Eu usou eclipse muitas vez TESTNG e JUNIT para automatizar,
Jmeter,testproject,Appium,Lambdatest,triggerTest...etc

 ### Como você se imagina atuando nessa equipe?

 Eu vejo o lado que me motivou de entrar na essa area de qualidade quero Dizer:
 * foco no resultado 
 * não  deixo passar nada 
 * Eu me vejo Pró-ativo
 * sempre procuro sugerir melhorias 
 * sempre respeito mes colegas e meus superiores 
 * sempre trazer Relatório
 * sempre seguir o fluxo apresentado pelo o supervisor do projeto  


Pergunta numero 2:

 #                     Teste automatizado

 ### * Esta primeira parte do desafio, consiste na automação de uma interface web, o foco deste desafio é sua habilidade com seletores:

 
Eu usei uma ferramenta de teste de JAVA/MAVEN/TESTNG. no fim dos teste gera um Relatório HTML eu coloquei usando uma ferramenta : ExtentReport

### * 2 A segunda parte do desafio, consiste em criar alguns cenários automatizados para uma API.
 
 Eu usei uma ferramenta de teste TESTNG ai eu coloquei as dependencia da Rest-assured.










## INSTALAR
### tem dois possibilidades para rodar esses Testes


Pode clonar esse projeto ou baixar o zip, na comand line abri a pasta e depois abri o console ou terminal, manda esses comand:

```bash
  mvn clean
  mvn test
```
    
## Oque Precisa Estar installando em seu computador

- JavaJdk jre (qualquer Versão)
- maven installado 
- drivers(mas não Precisa esse teste tem um codigo que buid driver sozinho)

## INSTALL ECLIPSE

### Esse Script foi creado com ECLIPSE IDE.
aqui está passo a passo:

```bash
  baixar ECLIPSE IDE 
  install 
```

depois vai na Helps depois ECLIPSE Marketplace digita

```bash
  TestNg
  search depois install
  ele vai te pedir restart aceita 
```
 depois vai no  import projeto:

```bash
  File
  import
```








































## Importante 

o teste cria um Relatorio Html vai aparecer na pasta do projeto depois de rodar

esse teste roda um File:`TestNG.xml` é onde fica os executable do teste

aqui está a composição das pasta : 
`src\test\java\com\automacao\test\paranabanco\desafio`: teste funcional
`src\test\java\com\automacao\test\paranabanco\report` :configuração dos testes e relatório configuração
`\automacaodesafio\testng.xml` : executable teste

 `code of conduct`.



## MUITO OBRIGADO
