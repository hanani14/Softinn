import java.util.Scanner;
import java. util.*;

/*class vowel{

	int vCount = 0;
	public void vowel(char[] a)
	{
	char[] vol = new char[SIZE];
	if(a.charAt(t) == 'A'){


					  a++;
				 }
				  if(alpha.charAt(t) == 'E'){
					  e++;
				 }
				  if(alpha.charAt(t) == 'I'){
					  i++;
				 }
				  if(alpha.charAt(t) == 'O'){
					  o++;
				 }
				  else (alpha.charAt(t) == 'U'){
					  u++;
				 }
	}
}*/




public class TestString{
	public static void main(String[] args){

	int a=0, e=0, i=0, o=0, u=0;
	int SIZE  = 50;
//	int[][] vol = new int[SIZE][SIZE];
//	int[][] con = new int[SIZE][SIZE];
//	int[][] longconst = new int[SIZE][SIZE];
//	int[][] longvol = new int[SIZE][SIZE];
//	int[][] nonalpha= new int[100][100];
	int numVow = 0;
	int numConst = 0;
	int numNon = 0;

	Scanner in = new Scanner(System.in);
	System.out.print("Insert Text: (press 'Return' to mark end of input)\n");
	String input = in.nextLine();

	input = input.toUpperCase();


	//vowel
	for( int t= 0; t<input.length(); t++)
	{
			if (input.charAt(t) == 'A' || input.charAt(t) == 'E' || input.charAt(t) == 'I' || input.charAt(t) == 'O' || input.charAt(t) == 'U')
			{
				 numVow++;
			}
            //consonant
            else if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z')
	     	{
	             numConst++;
            }
            //non alphabet
            else if (Character.isSpaceChar(input.charAt(i)))
			{
				  numNon++;
            }

	}
	LongestWordLength longest = new LongestWordLength(input);

	System.out.println("Number of vowels: " + numVow);
	System.out.println("Number of consonants: " + numConst);
	System.out.println("Other Characters: " + numNon);
	System.out.println("The longest word: " + longest);
}}

class LongestWordLength{

	public LongestWordLength(String str)
	{
		String[] longest = new String[50] ;
		 String[] words = str.split(" ");
		 int length = 0;

				for(String word:words){
					if(length < word.length()){
						length = word.length();
						longest=words;
					}
				}
		System.out.println("The longest word: " + length);
	}
}