grammar VanesaFormula;

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

expr				: term ;

term				:
					LPAREN term RPAREN
					| number
					| neg_number
					| variable
					| neg_variable
					// function MULTIPLE ARGUMENTS??
					| variable LPAREN term RPAREN
					// power
					| left=term op=POW right=term
					// multiplicative
					| left=term op=( MULT | DIV ) right=term
					// additive
					| left=term op=( PLUS | MINUS ) right=term
					;

number			: NUMBER ;

neg_number		: LPAREN MINUS NUMBER RPAREN ;

variable			: VARIABLE ;

neg_variable	: LPAREN MINUS VARIABLE RPAREN ;
 
/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/
 
NUMBER   : ( DIGIT )+ ( ( '.' | ',' ) ( DIGIT )+ )? ;

VARIABLE : ( CHAR )+ ;

WS       : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
 
DIGIT    : [0-9] ;

CHAR     : [a-zA-Z_0-9] ;