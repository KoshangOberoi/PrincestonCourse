public class RevesPuzzle
{
private static void reve(int n, char src, char dst, char aux1, char aux2)
{
if (n == 1) 
{
System.out.println("Move disc " + n + " from " + src + " to " + aux2);
return;
}
int k = (int) Math.round((n+1)-(Math.sqrt(2*n+1)));
reve(k, src, aux2, aux1, dst);
hanoi(n, k, src, aux2, aux1);
reve(k, dst, src, aux1, aux2);
}
private static void hanoi(int n, int k, char src, char dst, char aux)
{
if (n == k)
return;
hanoi(n-1, k, src, aux, dst);
System.out.println("Move disc " + n + " from " + src + " to " + dst);
hanoi(n-1, k, aux, dst, src);
}
public static void main(String[] args) {
int n = Integer.parseInt(args[0]);
reve(n, 'A', 'B', 'C', 'D');
}
}