public class ThreeSort
{
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int total = a+b+c;
		int x = (int) (Math.min(Math.min(a, b), c));
		int z = (int) (Math.max(Math.max(a, b), c));
		int y = total-(x+z);
		System.out.println(x + " " + y + " " + z);
	}
}
