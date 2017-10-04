package pack;
public class d implements Drawble
{
public void Rect()
{
System.out.println("drawing reactangle");
}
public void Circle()
{
System.out.println("drawing circle");
}
}
public static void main(String args[])
{
pack p = new d();
p.Rect();
p.Circle();
}
