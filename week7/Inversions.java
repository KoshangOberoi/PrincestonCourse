public class Inversions 
{
public static long count(int[] a)
{
long c = 0;
for (int i = 0; i < a.length; i++)
for (int j = 0; j < a.length; j++)
if (i < j && a[i] > a[j])
c++;
return c;
}
public static int[] generate(int n, long k)
{
int j = 0;
int[] a = new int[n];
for (int i = 0; i < a.length; i++)
{
if (k >= n-1)
{
a[i] = n-1;
k = k-(n-1);
n--;
}
else
{
if (i == a.length-k-1)
{
a[i] = (int) (j+k);
}
else
{
a[i] = j;
j++;
}
}
}
return a;
}
public static void main(String[] args)
{
int n = Integer.parseInt(args[0]);
long k = Long.parseLong(args[1]);
int[] a = new int[n];
a = generate(n, k);
for (int i = 0; i < a.length; i++)
{
System.out.print(a[i]);
System.out.print(" ");
}
}
}