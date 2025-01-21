public class digitpower{
public static void main(String[ ] args){
int num=121;
int sum=0;
String numlen=String.valueOf(num);
int count=numlen.length();
while(num>0){
int dig=num%10;
sum=sum+(int)Math.pow(dig,count);
num=num/10;
}
System.out.println(sum);
}
}