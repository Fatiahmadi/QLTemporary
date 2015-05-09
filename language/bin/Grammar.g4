grammar Grammar;


LOWERCASE : [a-z]; 
UPPERCASE :  [A-Z]; 
DIGIT : [0-9];

ID : (LOWERCASE | UPPERCASE) (LOWERCASE | UPPERCASE | DIGIT )*;
variable : ID;

INT : DIGIT+; // check how to implement minus sign




BOOLEANLITERAL
    :   'true'
    |   'false'
    ;
    
ASSIGN          : '=';
QUESTION        : '?';
INC             : '++';
DEC             : '--';
SUB             : '-';

DOULEQUOTE : '"';
NEWLINE  : [\r\n]+ ;
COLON : ':';
SLASH: '/';

expression :
    literal                                             #LITExpr
    |   expression op='&&' expression                       #ANDExpr
    |   expression op='||' expression                        #ORExpr
    |   expression op=('>='|'=<'|'>' |'<' ) expression      #COMPExpr
    |   expression op=('==' |'!=') expression        #EQUALExpr
    |   expression op=('*' |'/'|'%') expression         #MULDIVExpr 
    |   expression op=('+' | '-') expression               #ADDSUBExpr
    |   ('(' expression ')')                             #PARExpr
    ; 


myexpr : (expression NEWLINE)*;

literal :
    | 	INT 
    |   variable                   
	|   BOOLEANLITERAL      
    ;	
prog: (questionnaire  NEWLINE*)*;
questionnaire : 'form'  variable '{' ( ifquestionlist|nonifquestionlist) *'}';
nonifquestionlist : ( question)+ ;

ifquestionlist : 'if'  '('  variable  ')'   '{' ( question NEWLINE*)+  '}';
 ifnested : (ifquestionlist)+;
question :  variable  ':'  questionStatement  type ;

questionStatement 
       : STRING ;
type : primitiveType;

primitiveType : 
            'boolean'
        |   'string'
        |   'integer'
        ;
STRING : '"' ( '\\' [\\"] | ~[\\"\r\n] )* '"';
        
WS  :  [ \t\r\n]+ -> skip;

COMMENT
    :   '/*' .*? '*/' -> skip
    ;