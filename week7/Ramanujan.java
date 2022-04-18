public class Ramanujan
{
public static boolean isRamanujan(long n)
{
long a3, b3, ncuberoot, temp;
int count = 0;
ncuberoot = (long) Math.floor(Math.cbrt(n));
for (long i = ncuberoot; i > 0; i--)
{
a3 = i*i*i;
b3 =  n-a3;
temp = Math.round(Math.cbrt(b3));
b3 = temp*temp*temp;
if (a3+b3 == n)
{
count++;
}
if (count >= 4)
return true;
}
return false;
}
public static void main(String[] args)
{
long n = Long.parseLong(args[0]);
System.out.println(isRamanujan(n));
}
}