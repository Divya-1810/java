public class alphabetpyramid{
public static void main(String[ ] args){
int n=4;
char ch='A';
for(int r=1;r<=n;r++){
for(int sp=1;sp<=n-r;sp++){
System.out.print(" "+" ");
}
for(int st=1;st<=(2*r)-1;st++){
System.out.print(ch+" ");
ch++;
}
System.out.println( );
}
}
}