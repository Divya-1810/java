class character { 
public static void main(String[] args) { 
char ch='b'; 
if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) { 
System.out.println("This is an alphabet."); 
} 
else if(ch>='0' && ch<='9') { 
System.out.println("This is a digit."); 
}
else { 
System.out.println("This is a special character."); 
} } }