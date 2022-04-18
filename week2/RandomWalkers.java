public class RandomWalkers
{
public static void main(String[] args) {
int r = Integer.parseInt(args[0]);
int trials = Integer.parseInt(args[1]);
int x = 0;
int y = 0;
long steps = 0;
double avgSteps = 0.0;
double random = 0.0;
int distance = 0;
for (int i = 1; i <= trials; i++)
{
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
}
distance = 0;
x = 0;
y = 0;
}
avgSteps = (double)steps/(double)trials;
System.out.println("average number of steps = " + avgSteps);
}
}