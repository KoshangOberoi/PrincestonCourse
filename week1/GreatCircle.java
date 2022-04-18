/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class GreatCircle
{
public static void main(String[] args) {
double x1 = Double.parseDouble(args[0]);
double y1 = Double.parseDouble(args[1]);
double x2 = Double.parseDouble(args[2]);
double y2 = Double.parseDouble(args[3]);
x1 = Math.toRadians(x1);
y1 = Math.toRadians(y1);
x2 = Math.toRadians(x2);
y2 = Math.toRadians(y2);
double distance;
double rootTerm;
rootTerm = ((Math.sin((x2-x1)/2.0))*(Math.sin((x2-x1)/2.0))) + ((Math.cos(x1))*(Math.cos(x2))*(Math.sin((y2-y1)/2.0))*(Math.sin((y2-y1)/2.0)));
distance = 2.0*6371.0*(Math.asin(Math.sqrt(rootTerm)));
System.out.println(distance + " kilometers");
}
}
