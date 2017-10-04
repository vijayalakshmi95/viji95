class Mul
{
public static void main(String[] args)
{
String[][] names={{"mr","mrs","ms"},{"c","v"}};
for(int i=0;i<=2;i++)
{
for(int j=0;j<=i;j++)
{
System.out.println(names[i][j]+names[i+1][j]);
}
}