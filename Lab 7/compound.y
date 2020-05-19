%{
    #include<stdio.h>
    extern int yylex();
    extern int yywrap();
    extern int yyparse();
%}

%token WH IF OP CP CMP SC ASG ID NUM OPR

%%
start: swh | sif;
swh: WH OP cmpn CP stmt             {printf("VALID SINGLE STATEMENT WHILE\n");}
sif: IF OP cmpn CP stmt             {printf("VALID SINGLE STATEMENT IF\n");}
cmpn: ID CMP ID | ID CMP NUM;
stlst:stmt stlst | stmt;
stmt: ID ASG ID OPR ID SC | ID ASG ID OPR NUM SC
      | start                                   {printf("NESTED INSIDE A");}
      ;

%%
int yyerror(char *str)
{
    printf("%s",str);
}
int main()
{
    yyparse();
}