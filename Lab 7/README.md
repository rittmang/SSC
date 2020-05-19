Given any loop statement is it correct or not?

WH = while
OP = opening parentheses
cmpn = condition??
CP = closing parentheses
stmt = statement
SC = semicolon
ASG = assignment (=)

start = starting symbol

flex compound.l
yacc -d compound.y
gcc lex.yy.c compound.tab.c
./a.out

while (a<b) a=a+v;

if (a<5) a=c+15;