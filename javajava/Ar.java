import java.util.*;
public class Ar
{
public static void main(String[] args)
{
List a1 =new ArrayList();
a1.add("amaz");
a1.add("lana");
System.out.println("Araay list");
System.out.println("\t "+ a1);

List a2 =new ArrayList();
a2.add("huh");
a2.add("ks");
System.out.println("Araay list");
System.out.println("\t "+ a2);

Map m1 = new HashMap();
m1.put(a1.get(0),a2.get(0));
System.out.println("dsdf" + m1);
}

}

