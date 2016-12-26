import java.util.Scanner;
import java.lang.String;
class bool
{
public static void main(String[] args)
{
String s1,s2;
boolean same;
Scanner obj=new Scanner(System.in);
s1=obj.nextLine();
s2=obj.nextLine();
if(s1.equals(s2))
{
same = true;
}
else
{
same=false;
}
System.out.println(same);
}
}