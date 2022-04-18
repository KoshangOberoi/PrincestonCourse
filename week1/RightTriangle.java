/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class RightTriangle
{
public static void main(String[] args) {
long a = Integer.parseInt(args[0]);
long b = Integer.parseInt(args[1]);
long c = Integer.parseInt(args[2]);
boolean istriangle;
istriangle = ((a*a) + (b*b) == (c*c)) || ((a*a) + (c*c) == (b*b)) || ((b*b) + (c*c) == (a*a));
istriangle = istriangle && ((a > 0) && (b > 0) && (c > 0));
System.out.println(istriangle);
}
}
