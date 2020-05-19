%{
#include<stdio.h>
%}
%token A B NL

%%
stmt: S NL {printf("valid string\n");
			exit(0);}
S: A S B |
;

%%
int yyerror(char *str)
{
	printf("%s",str);
}
main()
{
	yyparse();
}
