# T6 de Compiladores
## Grupo
Nome: Isabella Costa Pires

RA: 726540

## Dependências
- Java 11
- Maven

## Como executar
Realize um mvn clean e mvn package:
```
mvn clean package
java -jar target/t6-1.0-SNAPSHOT-jar-with-dependencies.jar input.txt output.html
```

## Descricao do projeto
O LittleTwine é uma versão em texto do Twine, permitindo que se gere dialogos apenas usando um editor de texto comum.

## Casos de uso
- Integrar o Twine em engines de jogos, como Unity e Godot.
- Criar jogos de dialogo

## Sintaxe e semantica:
O formato padrão é:
```
#(id)
Texto do dialogo com mencões nesse formato: @(titulo do link->id do outro trecho)
```
- IDs seguem regras de nomes de variaveis
- Titulos de links podem ser textos comuns

Cheque os exemplos na pasta "exemplos".


## Video
[video](video.mp4)
