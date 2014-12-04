grammar VanesaFormula;

/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/

expr				: term ;

term				: LPAREN term RPAREN
					| atom
					| function LPAREN term ( COMMA term )* RPAREN
               // ordering is important for correct parsing!
               // pow needs to be right associative for correct parenthesizing
               |<assoc=right> term operator=POW term
               | term operator=DIV term
               | term operator=MULT term
					| term operator=( PLUS | MINUS ) term
					;

atom           : number
               | neg_number
               | variable
               | neg_variable
               ;           

number			: NUMBER ( DOT NUMBER )? ;

neg_number		: LPAREN MINUS number RPAREN ;

variable			: VARIABLE ( INDEX )*;

neg_variable	: LPAREN MINUS variable RPAREN ;

function       : VARIABLE ;

/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/

INDEX    : LODASH ( VARIABLE | NUMBER ) ;

VARIABLE : CHAR ( CHAR | DIGIT )* ;

NUMBER   : ( DIGIT )+ ;

WS       : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

DIGIT    : [0-9] ;

CHAR     : [a-zA-Z] ;

PLUS     : '+' ;
MINUS    : '-' ;
MULT     : '*' ;
DIV      : '/' ;
POW      : '^' ;
LODASH   : '_' ;
LPAREN   : '(' ;
RPAREN   : ')' ;
COMMA    : ',' ;
DOT      : '.' ;