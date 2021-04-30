package lectutre.CoreJavaAssignment;
import java.io.*;
import java.util.Scanner;
public class Assignment_12_5_Count
{
	
	public static void main(String[] args) throws IOException {
	    BufferedReader in = new BufferedReader(new FileReader("test.txt"));
	    Scanner sc = new Scanner(System.in);
	    System.out.println("ENTER THE SUBSTRING U ARE LOOKING FOR:");
	    String word = sc.next();
	    String line = in.readLine();
	    System.out.println(line);
	    System.out.println("\n");
	    int count = 0;
	    do {
	    count =count+ (line.length() - line.replace(word, "").length()) / word.length();
	    line = in.readLine();
	    } while (line != null);
	    System.out.print("THE OCCURRANCE OF ''" + word + "'' IS ''" + count + "'' TIMES IN THE ABOVE LINE. ");
	}
}
/*
for (int i = 0; i < word.length(); i++) { count += (line.length() - line.replace(word, "").length()) / word.length(); }
*/