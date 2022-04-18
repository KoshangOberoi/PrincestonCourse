public class Huntingtons
{
public static int maxRepeats(String dna)
{
int count = 0;
int max = 0;
for (int i = 0; i < dna.length()-2; i++)
{
if (dna.substring(i, i+3).equals("CAG"))
{
count++;
i+=2;
if(max < count)
max = count;
}
else
count = 0;
}
return max;
}
public static String removeWhitespace(String s)
{
String t;
t = s.replace(" ","");
t = t.replace("\n", "");
t = t.replace("\t","");
return t;
}
public static String diagnose(int maxRepeats)
{
if (maxRepeats >= 181)
{
return("not human");
}
else if (maxRepeats >= 40)
{
return("Huntington’s");
}
else if (maxRepeats >= 36)
{
return("high risk");
}
else if (maxRepeats >= 10)
{
return("normal");
}
else
return ("not human");
}
public static void main(String[] args)
{
String filename = args[0];
In in = new In(filename);
String s = in.readAll();
String t = removeWhitespace(s);
int maxCount = maxRepeats(t);
System.out.println("max repeats = " + maxCount);
System.out.println(diagnose(maxCount));
}    
}
