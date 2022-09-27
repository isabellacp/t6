grammar LittleTwine;

@lexer::members {void erroLexico(String msg) { throw new ParseCancellationException(msg); }}

// algarismos para usar de forma mais facil
fragment ALGARISMO : '0'..'9';

// letra pra usar de forma mais facil
fragment LETRA: [a-zA-Z];

// identificadores
IDENT: (LETRA|'_') ('_'|ALGARISMO|LETRA)*;

// cadeias
CADEIA : '"' ~('\n' | '\r' | '"')* '"';

CADEIA_CONTEUDO : ~('@' | '(' | ')' | '#' | '-' | '>')*;

ENDL:  ([\n] | [\t] | [\r]);
// O corpo do codigo consiste em statements
body: statement*;

id: '('IDENT')';
// cada statement é um header #(id) e um conteudo.
statement: header content;
// id_reference é uma referencia a um statement. Essa regra também permite usarmos apelidos para os ids
id_reference: '@' '('CADEIA_CONTEUDO'->'IDENT')';
header: '#' id;
content: (CADEIA_CONTEUDO | id_reference)*;
