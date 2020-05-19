Design calculator using lex and yacc
Lex files supplies tokens
yylval is variable of y file
yytext stores the value input

program: program statemet (augmented grammar)
%left '+' '-'
%left '*' '/' - left precedence in written order
%right - right associativity
%noassoc


Commands:
$ flex calculator.l
$ yacc -d calculator.y
$ gcc lex.yy.c y.tab.c
$ ./a.out
2+3

2-3

2+4

2+4*2

2

(2+4)

(2+8)*2