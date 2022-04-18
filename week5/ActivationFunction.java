public class ActivationFunction
{
public static double heaviside(double x)
{
if (Double.isNaN(x))
return Double.NaN;
else if (x < 0)
return 0.0;
else if (x == 0)
return 0.5;
else
return 1.0;
}
public static double sigmoid(double x)
{
if (Double.isNaN(x))
return Double.NaN;
else
{
x = (1.0/(1.0+Math.exp((-x))));
return x;
}
}
public static double tanh(double x)
{
if (Double.isNaN(x))
return Double.NaN;
else if (x > -20 && x < 20)
{
x = ((Math.exp(x)-Math.exp((-x)))/((Math.exp(x)+Math.exp((-x)))));
return x;
}
else if (x <= -20)
return (-1.0);
else
return (1.0);
}
public static double softsign(double x)
{
if (Double.isNaN(x))
return Double.NaN;
else if (x == Double.POSITIVE_INFINITY)
return 1.0;
else if (x == Double.NEGATIVE_INFINITY)
return (-1.0);
else
{
x = (x/(1.0+Math.abs(x)));
return x;
}
}
public static double sqnl(double x)
{
if (Double.isNaN(x))
return Double.NaN;
else if (x <= -2)
return (-1.0);
else if (x > -2 && x < 0)
{
x = (x+((x*x)/4.0));
return x;
}
else if (x >= 0 && x < 2)
{
x = (x-((x*x)/4.0));
return x;
}
else
return 1.0;
}
public static void main(String[] args)
{
double x = Double.parseDouble(args[0]);
System.out.println("heaviside" + "(" + x + ")" + " = " + heaviside(x));
System.out.println("sigmoid" + "(" + x + ")" + " = " + sigmoid(x));
System.out.println("tanh" + "(" + x + ")" + " = " + tanh(x));
System.out.println("softsign" + "(" + x + ")" + " = " + softsign(x));
System.out.println("sqnl" + "(" + x + ")" + " = " + sqnl(x));
}
}