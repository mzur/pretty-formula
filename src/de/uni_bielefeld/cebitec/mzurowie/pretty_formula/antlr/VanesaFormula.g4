grammar VanesaFormula;

PLUS   : '+' ;
MINUS  : '-' ;
MULT   : '*' ;
DIV    : '/' ;
POW    : '^' ;
LODASH : '_' ;
LPAREN : '(' ;
RPAREN : ')' ;
COMMA  : ',' ;

/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/

expr				: term ;

term				: LPAREN term RPAREN
					| atom
					| function LPAREN term ( COMMA term )* RPAREN
               // ordering is important for correct parsing!
               | term operator=POW term
               | term operator=DIV term
               | term operator=MULT term
					| term operator=( PLUS | MINUS ) term
					;

atom           : number
               | neg_number
               | variable
               | neg_variable
               ;           

number			: NUMBER ;

neg_number		: LPAREN MINUS number RPAREN ;

variable			: VARIABLE ( LODASH VARIABLE )*;

neg_variable	: LPAREN MINUS variable RPAREN ;

function       : VARIABLE ;
 
/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/
 
NUMBER   : ( DIGIT )+ ( ( '.' | ',' ) ( DIGIT )+ )? ;

VARIABLE : ( CHAR )+ ;

WS       : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
 
DIGIT    : [0-9] ;

CHAR     : [a-zA-Z0-9] ;