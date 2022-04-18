public class Minesweeper
{
public static void main(String[] args) {
int m = Integer.parseInt(args[0]);
int n = Integer.parseInt(args[1]);
int k = Integer.parseInt(args[2]);
int a;
char count = '0';
char[][] mine = new char[m+2][n+2];
for (int i = 0; i < k; i++)
{
a = (int) (Math.random()*(m*n));
if (mine[(a/n)+1][(a%n)+1] == '*')
k++;
else
mine[(a/n)+1][(a%n)+1] = '*';
}
for (int x = 1; x <= m; x++)
{
for (int y = 1; y <= n; y++)
{
if (mine[x][y] != '*')
{
if (mine[x+1][y] == '*')
count++;
if (mine[x+1][y-1] == '*')
count++;
if (mine[x+1][y+1] == '*')
count++;
if (mine[x][y+1] == '*')
count++;
if (mine[x][y-1] == '*')
count++;
if (mine[x-1][y] == '*')
count++;
if (mine[x-1][y+1] == '*')
count++;
if (mine[x-1][y-1] == '*')
count++;
mine[x][y] = count;
}
System.out.print(mine[x][y] + "  ");
count = '0';
}
System.out.print('\n');
}
}
}