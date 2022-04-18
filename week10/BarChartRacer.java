import java.util.Arrays;

public class BarChartRacer
{
public static void main(String[] args)
{
In in = new In(args[0]);
int k = Integer.parseInt(args[1]);
int n;
StdDraw.setCanvasSize(1000, 700);
StdDraw.enableDoubleBuffering();
String t = in.readLine();
String xLabel = in.readLine();
String src = in.readLine();
BarChart chart = new BarChart(t, xLabel, src);
while (in.hasNextLine())
{
in.readLine();
n = Integer.parseInt(in.readLine());
Bar[] bar = new Bar[n];
for (int i = 0; i < n; i++)
{
String s = in.readLine();
String[] str = s.split(",", 5);
if (i < k)
chart.setCaption(str[0]);
bar[i] = new Bar(str[1], Integer.parseInt(str[3]), str[4]);
}
Arrays.sort(bar);
for (int i = n-1; i >= 0; i--)
{
if ((n-i) <= k)
chart.add(bar[i].getName(), bar[i].getValue(), bar[i].getCategory());
}
StdDraw.clear();
chart.draw();
StdDraw.show();
StdDraw.pause(100);
chart.reset();
}
}
}