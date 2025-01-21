public class diamondpyramid{
public static void main(String[ ] args){
int n=5;
for(int r =1;r<=n;r++){
for(int sp=1;sp<=n-r;sp++){
System.out.print(" ");
}
for(int st=1;st<=(2*r)-1;st++){
System.out.print("*");
}
System.out.println();
}
for(int r =n-1; r>=1;r--){
for(int sp=1;sp<=n-r;sp++){
System.out.print(" ");
}
}
}
}