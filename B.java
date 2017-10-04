class A
{
	public int a =5;
	int b=7;
}
class c extends A
{
	int fun(int b)
	{
		b=6;
		return b;
	}
}
class B 
{
public static void main(String agrs[])
{
B ob=new B();
System.out.println("fdf" + ob.fun(3));
//System.out.println(b);
}
}