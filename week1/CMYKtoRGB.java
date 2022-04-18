/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class CMYKtoRGB
{
public static void main(String[] args) {
double c = Double.parseDouble(args[0]);
double m = Double.parseDouble(args[1]);
double y = Double.parseDouble(args[2]);
double k = Double.parseDouble(args[3]);
double white = 1.0-k;
long r = Math.round(255.0*white*(1.0-c));
long g = Math.round(255.0*white*(1.0-m));
long b = Math.round(255.0*white*(1.0-y));
System.out.println("red   = " + r);
System.out.println("green = " + g);
System.out.println("blue  = " + b);
}
}
