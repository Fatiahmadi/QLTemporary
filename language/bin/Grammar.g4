grammar Grammar;


LOWERCASE : [a-z]; 
UPPERCASE :  [A-Z]; 
DIGIT : [0-9];

ID : (LOWERCASE | UPPERCASE) (LOWERCASE | UPPERCASE | DIGIT )*;
variable : ID;

INT : DIGIT+; // check how to implement minus sign

IFTAG : 'if';


BOOLEANLITERAL
    :   'true'
    |   'false'
    ;
    



ASSIGN          : '=';
GT              : '>';
LT              : '<';
BANG            : '!';
TILDE           : '~';
QUESTION        : '?';
EQUAL           : '==';
LE              : '<=';
GE              : '>=';
NOTEQUAL        : '!=';
AND             : '&&';
OR              : '||';
INC             : '++';
DEC             : '--';
ADD             : '+';
SUB             : '-';
MUL             : '*';
DIV             : '/';
BITAND          : '&';
BITOR           : '|';
CARET           : '^';
MOD             : '%';
SINGLEQUOTE     : '\'';

DOULEQUOTE : '"';
NEWLINE  : [\r\n]+ ;
COLON : ':';
SLASH: '/';

expression :
    literal                                             #LITExpr
    |   expression op=AND expression                       #ANDExpr
    |   expression op=OR expression                        #ORExpr
    |   expression op=(GE | LE | GT | LT ) expression      #COMPExpr
    |   expression op=(EQUAL | NOTEQUAL) expression        #EQUALExpr
    |   expression op=(MUL | DIV | MOD) expression         #MULDIVExpr 
    |   expression op=(ADD | SUB) expression               #ADDSUBExpr
    |   ('(' expression ')')                             #PARExpr
    ; 


myexpr : (expression NEWLINE)*;

literal :
    | 	INT            
	|   variable        
	|   BOOLEANLITERAL      
    ;	

prog: (questionnaire  NEWLINE*)*;


questionnaire : 'form'  variable '{'  questions  '}';
questions: '('nonifquestionlist | ifquestionlist')'*;

nonifquestionlist : questionlist;

questionlist : ( question )+;


ifquestionlist : IFTAG  '('  variable  ')'   '{'  questionlist  '}';

question :  variable  ':'  questionStatement  type;

STRING : '"' ( '\\' [\\"] | ~[\\"\r\n] )* '"';

questionStatement 
       : STRING ;

type : primitiveType (' (' expression ')')?  ;

primitiveType : PRIMITIVETYPE;

   
PRIMITIVETYPE :   
            'boolean'
        |   'string'
        |   'integer'
        ;
        
WS  :  [ \t\r\n]+ -> skip;


COMMENT
    :   '/*' .*? '*/' -> skip
    ;