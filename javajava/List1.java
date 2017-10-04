import java.util.*;
public class List1
{
    public static void main( String[] args )
    {
    	System.out.println("Set values .....");
        Set s1 = new HashSet();
        s1.add("1");
        s1.add("2");
        s1.add("3");
        s1.add("4");
		s1.add("7");
		s1.add("y79");
		System.out.println("the hashset is "+ s1);
    }   
	for (String temp : s1){
        	System.out.println(temp);
        }

        System.out.println("List values .....");
    	List a1 = new ArrayList(s1);

        for (String temp :a1){
        	System.out.println(temp);

}
}

