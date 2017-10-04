class EncapTest{
private String name;
private int id;
public String getName()
{
return name;
}
public int getId()
{
return id;
}
public void setName(String newName)
{
name=newName;
}
public void setId(int newId)
{
id=newId;
}}
class Run
{
public static void main(String args[])
{
EncapTest encap=new EncapTest();
encap.setName("viji");
encap.setId(23);
System.out.println("name :"+encap.getName()+"id:"+encap.getId());
}
}

