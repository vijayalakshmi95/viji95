class class1
{
public int a=10,b=30;int c;
void sum()
{

c=a+b;
}
}
class class2 extends class1
{
String name="viji";
void show()
{
System.out.println("the name of the student is" + name);
System.out.println("the mark of the student is " + c);
}
}
class class3 extends class2
{
void display()
{
sum();
show();
}
}
public class Cl
{
public static void main(String args[])
{
class3 n=new class3();
n.display();
}}
