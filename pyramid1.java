public class pyramid1{
public static void main(String[ ] args){
int n=5;
for(int r =1;r<=5;r++){
for(int sp=1;sp<=n-r;sp++){
System.out.print(" "+" ");
}
for(int st=1;st<=(2*r)-1;st++){
System.out.print("*"+" ");
}
System.out.println();
}
}
}