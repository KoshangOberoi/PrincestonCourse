public class TrinomialDP
{
public static long trinomial(int n, int k)
{
if (n == 0 && k == 0)
return 1;
if (n < k || k < -n)
return 0;
k = Math.abs(k);
long[][] t = new long[n+k+1][n+k+1];
t[0][0] = 1;
for (int i = 1; i <= n+k; i++)
{
for (int j = 0; j < k+n; j++)
{
if (j == 0)
t[i][j] = 2*t[i-1][j+1]+t[i-1][j];
else
t[i][j] = t[i-1][j-1]+t[i-1][j]+t[i-1][j+1];
}
}
return t[n][k];
}
public static void main(String[] args)
{
int n = Integer.parseInt(args[0]);
int k = Integer.parseInt(args[1]);
System.out.println(trinomial(n, k));
}
}