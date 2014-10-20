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

expr				: additive ;

additive			: multiplicative ( ( PLUS | MINUS ) multiplicative )* ;

multiplicative	: power ( ( MULT | DIV ) power )* ;

power				: function ( POW function )* ;

// MULTIPLE ARGUMENTS??
function			: atom
					| variable LPAREN atom RPAREN ;
 
atom				: number
					| neg_number
					| variable
					| neg_variable
					| LPAREN additive RPAREN;

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