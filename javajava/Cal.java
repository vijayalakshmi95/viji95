class Cal
{
int z;
public void add(int x,int y,int t)
{
z=x+y;
System.out.println("the sum "+z);
}
public void add(int x,int y,int t)
{
z=x-t;
System.out.println("the sub "+z);
}
public class Mycal extends Cal{
public void add(int x,int y,int t)
{
z=t*y;
System.out.println("the mul "+z);
}
}
public static void main(String arg[])
{
int a=10,b=20,c=30;
Mycal demo=new Mycal();
demo.add(a,b);
demo.sub(a,c);
demo.mul(c,b);
}
}
