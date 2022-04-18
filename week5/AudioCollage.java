public class AudioCollage
{
public static double[] amplify(double[] a, double alpha)
{
int n = a.length;
double [] c = new double[n];
for (int i = 0; i < n; i++)
{
c[i] = a[i]*alpha;
}
return c;
}
public static double[] reverse(double[] a)
{
int n = a.length;
double [] c = new double[n];
for (int i = 0; i < n; i++)
{
c[i] = a[((n-1)-i)];
}
return c;
}
public static double[] merge(double[] a, double[] b)
{
int m = a.length;
int n = b.length;
double c[] = new double [m+n];
for (int i = 0; i < m+n; i++)
{
if (i < m)
c[i] = a[i];
else
c[i] = b[i-m];
}
return c;
}
public static double[] mix(double[] a, double[] b)
{
int m = a.length;
int n = b.length;
if (m >= n)
{
double [] c = new double[m];
for (int i = 0; i < m; i++)
{
if (i < n)
c[i] = a[i]+b[i];
else
c[i] = a[i];
}
return c;
}
else
{
double [] c = new double[n];
for (int i = 0; i < n; i++)
{
if (i < m)
c[i] = a[i]+b[i];
else
c[i] = b[i];
}
return c;
}
}
public static double[] changeSpeed(double[] a, double alpha)
{
int n = a.length;
n = (int) (n/alpha);
double [] c = new double[n];
for (int i = 0; i < n; i++)
{
c[i] = a[(int) (i*alpha)];
}
return c;
}
public static void main(String[] args)
{
double [] a = StdAudio.read("beatbox.wav");
double [] b = StdAudio.read("chimes.wav");
double [] c = StdAudio.read("harp.wav");
double [] d = StdAudio.read("piano.wav");
double [] e = StdAudio.read("scratch.wav");
StdAudio.play(amplify(reverse(b), 3.5));
StdAudio.play(merge(c, mix(changeSpeed(c, 1.5), changeSpeed(c, 0.75))));
StdAudio.play(merge(d, merge(changeSpeed(d, 0.5), merge(changeSpeed(d, 1.5), merge(reverse(d), changeSpeed(reverse(d), 0.5))))));
StdAudio.play(e);
StdAudio.play(merge(a, reverse(a)));
StdAudio.close();
}
}
