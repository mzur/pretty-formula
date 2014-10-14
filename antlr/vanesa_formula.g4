grammar vanesa_formula;

PLUS   : '+' ;
MINUS  : '-' ;
MULT   : '*' ;
DIV    : '/' ;
POW    : '^' ;
LPAREN : '(' ;
RPAREN : ')' ;
 
/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/

expr     : term ;

term     : factor ( ( PLUS | MINUS ) factor )* ;
 
factor   : power ( ( MULT | DIV ) power )* ;

power    : atom ( POW atom )* ;
 
atom     : number
	| variable
	| LPAREN term RPAREN;

number   : NUMBER
	| LPAREN MINUS NUMBER RPAREN ;

variable : VARIABLE
	| LPAREN MINUS VARIABLE RPAREN ;
 
/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/
 
NUMBER   : ( DIGIT )+ ( '.' ( DIGIT )+ )? ;

VARIABLE : ( CHAR )+ ;

WS       : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
 
DIGIT    : [0-9] ;

CHAR     : [a-zA-Z_] ;