import java.util.Scanner;
import java. util.*;

public class TestString{
	public static void main(String[] args){

	int a=0, e=0, i=0, o=0, u=0;
	int SIZE  = 50;
	int[][] vol = new int[SIZE][SIZE];
	int numVow = 0;
	int numConst = 0;
	int numNon = 0;
	int space = 0;
	int dot = 0;

	LongestWordLength longest = new LongestWordLength();
	Scanner in = new Scanner(System.in);
	System.out.print("Insert Text: (press 'Return' to mark end of input)\n");
	String input = in.nextLine();

	input = input.toUpperCase();



	for( int t= 0; t<input.length(); t++)
	{		//vowel
			if (input.charAt(t) == 'A' || input.charAt(t) == 'E' || input.charAt(t) == 'I' || input.charAt(t) == 'O' || input.charAt(t) == 'U')
			{
				 numVow++;
			}
            //consonant
            else if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z')
	     	{
	             numConst++;
            }
			//space
			space = input.length() - input.replaceAll(" ", "").length();
			//dot
    		dot = input.length() - input.replace(".", "").length();


	}

	System.out.println();
	System.out.println("Number of vowels: " + numVow);
	System.out.println("Number of consonants: " + numConst);
	System.out.println("Other Characters: [blank space] " + space +" [.] " + dot);
	System.out.println("The longest word: " + longest.WordLength(input));

}}

class LongestWordLength{

	public String WordLength(String str)
	{
		String word;
		word = Arrays.stream(str.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null);
		return word;
	}
}

