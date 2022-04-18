public class UniformRandomNumbers {
    public static void main(String args[]) {
     double a = Math.random();
     double b = Math.random();
     double min = Math.min(a, b);
     double max = Math.max(a, b);
     double c = Math.random();
     min = Math.min(min, c);
     max = Math.max(max, c);
     double d = Math.random();
     min = Math.min(min, d);
     max = Math.max(max, d);
     double e = Math.random();
     min = Math.min(min, e);
     max = Math.max(max, e);
     double avg = (a+b+c+d+e)/5.0;
     System.out.println("Uniform random numbers between 0 to 1 : " + a + " " + b + " " + c + " " + d + " " + e + " ");
     System.out.println("Average : " + avg);
     System.out.println("Minimum value : " + min);
     System.out.println("Maximum value : " + max);
    }
}
