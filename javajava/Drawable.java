interface Drawble{
void draw();
}
class Rect implements Drawble
{
public void draw()
{
System.out.println("drawing reactangle");
}
class Circle implements Drawble
{
public void draw()
{
System.out.println("drawing circle");
}
}
public class Testinterface
{
public static void main(String args[])
{
Drawable d=new circle();
d.draw();
}
}}