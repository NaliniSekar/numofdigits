# numofdigits
class a
{
Public static void main(String args[])
{
int count=0;
System.out.println("enter num");
Scanner in = new Scanner();
int b=in.nextInt();
while(b>0)
{
b=b/10;
count++;
}
System.out.println("result:"+count);
}
