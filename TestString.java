import java.util.Scanner;

public class TestString{
	public static void main(String[] args){

	int a=0, e=0, i=0, o=0, u=0;
	int SIZE  = 50;
	int[][] vol = new int[SIZE][SIZE];
	int[][] con = new int[SIZE][SIZE];
//	int[][] longconst = new int[SIZE][SIZE];
//	int[][] longvol = new int[SIZE][SIZE];
	int[][] nonalpha= new int[100][100];

	Scanner in = new Scanner(System.in);
	System.out.print("Insert Text: (press 'Return' to mark end of input)\n");
	String input = in.nextLine();

	input = input.toUpperCase();

	for (int tx=0; tx<input.length(); tx++)
	{
	//vowel
		for( int ty= 0; ty<2; ty++)
		 if (input.charAt(t) == 'A' || input.charAt(t) == 'E' || input.charAt(t) == 'I' || input.charAt(t) == 'O' || input.charAt(t) == 'U') {
			 if(input.charAt(t) == 'A'){
				vol[tx][ty] = input.charAt(t);

				  a++;
			 }
			  if(input.charAt(t) == 'E'){
				  e++;
			 }
			  if(input.charAt(t) == 'I'){
				  i++;
			 }
			  if(input.charAt(t) == 'O'){
				  o++;
			 }
			  if(input.charAt(t) == 'U'){
				  u++;
			 }

				}
            //consonant
            else if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z')
	     	{
	                    // Increments the consonant counter
	                   // cCount++;
            }
            //non alphabet
            else
			{
				                    // Increments the consonant counter
				                   // cCount++;
            }

	}}
	for(int ii = 0 ;ii<input.length(); ii++){
	 System.out.println("Vowels: " + vol[ii]);


	 }


	}}