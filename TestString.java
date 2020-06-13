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
	int[][] vol = new int[SIZE][SIZE];
//	int[][] con = new int[SIZE][SIZE];
//	int[][] longconst = new int[SIZE][SIZE];
//	int[][] longvol = new int[SIZE][SIZE];
//	int[][] nonalpha= new int[100][100];
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

/*class Vowel{
	String[][] alpha;
	int a=0, e=0, i=0, o=0, u=0;
	public char Word(char[] str, int count)
	{
		//for(int tt=0; t<count;tt++){
		for(int t=0; t<count;t++)
		if(str.charAt(tt) == 'A'){
			alpha[t] = str.charAt(t);
		  	t++;
		 // 	alpha[tt][t] = a++;
		 }
		if(alpha.charAt(tt) == 'E'){
			alpha[t] = str.charAt(t);
			t++;
		  //	alpha[tt][t] = e++;
		 }
		if(alpha.charAt(tt) == 'I'){
			alpha[t] = str.charAt(t);
			t++;
		  //	alpha[tt][t] = i++;
		 }
		 if(alpha.charAt(tt) == 'O'){
			alpha[t] = str.charAt(t);
			t++;
		  	//alpha[tt][t] = o++;
		 }
		 else if(alpha.charAt(tt) == 'U'){
			 alpha[t] = str.charAt(t);
			 t++;
		  //	alpha[tt][t] = u++;
		 }
		 return alpha[],count;
	}

}*/