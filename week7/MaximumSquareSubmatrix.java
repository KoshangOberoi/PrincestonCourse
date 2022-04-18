public class MaximumSquareSubmatrix
{
public static int size(int[][] a)
{
int max = 0;
int n = a.length;
int[][] b = new int[n][n];
for (int i = 0; i < n; i++)
{
for (int j = 0; j < n; j++)
{
if (i == 0 || j == 0)
b[i][j] = a[i][j];
else if(a[i][j] == 1)
{
b[i][j] = Math.min(Math.min(b[i][j-1], b[i-1][j]), b[i-1][j-1])+1;
}
else
{
b[i][j] = 0;
}
if (b[i][j] > max)
max = b[i][j];
}
}
return max;
}
public static void main(String[] args) {
int n = StdIn.readInt();
int[][] a = new int[n][n];
for (int i = 0; i < n; i++)
{
for (int j = 0; j < n; j++)
{
a[i][j] = StdIn.readInt();
}
}
System.out.println(size(a));
}
}