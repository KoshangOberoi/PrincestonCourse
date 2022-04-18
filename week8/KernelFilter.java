import java.awt.Color;

public class KernelFilter
{
public static Picture identity(Picture picture)
{
int m = picture.width();
int n = picture.height();
Picture copy = new Picture(m, n);
int[][] arr = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
int red, green ,blue, a, b;
Color k, c;
for (int i = 0; i < n; i++)
{
for (int j = 0; j < m; j++)
{
red = 0;
blue = 0;
green = 0;
for (int x = 0; x < 3; x++)
{
for (int y = 0; y < 3; y++)
{
a = Math.floorMod(i+x-1, n);
b = Math.floorMod(j+y-1, m);
k = picture.get(b, a);
red += (k.getRed()*arr[x][y]);
blue += (k.getBlue()*arr[x][y]);
green += (k.getGreen()*arr[x][y]);
}
}
c = new Color(red, green ,blue);
copy.set(j, i, c);
}
}
return copy;
}

public static Picture gaussian(Picture picture)
{
int m = picture.width();
int n = picture.height();
Picture copy = new Picture(m, n);
int[][] arr = {{1, 2, 1}, {2, 4, 2}, {1, 2, 1}};
double red, green ,blue;
int a, b;
Color k, c;
for (int i = 0; i < n; i++)
{
for (int j = 0; j < m; j++)
{
red = 0.0;
blue = 0.0;
green = 0.0;
for (int x = 0; x < 3; x++)
{
for (int y = 0; y < 3; y++)
{
a = Math.floorMod(i+x-1, n);
b = Math.floorMod(j+y-1, m);
k = picture.get(b, a);
red += ((k.getRed()*arr[x][y])/16.0);
blue += ((k.getBlue()*arr[x][y])/16.0);
green += ((k.getGreen()*arr[x][y])/16.0);
}
}
red = Math.round(red);
blue = Math.round(blue);
green = Math.round(green);
red = red > 255.0 ? 255.0 : red;
blue = blue > 255.0 ? 255.0 : blue;
green = green > 255.0 ? 255.0 : green;
c = new Color((int) red, (int) green , (int) blue);
copy.set(j, i, c);
}
}
return copy;
}

public static Picture sharpen(Picture picture)
{
int m = picture.width();
int n = picture.height();
Picture copy = new Picture(m, n);
int[][] arr = {{0, -1, 0}, {-1, 5, -1}, {0, -1, 0}};
int red, green ,blue, a, b;
Color k, c;
for (int i = 0; i < n; i++)
{
for (int j = 0; j < m; j++)
{
red = 0;
blue = 0;
green = 0;
for (int x = 0; x < 3; x++)
{
for (int y = 0; y < 3; y++)
{
a = Math.floorMod(i+x-1, n);
b = Math.floorMod(j+y-1, m);
k = picture.get(b, a);
red += (k.getRed()*arr[x][y]);
blue += (k.getBlue()*arr[x][y]);
green += (k.getGreen()*arr[x][y]);
}
}
red = red > 255 ? 255 : red;
blue = blue > 255 ? 255 : blue;
green = green > 255 ? 255 : green;
red = red < 0 ? 0 : red;
blue = blue < 0 ? 0 : blue;
green = green < 0 ? 0 : green;
c = new Color(red, green , blue);
copy.set(j, i, c);
}
}
return copy;
}

public static Picture laplacian(Picture picture)
{
int m = picture.width();
int n = picture.height();
Picture copy = new Picture(m, n);
int[][] arr = {{-1, -1, -1}, {-1, 8, -1}, {-1, -1, -1}};
int red, green ,blue, a, b;
Color k, c;
for (int i = 0; i < n; i++)
{
for (int j = 0; j < m; j++)
{
red = 0;
blue = 0;
green = 0;
for (int x = 0; x < 3; x++)
{
for (int y = 0; y < 3; y++)
{
a = Math.floorMod(i+x-1, n);
b = Math.floorMod(j+y-1, m);
k = picture.get(b, a);
red += (k.getRed()*arr[x][y]);
blue += (k.getBlue()*arr[x][y]);
green += (k.getGreen()*arr[x][y]);
}
}
red = red > 255 ? 255 : red;
blue = blue > 255 ? 255 : blue;
green = green > 255 ? 255 : green;
red = red < 0 ? 0 : red;
blue = blue < 0 ? 0 : blue;
green = green < 0 ? 0 : green;
c = new Color(red, green , blue);
copy.set(j, i, c);
}
}
return copy;
}

public static Picture emboss(Picture picture)
{
int m = picture.width();
int n = picture.height();
Picture copy = new Picture(m, n);
int[][] arr = {{-2, -1, 0}, {-1, 1, 1}, {0, 1, 2}};
int red, green ,blue, a, b;
Color k, c;
for (int i = 0; i < n; i++)
{
for (int j = 0; j < m; j++)
{
red = 0;
blue = 0;
green = 0;
for (int x = 0; x < 3; x++)
{
for (int y = 0; y < 3; y++)
{
a = Math.floorMod(i+x-1, n);
b = Math.floorMod(j+y-1, m);
k = picture.get(b, a);
red += (k.getRed()*arr[x][y]);
blue += (k.getBlue()*arr[x][y]);
green += (k.getGreen()*arr[x][y]);
}
}
red = red > 255 ? 255 : red;
blue = blue > 255 ? 255 : blue;
green = green > 255 ? 255 : green;
red = red < 0 ? 0 : red;
blue = blue < 0 ? 0 : blue;
green = green < 0 ? 0 : green;
c = new Color(red, green , blue);
copy.set(j, i, c);
}
}
return copy;
}

public static Picture motionBlur(Picture picture)
{
int m = picture.width();
int n = picture.height();
Picture copy = new Picture(m, n);
int[][] arr = {{1, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 1, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 1, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 1, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 1, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1}};
double red, green ,blue;
int a, b;
Color k, c;
for (int i = 0; i < n; i++)
{
for (int j = 0; j < m; j++)
{
red = 0.0;
blue = 0.0;
green = 0.0;
for (int x = 0; x < 9; x++)
{
for (int y = 0; y < 9; y++)
{
a = Math.floorMod(i+x-4, n);
b = Math.floorMod(j+y-4, m);
k = picture.get(b, a);
red += ((k.getRed()*arr[x][y])/9.0);
blue += ((k.getBlue()*arr[x][y])/9.0);
green += ((k.getGreen()*arr[x][y])/9.0);
}
}
red = Math.round(red);
blue = Math.round(blue);
green = Math.round(green);
red = red > 255.0 ? 255.0 : red;
blue = blue > 255.0 ? 255.0 : blue;
green = green > 255.0 ? 255.0 : green;
c = new Color((int) red, (int) green , (int) blue);
copy.set(j, i, c);
}
}
return copy;
}

public static void main(String[] args)
{
Picture orig = new Picture(args[0]);
Picture copy1 = identity(orig);
Picture copy2 = gaussian(orig);
Picture copy3 = sharpen(orig);
Picture copy4 = laplacian(orig);
Picture copy5 = emboss(orig);
Picture copy6 = motionBlur(orig);
orig.show();
copy1.show();
copy2.show();
copy3.show();
copy4.show();
copy5.show();
copy6.show();
}   
}