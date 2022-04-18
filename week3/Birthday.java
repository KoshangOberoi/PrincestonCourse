/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Birthday
{
public static void main(String[] args) {
int n = Integer.parseInt(args[0]);
int trials = Integer.parseInt(args[1]);
boolean[] track = new boolean[n];
int[] count = new int[n+2];
double fraction = 0.0;
int date;
int flag;
for (int i = 0; i < trials; i++)
{
flag = 1;
for (int j = 0; flag == 1; j++)
{
date = (int) (Math.random()*n);
if (track[date])
{
flag = 0;
count[j]++;
}
else
track[date] = true;
}
for (int k = 0; k < n; k++)
{
track[k] = false;
}
}
for (int l = 0; fraction < 0.5; l++)
{
System.out.print(l+1 + "\t");
System.out.print(count[l] + "\t");
fraction += (double) count[l]/(double) trials;
System.out.print(fraction + "\n");
}
}
}