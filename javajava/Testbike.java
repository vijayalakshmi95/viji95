class Vehical
{

public void move()
{
System.out.println("gixxer");
}
}

class bike extends Vehical{

public void move()
{
System.out.println("my fav bike");
}
}

public class Testbike{

public static void main()

{
Vehical v=new Vehical();
Vehical b=new bike();
v.move();
b.move();
}
}
