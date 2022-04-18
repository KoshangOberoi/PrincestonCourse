public class ColorHSB
{
private final int hue;
private final int sat;
private final int bright;
public ColorHSB(int h, int s, int b)
{
if (h < 0 || h > 359)
throw new IllegalArgumentException("the hue must be between 0 and 359");
if (s < 0 || s > 100)
throw new IllegalArgumentException("the saturation must be between 0 and 100");
if (b < 0 || b > 100)
throw new IllegalArgumentException("the brightness must be between 0 and 359");
hue = h;
sat = s;
bright = b;
}
public String toString()
{
String s;
s = ('(' + Integer.toString(hue) + ", " + Integer.toString(sat) + ", " + Integer.toString(bright) + ')');
return s;
}
public boolean isGrayscale()
{
if (sat == 0 || bright == 0)
return true;
return false;
}
public int distanceSquaredTo(ColorHSB that)
{
if (that == null)
throw new IllegalArgumentException("argument provided to method distanceSquaredTo(ColorHSB) is null");
int temp;
if (hue > that.hue)
temp = hue - that.hue;
else
temp = that.hue - hue;
temp = Math.min((temp*temp), ((360-temp)*(360-temp)));
temp += ((sat-that.sat)*(sat-that.sat) + (bright-that.bright)*(bright-that.bright));
return temp;
}
public static void main(String[] args)
{
int h = Integer.parseInt(args[0]);
int s = Integer.parseInt(args[1]);
int b = Integer.parseInt(args[2]);
ColorHSB c = new ColorHSB(h, s, b);
String name = null, closest = null, color = null;
int hu, sa, br, minDis = -1, dis;
while (!StdIn.isEmpty())
{
name = StdIn.readString();
hu = StdIn.readInt();
sa = StdIn.readInt();
br = StdIn.readInt();
ColorHSB t = new ColorHSB(hu, sa, br);
dis = c.distanceSquaredTo(t);
if (minDis == -1)
{
closest = name;
minDis = dis;
color = t.toString();
}
else if (dis < minDis)
{
closest = name;
minDis = dis;
color = t.toString();
}
}
System.out.print(closest + ' ' + color);
}   
}