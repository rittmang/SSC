%{
    #include<stdio.h>
    #include<stdlib.h>
    #include "y.tab.h"
    int yyerror();
    extern int yylval;
%}

%%

[0-9]+         {
                    yylval = atoi(yytext);
                    return(INTEGER);
                }

[-+()=/*\n] {return *yytext;}
[ \t]   ;

. yyerror();
%%

int yywrap(void)
{
    return 1;
}