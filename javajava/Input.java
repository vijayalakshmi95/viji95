import java.io.*;
public class Input
{
public static void main(String args[])
{
String s;
InputStreamReader ir=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(ir);
System.out.println("unix type to exit"+"\n windows type ctrl-z to exit");
try
{
	s=in.readLine();
	while(s!=null)
	{
		System.out.println("read :" + s);
		s=in.readLine();
		
	}
	in.close();
	
}
catch(IOException e)
{
	e.printStackTrace();
}
}
}