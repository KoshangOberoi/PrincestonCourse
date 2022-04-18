public class Clock
{
private int hrs;
private int min;
public Clock(int h, int m)
{
if (h < 0 || h > 23)
throw new IllegalArgumentException("hours must be between 0 and 23");
if (m < 0 || m > 59)
throw new IllegalArgumentException("minutes must be between 0 and 59");
hrs = h;
min = m;
}
public Clock(String s)
{
int h, m;
if (s.length() != 5)
throw new IllegalArgumentException("wrong string length");
if (s.charAt(2) != ':')
throw new IllegalArgumentException("wring string format");
h = Integer.parseInt(s.substring(0,2));
m = Integer.parseInt(s.substring(3,5));
if (h < 0 || h > 23)
throw new IllegalArgumentException("hours must be between 0 and 23");
if (m < 0 || m > 59)
throw new IllegalArgumentException("minutes must be between 0 and 59");
hrs = h;
min = m;
}
public String toString()
{
if (hrs < 10 && min < 10)
return (('0' + Integer.toString(hrs) + ':' + '0' + Integer.toString(min)));
else if (hrs < 10)
return (('0' + Integer.toString(hrs) + ':' + Integer.toString(min)));
else if (min < 10)
return ((Integer.toString(hrs) + ':' + '0' + Integer.toString(min)));
else
return ((Integer.toString(hrs) + ':' + Integer.toString(min)));
}
public boolean isEarlierThan(Clock that)
{
if (this.hrs < that.hrs)
return true;
else if (this.hrs == that.hrs && this.min < that.min)
return true;
else
return false;
}
public void tic()
{
++this.min;
if (this.min > 59)
{
this.min = this.min%60;
++this.hrs;
}
if (this.hrs > 23)
this.hrs = this.hrs%24;
}
public void toc(int delta)
{
if (delta < 0)
throw new IllegalArgumentException("delta cant be negative");
this.min += delta;
if (this.min > 59)
{
this.hrs += (this.min/60);
this.min = this.min%60;
}
if (this.hrs > 23)
this.hrs = this.hrs%24;
}
public static void main(String[] args)
{
Clock c = new Clock(3, 45);
Clock t = new Clock("02:30");
System.out.println(c.toString());
System.out.println(t.isEarlierThan(c));
c.tic();
System.out.println(c.toString());
t.toc(90);
System.out.println(t.toString());
}
}