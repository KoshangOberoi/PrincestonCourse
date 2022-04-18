public class  ShannonEntropy
{
public static void main(String[] args) {
int m = Integer.parseInt(args[0]);
int i, total = 0;
double se = 0.0;
boolean[] check = new boolean[m];
int[] count = new int[m];
while (!StdIn.isEmpty())
{
i = StdIn.readInt();
if (!check[i-1])
{
check[i-1] = true;
count[i-1]++;
}
else
count[i-1]++;
total++;
}
for (int j = 0; j < m; j++)
{
if (count[j] == 0)
se += 0.0;
else
se += ((double) (-count[j])/(double) (total))*(Math.log((double) (count[j])/(double) (total)) / Math.log(2));
}
StdOut.printf("%.4f\n", se);
}
}