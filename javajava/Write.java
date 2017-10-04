import java.io.*;
public class Write
{
public static void main(String[] args)
{
File file=new File(args[0]);
try
{
	
InputStreamReader is = new InputStreamReader(System.in);
BufferedReader in = new BufferedReader(is);
PrintWriter out = new PrintWriter(new FileWriter(file));
String s;
System.out.print(" enetre the text");
System.out.println("type ctrl-d to stop");
while((s=in.readLine())!=null)
{
	out.println(s);
	
}
in.close();
out.close();
}
catch(IOException e)
{
	e.printStackTrace();
}
}
}