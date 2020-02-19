grammar SimpleExample;

greeting: Hello Name Bang ;

// TOKENS
Hello:	'Hello' ;
Bang:	'!' ;
Name:   [A-Z][a-z]* ;

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
