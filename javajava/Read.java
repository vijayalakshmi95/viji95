import java.io.*;
public class Read
{
public static void main(String[] args)
{
	File file = new File(args[0]);
try
{

BufferedReader in= new BufferedReader(new FileReader(file));
String s;
s=in.readLine();
while(s!=null)
{
	System.out.println("read" + s);
	s=in.readLine();
}
in.close();
}
catch(FileNotFoundException e1)
{
	System.err.println("file not found" + file);
	
}
catch(IOException e2)
{
e2.printStackTrace();
}
}
}
