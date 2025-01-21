public class spynumber{
public static void main(String[ ] args){
int num=1124;
int sum=0;
int temp=sum;
int product=1;
int dig=0;
while(num!=0){
dig=num%10;
sum=sum+dig;
product=product*dig;
num=num/10;
}
if(sum==product){
System.out.println("is a spy number");
}
else{
System.out.println("is not a spy number");
}
}
}