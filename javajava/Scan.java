import java.io.*;
import java.util.Scanner;
public class Scan{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String param=s.next();
		System.out.println("th param 1"+param);
		int value=s.nextInt();
		System.out.println("seco "+value);
		s.close();
	}
}