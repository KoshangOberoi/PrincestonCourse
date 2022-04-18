/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Kary
{
	public static void main(String[] args) {
	    long i = Long.parseLong(args[0]);
	    int k = Integer.parseInt(args[1]);
	    int divider;
	    long temp = i;
	    int j = 0;
	    int remainder;
	    String result = "";
	    while (temp != 0)
	    {
	        temp /= k; 
	        j++;
	    }
	    temp = i;
	    for (int x = j-1; x >= 0; x--)
	    {   
	        divider = (int) (Math.pow((double) k, (double) x));
	        remainder = (int) (temp/(long)divider);
	        switch (remainder)
	        {
	            case 0 :
	              result += "0";
	              break;
	            case 1 :
	              result += "1";
	              break;
	            case 2 :
	              result += "2";
	              break;
	            case 3 :
	              result += "3";
	              break;
	            case 4 :
	              result += "4";
	              break;
	            case 5 :
	              result += "5";
	              break;
	            case 6 :
	              result += "6";
	              break;
	            case 7 :
	              result += "7";
	              break;
	            case 8 :
	              result += "8";
	              break;
	            case 9 :
	              result += "9";
	              break;
	            case 10 :
	              result += "A";
	              break;
	            case 11 :
	              result += "B";
	              break;
	            case 12 :
	              result += "C";
	              break;
	            case 13 :
	              result += "D";
	              break;
	            case 14 :
	              result += "E";
	              break;
	            case 15 :
	              result += "F";
	              break;
	        }
	        
	        temp = (i%(long) (divider));
	    }
	    System.out.println(i + " to base " + k + " is : " + result);
	}
}
