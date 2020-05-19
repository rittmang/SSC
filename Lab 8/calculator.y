%{
    void yyerror();
%}

%token INTEGER
%left '+' '-'
%left '*' '/'

%%

program:
    program statement '\n'
    |
    ;

statement: expr {printf("%d\n",$1);}
    ;

expr: INTEGER
    | expr '+' expr { $$ = $1 + $3; }
    | expr '-' expr { $$ = $1 - $3; }
    | expr '*' expr { $$ = $1 * $3; }
    | expr '/' expr { $$ = $1 / $3; }
    | '(' expr ')' { $$ = $2; }
    ;
%%

void yyerror(){

}
int main(void){
    yyparse();
    return 0;
}