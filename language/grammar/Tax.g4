grammar Tax;

@header {
package org.tax.taxgen;
}
import Common;

prog: (questionnaire NEWLINE*);

//questionnaire : FORMTAG  variable LBRA  (nonifquestionlist | ifquestionlist)*  RBRA;
questionnaire : FORMTAG  variable LBRA  questions  RBRA;
questions: (nonifquestionlist | ifquestionlist)*;

nonifquestionlist : questionlist;

questionlist : ( question )+;

//bracketedquestionlist  : LBRA  questionlist  RBRA;
//ifquestionlist : IFTAG  LPAR  variable  RPAR   bracketedquestionlist;


//bracketedquestionlist  : LBRA  questionlist  RBRA;
ifquestionlist : IFTAG  LPAR  variable  RPAR   LBRA  questionlist  RBRA;

question :  variable  ':'  questionStatement  type;

questionStatement 
       : STRING ;


type : primitiveType  (LPAR expression RPAR)? | enumeration  | range;

primitiveType : PRIMITIVETYPE;

enumeration : LBRA  enumItem   (','  enumItem)*  RBRA ;
enumItem : .*?;

expression : (LPAR .*? RPAR) | .*?;


STRING : '"' ( '\\' [\\"] | ~[\\"\r\n] )* '"';


range :
	INT '..' INT  ;

date :
   DIGIT DIGIT '-' DIGIT DIGIT '-' DIGIT DIGIT
   ;
   
PRIMITIVETYPE :   
            'boolean'
        |   'string'
        |   'integer'
        |   'date'
        |   'decimal'
        |   'money'
        ;
        
FORMTAG : 'form';
IFTAG : 'if';
WS  :  [ \t\r\n]+ -> skip;
COMMENT
    :   '/*' .*? '*/' -> skip
    ;