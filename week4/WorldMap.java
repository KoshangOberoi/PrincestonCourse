public class WorldMap
{
public static void main(String[] args) 
{
StdDraw.enableDoubleBuffering();
int width = StdIn.readInt();
int height = StdIn.readInt();
StdDraw.setCanvasSize(width, height);
StdDraw.setXscale(0.0, (double) width);
StdDraw.setYscale(0.0, (double) height);
int nvertices;
double[] x;
double[] y;
while (!StdIn.isEmpty())
{
StdIn.readString();
nvertices = StdIn.readInt();
x = new double[nvertices];
y = new double[nvertices];
int i = 0;
while (i < nvertices)
{
x[i] = StdIn.readDouble();
y[i] = StdIn.readDouble();
i++;
}
StdDraw.polygon(x, y);
}
StdDraw.show();
}
}