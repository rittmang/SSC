%{
    #include<stdio.h>
    #include<stdlib.h>
    #include "y.tab.h"
    extern int yyerror(char *str);
    extern int yyparse();
%}

%%

"while" return WH;
"if" return IF;
"(" return OP;
")" return CP;
"<" |
">" |
"<=" |
">=" |
"==" |
"!=" return CMP;
"+" |
"-" |
"*" |
"/" return OPR;
"=" return ASG;
([a-zA-Z])("_"|[a-zA-Z0-9])*return ID;
[0-9]+ return NUM;
";" return SC;
" " {}

%%

int yywrap()
{
    return 1;
}