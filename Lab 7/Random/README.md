a^nb^n language grammar writing

flex anbn1.l
yacc -d anbn1.y ----> generate y.tab.h header file(token value stored) y.tab.c (parser file)
gcc lex.yy.c y.tab.c
./a.out

ab

aabb

aab
