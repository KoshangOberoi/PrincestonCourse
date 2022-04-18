public class RandomWalker
{
public static void main(String[] args) {
int r = Integer.parseInt(args[0]);
int x = 0;
int y = 0;
int steps = 0;
int distance = 0;
double random = 0.0;
System.out.println("(" + x + ", " + y + ")");
while (distance != r)
{
random = Math.random();
if (random < 0.25)
{
x++;
steps++;
}
else
{
if (random < 0.50)
{
x--;
steps++;
}
else
{
if (random < 0.75)
{
y++;
steps++;
}
else
{
y--;
steps++;
}
}
}
distance = (Math.abs(x)+Math.abs(y)); 
System.out.println("(" + x + ", " + y + ")");
}
System.out.println("steps = " + steps);
}
}