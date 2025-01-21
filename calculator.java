public class calculator
{
public static void main(String[ ] args)
{
int num1=10,num2=20,result;
char operator ='+';
switch(operator)
{
case '+':
result = num1+num2;
break;
case '-':
result = num1-num2;
break;
case '*':
result = num1*num2;
break;
case '/':
result = num1/num2;
break;
case '%':
result=num1%num2;
break;
default:
System.out.println("invalid operator");
return;
}
System.out.println ( "result:"+result);
}
}





