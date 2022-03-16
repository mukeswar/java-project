import java.util.*;
class EMAIL{
void email(){
string name;
char c;
Scanner input = New Scanner(System.in);
System.out.ptintln("Enter an email: ");
name = input.next();
System.out.println("Enter a character: ");

String s = input.next();
c=s.charAt(0);
if(name.contains ("@")&&name.contains(".")){
System.out.println(name+ "is a valid Email.");
}

}

System.out.println("name + "is an invalid Email");

}
