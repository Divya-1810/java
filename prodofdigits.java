public class prodofdigits
{
public static void main(String [ ] args)
{
int number=1234,digit,prod=1;
while(number!=0){
digit=number%10;
prod=prod*digit;
number=number/10;
}
System.out.println(prod);
}
}

