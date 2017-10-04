import java.io.*;
import java.util.Scanner;
public class Cdd
{
public static void main(String[] args)
{
	Map m1 = new HashMap();
{
	for(int i=0;i<5;i++)
	{
	Scanner s=new Scanner(System.in);
	String param=s.next();
	System.out.println("th param 1"+ param);
	Scanner s1=new Scanner(System.in);
	int value=s1.nextInt();
	System.out.println("seco "+ value);
	m1.put(param,value);
	System.out.println("m1 is" + m1);
}
}
}}