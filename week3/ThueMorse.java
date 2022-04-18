public class ThueMorse
{
public static void main(String[] args) {
int n = Integer.parseInt(args[0]);
int[] thue = new int[n];
char[][] thueM = new char[n][n];
int i = 0, j = 0, k = 0;
int r;
while (j != n)
{
k = 0;
r = (int) (Math.pow(2.0, (double) i)); 
for (j = r; j < (2*r); j++)
{
if (j == n)break;
else
{
if (thue[k] == 0)
thue[j] = 1;
else
thue[j] = 0;
k++;
}
}
i++;
}
for (i = 0; i < n; i++)
{
for (j = 0; j < n; j++)
{
if (thue[i] == thue[j])
thueM[i][j] = '+';
else 
thueM[i][j] = '-';
System.out.print(thueM[i][j] + "  ");
}
System.out.print("\n");
}
}
}
