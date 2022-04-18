/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class GeneralizedHarmonic
{
public static void main(String[] args) {
int n = Integer.parseInt(args[0]);
int r = Integer.parseInt(args[1]);
double ghNumber = 0.0;
for (int i = 1; i <= n; i++)
ghNumber += 1.0/(Math.pow((double) i, (double) r));
System.out.println(ghNumber);
}
}
